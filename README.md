# Aulas das disciplinas de Programação para Web - PW44S - Turma 4SI-2025/2

O objetivo da disciplina é desenvolver aplicações Cliente-Servidor Web com acesso à Banco de Dados. Dominar os conceitos básicos da programação Cliente-Servidor para Internet e saber utilizá-los adequadamente no desenvolvimento de aplicativos dessa natureza.

Durante a disciplina será desenvolvida uma solução web composta por dois projetos uma API RESTful (*back-end*), localizado na pasta **server** deste repositório. E, um cliente web (*front-end*), localizado na pasta **client** deste repositório.

## Projeto *server*

O conteúdo do projeto é uma API RESTful desenvolvida com os *frameworks*  **Spring, Spring Boot, Spring Web e Spring Data**.

### ⚙️ Lista de Ferramentas

- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/java.png" alt="Java" title="Java"/> JDK 21 ou superior
- IDE:
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/intellij.png" alt="IntelliJ" title="IntelliJ"/> [IntelliJ Idea](https://www.jetbrains.com/idea/) ou 
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/eclipse.png" alt="eclipse" title="eclipse"/> [Eclipse](https://eclipseide.org/)
- SDBG:
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/postgresql.png" alt="PostgreSQL" title="PostgreSQL"/> Postgresql
- Ferramenta para testar a API:
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/postman.png" alt="Postman" title="Postman"/> Postman
    - <img width="20" src="https://icon.icepanel.io/Technology/svg/Insomnia.svg" alt="Insomnia" title="Insomnia"/> Insomnia
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/git.png" alt="Git" title="Git"/> Git
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/docker.png" alt="Docker" title="Docker"/> Docker

--- 

## Aplicação cliente (*front-end*)

O conteúdo do projeto é um cliente web desenvolvido com *framework* React.js, consumindo os recursos da API REST desenvolvida no projeto **server**.

### ⚙️ Lista de Ferramentas

- IDE:
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/visual_studio_code.png" alt="Visual Studio Code" title="Visual Studio Code"/> Visual Studio Code
    - <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/webstorm.png" alt="WebStorm" title="WebStorm"/> Web Storm, etc...
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/node_js.png" alt="Node.js" title="Node.js"/> Node.js
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/npm.png" alt="npm" title="npm"/> npm
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/git.png" alt="Git" title="Git"/> Git
- <img width="20" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/docker.png" alt="Docker" title="Docker"/> Docker

# 💹 Avaliação da disciplina:

## 🏪 Projeto da disciplina - Aplicação de Comércio Eletrônico

Neste projeto, os alunos terão a oportunidade de aplicar seus conhecimentos em desenvolvimento web para criar uma aplicação web de comércio eletrônico. O objetivo é desenvolver uma plataforma de compras online funcional. Os alunos serão desafiados a implementar uma variedade de recursos essenciais para um site de *e-commerce*, incluindo catálogo de produtos, página individual de produtos, carrinho de compras, processamento de pedidos, entre outros. A solução deverá ser dividida entre uma API Rest desenvolvida com o *framework* Spring e um cliente desenvolvido com o *framework* React.

### 🗒️ Escopo do projeto
 
O site de comércio eletrônico desenvolvido como projeto final deverá exibir todos os produtos ofertados mesmo que o cliente não esteja autenticado na aplicação. Cada produto também deverá poder ser exibido em uma página única com os detalhes desse produto, como a descrição e preço, por exemplo. Os clientes deverão poder filtrar os produtos por categoria.

Os clientes deverão poder adicionar produtos em um carrinho de compras. O carrinho de compras deve possibilitar editar a quantidade de produtos, a remoção de um produto ou a remoção de todos os produtos. O carrinho de compras deve estar disponível mesmo para clientes não autenticados. 

Os clientes que desejarem finalizar uma compra deverão estar cadastrados e autenticados no sistema. Ou seja, ao finalizar compra caso o cliente não esteja autenticado, deverá ser exibida uma página para autenticação. Caso o cliente não esteja cadastrado a página de autenticação deve possuir um atalho para uma página de cadastro. Após cadastrado e autenticado o cliente poderá finalizar sua compra.

Antes de finalizar a compra, deverá ser exibida uma tela de confirmação de endereço e dos itens comprados. Nessa tela o cliente deverá selecionar o endereço de entrega do pedido caso já tenha o endereço cadastrado. Caso necessário esse cliente poderá cadastrar um novo endereço. O cliente também deverá informar um método de pagamento, e após todos os dados preenchidos poderá finalizar o pedido.

Os clientes deverão poder consultar seu histórico de compras com a lista dos produtos comprados.

##### Sugestão de entidades com base no escopo:
- Usuário = {id: Long, nome: String, senha: String, email: String}
- Categoria = {id: Long, nome: String}
- Produto = {id: Long, nome: String, descricao: String, preço: BigDecimal, urlImagem: String, categoriaId: Long}
- Pedido = {id: Long, data: DateTime, usuarioId: Long}
- ItensDoPedido = {pedidoId: Long, produtoId: Long, preço: BigDecimal, quantidade: Integer}
- *Enderecos {id: Long, usuarioId: Long, logradouro: String, complemento: String, cep: String...}

