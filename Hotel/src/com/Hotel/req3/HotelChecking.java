package com.Hotel.req3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class HotelChecking {
	private int number;
	private int floor;
	private String type;
	private int capacity;
	private Date bookedtime;
	private double price;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Date getBookedtime() {
		return bookedtime;
	}
	public void setBookedtime(Date bookedtime) {
		this.bookedtime = bookedtime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public HotelChecking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelChecking(int number, int floor, String type, int capacity, Date bookedtime, double price) {
		super();
		this.number = number;
		this.floor = floor;
		this.type = type;
		this.capacity = capacity;
		this.bookedtime = bookedtime;
		this.price = price;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return "number=" + number + "\nfloor=" + floor + "\ntype=" + type + "\ncapacity=" + capacity
				+ "\nbookedtime=" + sdf.format(bookedtime) + "\nprice=" + price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(floor, number, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelChecking other = (HotelChecking) obj;
		return floor == other.floor && number == other.number && Objects.equals(type, other.type);
	}
	

}
