package com.zidio.task_management.model;

import lombok.Data;

@Data
public class TaskDto {
	private String title;
    private String description;
    private String dueDate;
    private Long assignedUserId;

}
