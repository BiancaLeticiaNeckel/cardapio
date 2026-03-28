package com.pizzaria.cardapio.repository;

import com.pizzaria.cardapio.model.ItemCardapio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCardapioRepository extends JpaRepository<ItemCardapio,Long> {
}
