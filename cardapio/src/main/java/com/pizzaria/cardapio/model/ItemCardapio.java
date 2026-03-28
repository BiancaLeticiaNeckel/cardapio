package com.pizzaria.cardapio.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemCardapio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    @Column(length = 500)
    private String descricao;
}
