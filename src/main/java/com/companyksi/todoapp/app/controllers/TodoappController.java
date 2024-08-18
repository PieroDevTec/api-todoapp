package com.companyksi.todoapp.app.controllers;

import com.companyksi.todoapp.app.models.Todoapp;
import com.companyksi.todoapp.app.services.TodoappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoapp")
public class TodoappController {
    @Autowired
    TodoappService serv;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Todoapp> todoappList(){
        return  serv.todoappList();
    }

    @RequestMapping(value = "/todo/{cod}", method = RequestMethod.GET)
    public ResponseEntity<Todoapp> todoappTodo(@PathVariable long cod){
        return new ResponseEntity<Todoapp>(serv.todoappTodo(cod).get(),HttpStatus.OK);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity<Todoapp> todoappRegister(@RequestBody Todoapp todo){
        return new ResponseEntity<Todoapp>(serv.todoappRegister(todo),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public ResponseEntity<Todoapp> todoappUpdate(@RequestBody Todoapp todo){
        return new ResponseEntity<Todoapp>(serv.todoappUpdate(todo),HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{cod}",method = RequestMethod.DELETE)
    public ResponseEntity<String> todoappDelete(@PathVariable("cod") long cod){
        serv.todoDelete(cod);
        return new ResponseEntity<String>("Sucessfully Delete Cod: "+cod,HttpStatus.OK);
    }



}
