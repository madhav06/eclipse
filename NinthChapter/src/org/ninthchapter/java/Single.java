package org.ninthchapter.java;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle
{
	int value(); // the variable name must be value
}

public class Single 
{
	// Annotate a method using a mrker.
	
	@MySingle(100)
	public static void myMeth()
	{
		Single ob = new Single();
		try
		{
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			System.out.println("The value is: "+ anno.value());
			// displays 100
		}
		catch(NoSuchMethodException exc)
		{
			System.out.println("Method not Found. ");
		}
	}
	public static void main(String[] args) 
	{
		myMeth();
	}
}
