package Collection;

import java.util.ArrayList;
import java.util.List;

public class CustomeObjectMain 
{
	public static void main(String[] args) {
		List ll= new ArrayList();
		
		ll.add(new Student(11, "Ajmal","Vellore"));
		ll.add(new Student(12, "akmal","ambur"));
		ll.add(new Student(13, "rafu","pernumbut"));
		ll.add(new Student(14, "sabina","vnbd"));
		ll.add(new Student(15, "syed","tpsm"));
		
		ll.add(new Employee(121,"kishore", "Kumar"));
		ll.add(new Employee(122,"Adappa", "Navya"));
		ll.add(new Employee(123,"Debadadatta","deva"));
		
	System.out.println(ll);
	
	for(int i=0;i<ll.size();i++)
	{
		Object ob=ll.get(i);
		if(ob instanceof Employee)
		{
			System.out.println(ob);
		}
	}
	

		
		
	}

}
