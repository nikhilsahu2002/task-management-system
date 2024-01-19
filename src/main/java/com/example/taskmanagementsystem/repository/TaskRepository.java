package com.example.taskmanagementsystem.repository;

import com.example.taskmanagementsystem.API.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}