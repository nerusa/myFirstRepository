package edu.tinzel.fs;

import java.lang.reflect.Method;

public class HashMapDemo {
	public static void main(String[] args) throws Exception{
		Class HashMapClass = Class.forName("java.util.HashMap");
		Object HashMapObject = HashMapClass.newInstance();
		Method hmMethod = HashMapClass.getMethod("key", Object.class,Object.class);
		hmMethod .invoke(HashMapObject, "tinzel");
		hmMethod .invoke(HashMapObject, "123");
	}
}
