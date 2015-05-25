package com.project.css.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Activity
 *
 */
@Entity
@Table
public class Activity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date name;
	private static final long serialVersionUID = 1L;

	
	public Activity(int id, Date name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Activity() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getName() {
		return this.name;
	}

	public void setName(Date name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + "]";
	}
   
	
}
