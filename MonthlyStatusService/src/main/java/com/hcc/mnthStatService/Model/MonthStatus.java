package com.hcc.mnthStatService.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="Month_Status")
@NamedQuery(name ="MonthStatus.findAll",query="SELECT e from MonthStatus e")
public class MonthStatus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long sNo;
	
	private Date startDate;
	
	private String projectHrs;
	
	private String supportHrs;
	
	private String taskName;
	
	private String status;
	
	private Date endDate;
	
	private String comments;

	public Long getsNo() {
		return sNo;
	}

	public void setsNo(Long sNo) {
		this.sNo = sNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getProjectHrs() {
		return projectHrs;
	}

	public void setProjectHrs(String projectHrs) {
		this.projectHrs = projectHrs;
	}

	public String getSupportHrs() {
		return supportHrs;
	}

	public void setSupportHrs(String supportHrs) {
		this.supportHrs = supportHrs;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((projectHrs == null) ? 0 : projectHrs.hashCode());
		result = prime * result + ((sNo == null) ? 0 : sNo.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((supportHrs == null) ? 0 : supportHrs.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
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
		MonthStatus other = (MonthStatus) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (projectHrs == null) {
			if (other.projectHrs != null)
				return false;
		} else if (!projectHrs.equals(other.projectHrs))
			return false;
		if (sNo == null) {
			if (other.sNo != null)
				return false;
		} else if (!sNo.equals(other.sNo))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (supportHrs == null) {
			if (other.supportHrs != null)
				return false;
		} else if (!supportHrs.equals(other.supportHrs))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MonthStatus [sNo=" + sNo + ", startDate=" + startDate + ", projectHrs=" + projectHrs + ", supportHrs="
				+ supportHrs + ", taskName=" + taskName + ", status=" + status + ", endDate=" + endDate + ", comments="
				+ comments + "]";
	}
	
	
	
	

}
