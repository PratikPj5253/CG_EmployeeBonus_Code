package com.cap;
import java.nio.file.spi.FileSystemProvider;
import java.util.*;

class Employee
{
	public String name;
	public String projectName;
	public int workingHrs;
	public int bonus;
	
	Employee(String name,String projectName,int workingHrs)
	{
		this.name=name;
		this.projectName=projectName;
		this.workingHrs=workingHrs;
		this.bonus=0;
	}
	public String setBonus()
	{
		String pname=this.projectName;
		int hhrs=this.workingHrs;
		
		if((pname.contains("web") || pname.contains("tech") || pname.contains("hack") || pname.contains("SD") || pname.contains("PD")))
		{
			int bonus=hhrs/10;
			this.bonus=bonus;
			return "Congrats";
		}
		else
		{
			return "Work hard";
		}
		
	}
	public String generateId()
	{
		String str="";
		
		for(int i=0;i<this.projectName.length();i++)
		{
			char ch1=this.name.charAt(i);
			char ch2=this.projectName.charAt(i);
			str=str+ch1+ch2;
		}
		str=str+Integer.toString(this.workingHrs);
		return str;
	}
}

public class Employee2 
{

	public static void main(String[] args) 
	{	
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(sc.nextLine(),sc.nextLine(),sc.nextInt());

		//Employee emp=new Employee("Pratik", "hack", 30);
		System.out.println(emp.setBonus());
		System.out.println(emp.generateId());
	}

}
