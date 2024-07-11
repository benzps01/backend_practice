package com.example.tasks.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tasks.entity.Tasks;
import com.example.tasks.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	public TaskRepository TaskRepo;
	
	public Collection<Tasks> getAllTasks(){
		return TaskRepo.findAll();
	}
	
	public void addTask(Tasks task) {
		TaskRepo.save(task);
	}
	
	public void updateTaskStatus(int id, String status) {
		Tasks task = TaskRepo.findTaskByTaskNo(id);
		task.setStatus(status);
		TaskRepo.save(task);
	}
	
	public void deleteTask(int id) {
		TaskRepo.deleteById(id);
	}
}
