package entities;

import status.enums.Status;

public class TaskData {

	private String title;
	private String description;
	private Status status;

	public TaskData() {	
	}
	
	public TaskData(String title, String description, Status status) {
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
