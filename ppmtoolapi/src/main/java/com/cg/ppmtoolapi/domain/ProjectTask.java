package com.cg.ppmtoolapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ProjectTask {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String projectSequence;
	@NotBlank(message="Summary should not be blank.")
	private String summary;
	private String acceptanceCriteria;
	private String status;
	private Integer priority;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dueDate;
	//manyToOne with Backlog
	
	@Column(updatable=false)
	private String projectIdentifier;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_At;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_At;
	public ProjectTask() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProjectSequence() {
		return projectSequence;
	}
	public void setProjectSequence(String projectSequence) {
		this.projectSequence = projectSequence;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}
	public void setAcceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public Date getCreate_At() {
		return created_At;
	}
	public void setCreate_At(Date create_At) {
		this.created_At = create_At;
	}
	public Date getUpdate_At() {
		return updated_At;
	}
	public void setUpdate_At(Date update_At) {
		this.updated_At = update_At;
	}
	
	@PrePersist
	public void onCretae() {
		this.created_At=new Date();
	}
	@PreUpdate
	public void onUpdate() {
		this.updated_At=new Date();
	}

}
