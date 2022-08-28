package day4;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashcode
{
	private String name;
	private int id;
	
	
	
	public EqualsAndHashcode(String string, int i) {
		this.name=string;
		this.id=i;
	}
	


	@Override
	public String toString() {
		return "EqualsAndHashcode [name=" + name + ", id=" + id + "]";
	}
	
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		EqualsAndHashcode other = (EqualsAndHashcode) obj;
		if (id != other.id)
			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return true;
	}



	public static void main(String[] args) 
	{
		EqualsAndHashcode eh1=new EqualsAndHashcode("Ajmal" , 111);
		EqualsAndHashcode eh2=new EqualsAndHashcode("Ajmal" , 111);
		
		//System.out.println(eh1);
		
		Set equals = new HashSet();
		equals.add(eh1);
		equals.add(eh2);
		System.out.println(equals );
		
		
	}

}
