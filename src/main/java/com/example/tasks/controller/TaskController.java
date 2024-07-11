package com.example.tasks.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasks.entity.Tasks;
import com.example.tasks.service.TaskService;

@RestController
@CrossOrigin
public class TaskController {

	@Autowired
	private TaskService TaskServ;

	@GetMapping("/tasks")
	public Collection<Tasks> getAllTasks() {
		return TaskServ.getAllTasks();
	}

	@PostMapping("/tasks")
	public void addTask(@RequestBody Tasks task) {
		TaskServ.addTask(task);
	}

	@PutMapping("/tasks/{id}/{status}")
	public void updateTaskStatus(@PathVariable Integer id, @PathVariable String status) {
		TaskServ.updateTaskStatus(id, status);
	}

	@DeleteMapping("/tasks/{id}")
	public void deleteStatus(@PathVariable Integer id) {
		TaskServ.deleteTask(id);
	}

}
