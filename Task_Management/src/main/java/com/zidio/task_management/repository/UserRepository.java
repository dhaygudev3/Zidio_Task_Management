package com.zidio.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.task_management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findUserByEmail(String email);
}
