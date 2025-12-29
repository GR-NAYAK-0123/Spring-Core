package com.nt.test;

import java.lang.reflect.Constructor;

public class GenericTest_Solution {
	
	public static <T extends Person> T getInstance(Class<T> clazz) throws Exception{
		Constructor cons[] = clazz.getDeclaredConstructors();
		return (T) cons[0].newInstance();
	}

	public static void main(String[] args) throws Exception{
		Employee emp =  getInstance(Employee.class);
		System.out.println(emp);
		Person per = getInstance(Customer.class);
		System.out.println(per);
//		Student st = getInstance(Student.class);
//		System.out.println(st);
	}

}
