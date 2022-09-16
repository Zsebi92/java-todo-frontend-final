package com.example.backend.service;

import com.example.backend.model.ToDoElement;
import com.example.backend.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ToDoService {

    private ToDoRepo repo;


    @Autowired
    public ToDoService(ToDoRepo repo){
        this.repo = repo;
    }

    public List<ToDoElement> getAllToDos(){
        return repo.getAllToDos();
    }

    public ToDoElement postToDo(ToDoElement toDoElement){
        return repo.postToDo(getToDoId(toDoElement));
    }

    public ToDoElement editToDo(ToDoElement toDoElement) {
        return repo.editToDo(getToDoId(toDoElement));
    }

    public ToDoElement getToDoId(ToDoElement toDoElement){
        toDoElement.setId(UUID.randomUUID().toString());
        return toDoElement;
    }

    public ToDoElement getToDoId(String id) {
        return  repo.getToDoId(id);
    }



}
