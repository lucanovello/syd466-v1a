package ca.mohaghegh.navid;

import java.util.Calendar;
import java.util.Date;

public class Person
{
	private String name;
	private Date birthDate;
	
	public Person(String name, Date birthDate)
	{
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public static void main(String[] args)
	{
		String name = "Billy Bob";
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 2, 26, 0, 0, 0);
		Date dob = new Date(cal.getTimeInMillis());  // March 26, 1990
		Person p = new Person(name, dob);
		System.out.println("Original DoB: " + p.getBirthDate());
		
		cal.set(1995, 10, 3); // November 3, 1995
		dob.setTime(cal.getTimeInMillis());
		System.out.println("New DoB:      " + p.getBirthDate());
		System.out.println();
		
		
		
		System.out.println("Original Name: " + p.getName());
		name = "William Robert";
		System.out.println("New Name:      " + p.getName());
		
	}
}
