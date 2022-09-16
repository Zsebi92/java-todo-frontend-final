package com.example.backend.repo;

import com.example.backend.model.ToDoElement;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ToDoRepo {


    private Map<String, ToDoElement> toDosList = new HashMap<>();

    public List<ToDoElement> getAllToDos(){
        return new ArrayList<ToDoElement>(toDosList.values());
    }

    public ToDoElement postToDo(ToDoElement toDoElement){
        toDosList.put(toDoElement.getId(), toDoElement);
        return toDoElement;
    }

    public ToDoElement editToDo(ToDoElement toDoElement) {
        toDosList.put(toDoElement.getId(), toDoElement);
        return toDoElement;
    }

    public ToDoElement getToDoId(String id) {
        return toDosList.get(id);
    }


}
