package com.kata.Services;

import com.kata.Models.Todo;
import com.kata.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Nos ayudara a gestionar los datos antes de enviar los datos al controller */

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list() {
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }

    public void delete(Long id) {
        repository.delete(get(id));
    }

    public Todo get(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
