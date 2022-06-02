package com.sofka.crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sofka.crud.models.TaskModel;

public interface TaskRepository extends CrudRepository<TaskModel, Long> {
}
