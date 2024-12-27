package com.zidio.task_management.model;

import lombok.Data;

@Data
public class LoginRequest {
	private String email;
	private String password;
}
