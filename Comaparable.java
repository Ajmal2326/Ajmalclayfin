package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comaparable 
{
	public static void main(String[] args) {
		List<Car5> empList =new LinkedList<>();
		empList.add(new Car5(25,"audi",58));
		empList.add(new Car5(50,"tesla",50));
		empList.add(new Car5(24,"bmw",58));
		empList.add(new Car5(20,"bentz",51));
		Collections.sort(empList);
		System.out.println(empList);
		
		}

}
class Car5 implements Comparable<Car5>{
	public Car5() {
		// TODO Auto-generated constructor stub
	}
	private int milage;
	private String brand;
	private int capacity;
	
	public Car5(int milage, String brand, int capacity) {
		super();
		this.milage = milage;
		this.brand = brand;
		this.capacity = capacity;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public int compareTo(Car5 e) {
		if(this.milage>e.milage)
			return 1;
		else if(this.milage<e.milage)
			return -1;
		else 
			return 0;
	
	}
	@Override
	public String toString() {
		return "Car [milage=" + milage + ", brand=" + brand + ", capacity=" + capacity + "]";
	}
	
	
}
