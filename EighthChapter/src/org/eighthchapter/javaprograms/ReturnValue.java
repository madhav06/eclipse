package org.eighthchapter.javaprograms;

public class ReturnValue {

	public String name="Tom";
	public void getName()
	{
		System.out.println("Name is: "+name);
	}
	public static void main(String[] args)
	{
		ReturnValue rv = new ReturnValue();
		rv.getName();
	}
}
