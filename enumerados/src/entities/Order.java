package entities;

import java.util.Date;

import entities.enu.OrderStatus;

public class Order {
	
	private Long id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}

	public Order(Long id, Date moment, OrderStatus status) {
		
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	

}
