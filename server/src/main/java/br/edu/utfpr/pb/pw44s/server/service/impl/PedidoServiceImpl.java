package br.edu.utfpr.pb.pw44s.server.service.impl;

import br.edu.utfpr.pb.pw44s.server.service.AuthService;

public class PedidoServiceImpl {

    private AuthService authService;

    /* Exemplo de como vincular o usuário autenticado
    ao pedido que irá ser salvo no banco de dados.
    A mesma lógica pode ser utilizada ao buscar um pedido
    Ou ao salvar/buscar um endereço
    private Pedido save(Pedido pedido) {

        pedido.setUser(authService.getAuthenticatedUser());
    }
     */
}
