package com.hcc.TodoService.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="Employee_Todos")
@NamedQuery(name ="EmployeeTodos.findAll",query="SELECT e from EmployeeTodos e")
public class EmployeeTodos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long taskNbr;
	
	private String taskName;
	
	private String taskDesc;
	
	private Date taskDate;
	
	private String taskStatus;
	
	private Date taskEndDate;

	public Long getTaskNbr() {
		return taskNbr;
	}

	public void setTaskNbr(Long taskNbr) {
		this.taskNbr = taskNbr;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taskDate == null) ? 0 : taskDate.hashCode());
		result = prime * result + ((taskDesc == null) ? 0 : taskDesc.hashCode());
		result = prime * result + ((taskEndDate == null) ? 0 : taskEndDate.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		result = prime * result + ((taskNbr == null) ? 0 : taskNbr.hashCode());
		result = prime * result + ((taskStatus == null) ? 0 : taskStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTodos other = (EmployeeTodos) obj;
		if (taskDate == null) {
			if (other.taskDate != null)
				return false;
		} else if (!taskDate.equals(other.taskDate))
			return false;
		if (taskDesc == null) {
			if (other.taskDesc != null)
				return false;
		} else if (!taskDesc.equals(other.taskDesc))
			return false;
		if (taskEndDate == null) {
			if (other.taskEndDate != null)
				return false;
		} else if (!taskEndDate.equals(other.taskEndDate))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		if (taskNbr == null) {
			if (other.taskNbr != null)
				return false;
		} else if (!taskNbr.equals(other.taskNbr))
			return false;
		if (taskStatus == null) {
			if (other.taskStatus != null)
				return false;
		} else if (!taskStatus.equals(other.taskStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeTodos [taskNbr=" + taskNbr + ", taskName=" + taskName + ", taskDesc=" + taskDesc + ", taskDate="
				+ taskDate + ", taskStatus=" + taskStatus + ", taskEndDate=" + taskEndDate + "]";
	}
		
    		

}
