package com.companyksi.todoapp.app.controllers;

import com.companyksi.todoapp.app.models.Todoapp;
import com.companyksi.todoapp.app.services.TodoappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoapp")
public class TodoappController {
    @Autowired
    TodoappService serv;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Todoapp> todoappList(){
        return serv.todoappList();
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Todoapp todoappRegister(@RequestBody Todoapp todo){
        return serv.todoappRegister(todo);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public Todoapp todoappUpdate(@RequestBody Todoapp todo){
        return serv.todoappUpdate(todo);
    }
    @RequestMapping(value = "/delete/{cod}",method = RequestMethod.DELETE)
    public String todoappDelete(@PathVariable("cod") long cod){
        serv.todoDelete(cod);
        return "Delete Cod: "+cod+" Succesfully";
    }



}
