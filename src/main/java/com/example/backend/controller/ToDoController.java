package com.example.backend.controller;

import com.example.backend.model.ToDoElement;
import com.example.backend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    private final ToDoService service;


    @Autowired
    public ToDoController(ToDoService service) {
        this.service = service;
    }


    @GetMapping
    public List<ToDoElement> getAllToDos(){
        return service.getAllToDos();
    }

    @PostMapping()
    public ToDoElement postToDo(@RequestBody ToDoElement q){
        return service.postToDo(q);
    }

    @PutMapping("/edit")
    public ToDoElement editToDo(@RequestBody ToDoElement q){
        return service.editToDo(q);
    }

    @GetMapping("{id}")
    public ToDoElement getToDoById(@PathVariable String id){
        return service.getToDoId(id);
    }














}
