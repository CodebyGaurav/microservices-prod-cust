package com.codebygaurav.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customertable")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId; //pk
	private String custName;
	private String custAddress;

	private int pid; //fk

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Customer(int custId, String custName, String custAddress, int pid) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.pid = pid;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