---

#### 📊 Requisitos mínimos:
1. A aplicação deverá conter uma página para listar todos os produtos, utilizar como exemplo os sites de compra disponíveis na internet, a lista de produtos deve conter o nome, valor e a imagem do produto (** a imagem pode vir de uma URL externa).
2. A aplicação deve conter uma página para exibir um produto com detalhes, apresentando o nome, valor, descrição, imagem e botão para adicionar em uma lista de compras.
3. A aplicação deve conter uma página que representa o carrinho de compras, essa tela vai listar os itens adicionados na lista de compras, com a possibilidade de ajustar a quantidade dos itens adicionados e um botão para ir para tela de finalizar compra.
4. Para finalizar a compra é necessário estar autenticado, para isso criar uma tela para cadastro de cliente (usuário) e uma tela para autenticação, clientes com o mesmo nome de usuário não devem ser permitidos.
5. Após autenticado exibir a tela com o resumo da compra e um botão para finalizar a compra, nessa etapa os dados devem ser enviados ao servidor e a compra deve ser finalizada.
6. A página de lista de produtos, produto individual e carrinho de compras devem ser exibidas para todos os usuários, mesmo não autenticados.

#### 📈 Requisitos extras:
7. Criar uma página para listar os pedidos realizados pelo usuário.
8. Permitir filtrar os produtos por categoria.
9. Criar paginação para a página com a lista de produtos.
10. Permitir o cadastro de mais de um endereço de entrega para o usuário
11. Para auxiliar no preenchimento do cadastro de endereço utilizar algum serviço de consulta a Código de Endereçamento Postal (CEP) do Brasil, por exemplo o ViaCEP. 
12. Possibilicar o calculo do frete utilizando API externa.

#### 📎 Observações:
- Não será necessário criar tela ou *endpoints* na API para o cadastro de produtos e categorias, esses podem vir diretamente do banco de dados utilizando o arquivo **import.sql**.
- Criar casos de teste na API, os casos devem ser criados a critério do desenvolvedor. Não será necessário cobrir todos os endpoints da API. Sugestão: criar 5 casos de teste.

---

## 📆 Prazos de entrega:

#### 📌 Primeira entrega: 22/09/2025 (Peso 0.15)
**Apresentações nos dias 22/09/2025 e 23/09/2025**

A primeira entrega considera apenas o lado **servidor** da aplicação, ou seja, a API RESTful desenvolvida com o *framework* Spring Boot. A apresentação dos *endpoints* da API será via requisições HTTP utilizando o Postman ou Insomnia, juntamente com a defesa do código-fonte desenvolvido.

Funcionalidades do *back-end* que devem estar prontas na primeira entrega:

 - Lista de categorias
 - Lista de produtos (** A imagem do produto pode ser apenas uma URL da Web, não sendo necessário armazenar a imagem no banco de dados.)
 - Produto pelo ID
 - Cadastro de Usuário
 - Autenticação
 - Cadastro de Endereços (do usuário autenticado)
 - Cadastro de Pedidos (do usuário autenticado)
 - Lista de Pedidos (do usuário autenticado)

|Atividade | Peso |
|--|--|
|Lista de categorias | 0,50 |
|Lista de produtos |0,50|
|Produto pelo ID | 0,50 |
|Cadastro de Usuário, autenticação e autorização | 0,50 |
|Finalizar compra | 4,00 |
|Listar os pedidos realizados | 2,00 |
|Permitir cadastrar múltiplos endereços | 2,00 |
|**Total** | **10.0**|

** Recomendações: Criar um arquivo `import.sql` com cadastros de categorias, produtos, usuários, endereços e pedidos.

--- 

#### 📌 Entrega final: 02/12/2025 (Peso 0.75)
**Apresentações nos dias 02/12/2025 a 09/12/2025**
Nessa entrega as aplicações cliente e servidor devem ser apresentadas. O servidor pode ter sofrido modificações durante o processo de desenvolvimento do cliente, por isso deve ser apresentado novamente. Os projetos cliente e servidor deverão ser executados e as funcionalidades desenvolvidas deverão ser apresentadas juntamente com a defesa do código-fonte desenvolvido.

#### Avaliação final distribuída por funcionalidade:

|Atividade | Peso |
|--|--|
|Lista de Produtos| 0,25 |
|Página individual de Produto|0,25|
|Carrinho de Compras | 2,50 |
|Cadastro de Usuário, autenticação e autorização | 1,00 |
|Finalizar compra | 2,50 |
|Listar os pedidos realizados | 1,00 |
|Permitir filtrar os produtos por categoria | 0,50 |
|Permitir cadastrar múltiplos endereços | 1,00 |
|Utilizar serviço web de busca de CEP e Cálculo de frete | 1,00 |
|**Total** | **10.0**|
