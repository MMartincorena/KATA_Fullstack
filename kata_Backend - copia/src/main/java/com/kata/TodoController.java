package com.kata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired // Dependencia del service
    private TodoService service;

    // Listar
    @GetMapping(value = "api/todos")
    public Iterable<Todo> list() {
        return service.list();
    }

    //Guardar
    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo) {
        return service.save(todo);
    }

    //Actualizar
    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo) {
        if (todo.getId() != null) {
            return service.save(todo);
        }
        throw new RuntimeException("No existe el ID que desea actualizar");
    }

    //Eliminar por ID
    @DeleteMapping(value = "api/{id}/todos")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    //Obtener por ID
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Long id) {
        return service.get(id);
    }

}
