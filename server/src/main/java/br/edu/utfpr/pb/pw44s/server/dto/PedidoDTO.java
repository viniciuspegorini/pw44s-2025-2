package br.edu.utfpr.pb.pw44s.server.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoDTO {
    private String formaPagamento;
    private String formaEntrega;

    // Buscar o usuário autenticado no SecurityContextHolder
    // Veio lá do AuthService getAuthenticatedUser()
    // private User user;

    // A data do pedido vai ficar no model apenas, gerada no back end ao realizar o pedido
    //private LocalDateTime dataPedido;

    List<ItemPedidoDTO> itensPedido;

    private EnderecoDTO endereco;
}
