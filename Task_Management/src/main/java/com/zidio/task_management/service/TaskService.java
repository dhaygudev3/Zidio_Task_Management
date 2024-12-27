package com.zidio.task_management.service;

import java.util.Set;

import com.zidio.task_management.model.Task;

public interface TaskService {

    public Task addTask(Task task);

    public Set<Task> getTasks();

    public Task getTaskByTaskId(Long taskId);

    public Task updateTask(Task task);

    public boolean removeTaskId(Long taskId);

}