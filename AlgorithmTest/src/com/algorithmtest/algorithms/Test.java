package com.algorithmtest.algorithms;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Ones two = new Twos();

		System.out.println("Ones\n");
		System.out.println("Declared Fields");
		Field[] fields = Ones.class.getDeclaredFields();
		for(Field field : fields) System.out.println(field.getName());
		System.out.println();
		System.out.println("Fields");
		Field[] fields2 = Ones.class.getFields();
		for(Field field : fields2) System.out.println(field.getName());


		System.out.println();
		System.out.println();

		System.out.println("Twos\n");
		System.out.println("Declared Fields");
		fields = Twos.class.getDeclaredFields();
		for(Field field : fields) System.out.println(field.getName());
		System.out.println();
		System.out.println("Fields");
		fields2 = Twos.class.getFields();
		for(Field field : fields2) System.out.println(field.getName());
		
		int val = (Integer)Ones.class.getMethod("getOne").invoke(two);
		System.out.println(val);
	}
	
}

class Ones
{
    private int one = 1;
    public int onePub = 11;

    public int getOne()
    {
        return one;
    }

    public void setOne(int one)
    {
        this.one = one;
    }
}

class Twos extends Ones
{
	
}