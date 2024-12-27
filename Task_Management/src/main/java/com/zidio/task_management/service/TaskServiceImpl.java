package com.zidio.task_management.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zidio.task_management.model.Task;
import com.zidio.task_management.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Set<Task> getTasks() {
        return new HashSet<>(taskRepository.findAll());
    }

    @Override
   
    public Task getTaskByTaskId(Long taskId) {
        return taskRepository.findById(taskId).get();
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public boolean removeTaskId(Long taskId) {
        try {
            taskRepository.deleteById(taskId);
            return true; // Deletion succeeded
        } catch (Exception e) {
            return false; // Deletion failed
        }
    }

}
