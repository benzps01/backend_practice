package com.example.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tasks.entity.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Integer>{
	Tasks findTaskByTaskNo(Integer id);
}
