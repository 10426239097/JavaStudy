package Test1;

import java.lang.reflect.Field;

public class Test
{

	public static void main(String[] args) throws Exception
	{

	  //  ����1
//		Integer a=new Integer(12);
//		Integer b=a;
//		System.out.println("��a����ֵ��b�����");
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
//		System.out.println("a:"+a.hashCode());
//		
//		a=Integer.valueOf(56);
//		System.out.println("��b�������µ�ֵ��");
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
//		System.out.println("a:"+a.hashCode());
		
		//����2
		Integer a1 = 200;
		Integer b1 = a1;
		System.out.println("��a����ֵ��b�����");
		System.out.println("a1=" + a1);
		System.out.println("b1=" + b1);
		
		
		Field field = null;
		field = a1.getClass().getDeclaredField("value");
		System.out.println("field��"+field);
		field.setAccessible(true);
		field.set(a1, 5000);
		
		System.out.println("��a1�������µ�ֵ��");
		System.out.println("a1=" + a1);
		System.out.println("b1=" + b1);

	

 
	}

}
