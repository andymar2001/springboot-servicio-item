package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return null;
    }

}
