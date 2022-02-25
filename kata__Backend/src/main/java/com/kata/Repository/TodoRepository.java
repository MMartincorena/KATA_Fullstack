package com.kata.Repository;

import com.kata.Models.Todo;
import org.springframework.data.repository.CrudRepository;

/* clase Todo, tipo de datos del ID - LONG */
/* Todo lo relacionado al objeto CrudRepository hace mención a las funciones de un CRUD */
public interface TodoRepository extends CrudRepository<Todo, Long> {


}
