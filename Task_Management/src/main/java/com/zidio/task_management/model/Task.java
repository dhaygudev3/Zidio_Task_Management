package com.zidio.task_management.model;

import java.sql.Date;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private Long taskId;

	@Column(name = "task_name", nullable = false)
	private String taskName;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "assigned_to", referencedColumnName = "user_id")
	private User assignedTo;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@Column(name = "due_date")
	private Date dueDate;

	@Column(name = "priority")
	private String priority;

	@Column(name = "status")
	private String status;

	public Task() {
		this.createdAt = new Date(0, 0, 0);
		this.updatedAt = new Date(0, 0, 0);
	}

	@PreUpdate
	    protected void onUpdate() {
	        this.updatedAt = new Date(0, 0, 0);
	    }

}
	