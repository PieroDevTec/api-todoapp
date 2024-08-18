package com.companyksi.todoapp.app.services;

import com.companyksi.todoapp.app.models.Todoapp;

import java.util.List;
import java.util.Optional;

public interface TodoappService {
    List<Todoapp> todoappList();
    Optional<Todoapp> todoappTodo(long cod);
    Todoapp todoappRegister(Todoapp todo);
    Todoapp todoappUpdate (Todoapp todo);
    void todoDelete(long cod);
}
