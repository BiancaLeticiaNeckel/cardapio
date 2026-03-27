package com.pizzaria.cardapio.controller;

import com.pizzaria.cardapio.model.ItemCardapio;
import com.pizzaria.cardapio.repository.ItemCardapioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class ItemCardapioController {

    private final ItemCardapioRepository repository;

    public ItemCardapioController(ItemCardapioRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<ItemCardapio> listar(){
        return repository.findAll();
    }

    @PostMapping
    public ItemCardapio adicionar(@RequestBody ItemCardapio item){
        return repository.save(item);
    }

    @PutMapping("/{id}")
    public ItemCardapio atualizar(@PathVariable Long id, @RequestBody ItemCardapio item){
        item.setId(id);
        return repository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
