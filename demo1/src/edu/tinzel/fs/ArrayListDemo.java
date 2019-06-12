package edu.tinzel.fs;

import java.lang.reflect.Method;

public class ArrayListDemo {
	public static void main(String[] args) throws Exception{
		Class ArrayListClass = Class.forName("java.util.ArrayList");
		Object ArrayListClassObject = ArrayListClass.newInstance();
		Method addMethod = ArrayListClass.getMethod("add", Object.class);
		addMethod.invoke(ArrayListClassObject, "admin");
		addMethod.invoke(ArrayListClassObject, "123");
		addMethod.invoke(ArrayListClassObject, "tinzel");
		System.out.println();
	}
}
