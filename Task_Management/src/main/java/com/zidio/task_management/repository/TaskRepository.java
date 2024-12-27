package com.zidio.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.task_management.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findTaskByTaskId(Long taskId);
}
