package edu.tinzel.fs;

import java.lang.reflect.Method;

public class L2 {
	public static void main(String[] args) throws Exception{
		//1.加载jvm中Class对象的两种方式
		Class teaClass = Class.forName("edu.tinzel.fs.Teacher");
		//2.采用...实例化对象
		Object teaObject = teaClass.newInstance();
		//3.通过Class对象的getMethod方法获取某一种方法
		Method smileTeaMethod = teaClass.getMethod("smile");
		Method sayTeaMethod = teaClass.getMethod("say",String.class);
		Method runTeaMethod = teaClass.getMethod("run",int.class);
		Method payTeaMethod = teaClass.getMethod("pay",int.class);
		sayTeaMethod.invoke(teaObject,"劉老師");
		runTeaMethod.invoke(teaObject, 2);
		payTeaMethod.invoke(teaObject, 100);
		smileTeaMethod.invoke(teaObject);
	}
}
