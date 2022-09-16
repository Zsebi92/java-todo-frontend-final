package com.example.backend.controller;

import com.example.backend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    private final ToDoService service;

    @Autowired
    public ToDoController(ToDoService service) {
        this.service = service;
    }




}
