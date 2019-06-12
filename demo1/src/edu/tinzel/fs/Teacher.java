package edu.tinzel.fs;
public class Teacher{
		public String say(String msg)
		{
			return "老师说："+msg;
		}
		
		public void run(int firstFloor)
		{
			System.out.println("老师说要27班级学员从"+firstFloor+"层开始跑到顶楼");
		}
		
		public void smile()
		{
			System.out.println("学生跑老师在顶楼笑");
		}
		
		public int pay(int money)
		{
			return money;
		}
}
