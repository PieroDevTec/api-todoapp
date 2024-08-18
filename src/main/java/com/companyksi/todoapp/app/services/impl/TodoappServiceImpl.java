package com.companyksi.todoapp.app.services.impl;

import com.companyksi.todoapp.app.models.Todoapp;
import com.companyksi.todoapp.app.repositorys.TodoappRepository;
import com.companyksi.todoapp.app.services.TodoappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoappServiceImpl implements TodoappService {
    @Autowired
    TodoappRepository repo;
    @Override
    public List<Todoapp> todoappList() {
        return repo.findAll();
    }

    @Override
    public Todoapp todoappRegister(Todoapp todoapp) {
        return repo.save(todoapp);
    }

    @Override
    public Todoapp todoappUpdate(Todoapp todo) {
        return repo.save(todo);
    }

    @Override
    public void todoDelete(long cod) {
        repo.deleteById(cod);
    }


}
