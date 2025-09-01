package br.edu.utfpr.pb.pw44s.server.controller;

import br.edu.utfpr.pb.pw44s.server.model.Category;
import br.edu.utfpr.pb.pw44s.server.respository.CategoryRepository;
import br.edu.utfpr.pb.pw44s.server.service.ICategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) {
        categoryService.save(category);
        URI location =  ServletUriComponentsBuilder
                            .fromCurrentRequest().path("/{id}")
                .buildAndExpand(category.getId()).toUri();
        return ResponseEntity.created(location).body(category);
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(this.categoryService.findAll());
    }

    @GetMapping("page")
    //http://localhost:8080/categories/page?page=0&size=10&order=id&asc=false
    public ResponseEntity<Page<Category>> findAll (
                                        @RequestParam int page,
                                        @RequestParam int size,
                                        @RequestParam(required = false) String order,
                                        @RequestParam(required = false) Boolean asc) {
        PageRequest pageRequest = PageRequest.of(page, size);
        if (order != null && asc != null) {
            pageRequest = PageRequest.of(page,
                                         size,
                                         asc ? Sort.Direction.ASC : Sort.Direction.DESC,
                                         order);
        }
        return ResponseEntity.ok(this.categoryService.findAll(pageRequest));
    }

    @GetMapping("{id}")
    // http://localhost:8080/categories/1
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = this.categoryService.findById(id);
        if (category == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(this.categoryService.findById(id));
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.categoryService.deleteById(id);
    }
}
