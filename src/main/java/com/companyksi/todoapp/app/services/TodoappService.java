package com.companyksi.todoapp.app.services;

import com.companyksi.todoapp.app.models.Todoapp;

import java.util.List;

public interface TodoappService {
    List<Todoapp> todoappList();
    Todoapp todoappRegister(Todoapp todo);
    Todoapp todoappUpdate (Todoapp todo);
    void todoDelete(long cod);
}
