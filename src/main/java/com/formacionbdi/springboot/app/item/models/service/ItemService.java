package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();
    Item findById(Long id, Integer cantidad);

}
