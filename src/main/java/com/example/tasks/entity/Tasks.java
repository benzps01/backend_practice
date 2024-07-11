package com.example.tasks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Tasks {
	
	@Id
	@Column
	private int taskNo;
	
	@Column
	private String task;
	
	@Column
	private String status;
	
	public int getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tasks [taskNo=" + taskNo + ", task=" + task + ", status=" + status + "]";
	}
	
	
	
	
	
}
