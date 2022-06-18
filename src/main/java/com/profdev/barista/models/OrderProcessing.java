package com.profdev.barista.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderProcessing {

	@Id
	private long orderId;

	private States status;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public States getStatus() {
		return status;
	}

	public void setStatus(States status) {
		this.status = status;
	}

}
