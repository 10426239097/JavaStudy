package GusNumber;

import java.util.Random;
import java.util.Scanner;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Player player1=new Player(); 
		Player player2=new Player(); 
		Player player3=new Player(); 
		Random rand=new Random();
		System.out.println("*************GuessNumber introduction**************");
		System.out.println("* ��ҹ�3λ������3�ֲ�0-9�е�һ�����֣���ȷ������0-9���������   *");
		System.out.println("* ��Ҳ¶Ե�1�֣��´��0�֣�3���ۻ��÷ֶ���ʤ��û����߷ֽ���ʤ�� *");
		System.out.println("*********************Beginning**********************");
		System.out.println();
		for(int i=0;i<3;i++)
		{
			int randNum=rand.nextInt(10);
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Please player1 input number>>");
			player1.number=sc.nextInt();
			System.out.print("Please player2 input number>>");
			player2.number=sc.nextInt();
			System.out.print("Please player3 input number>>");
			player3.number=sc.nextInt();
			
			if(player1.number==randNum)
				player1.score=player1.score+1;
			
			if(player2.number==randNum)
				player2.score=player2.score+1;
			
			if(player3.number==randNum)
				player3.score=player3.score+1;
			System.out.printf("the correct number is: %d\n",randNum);
		}
		
		
		if(player1.score>player2.score)
		{ 
			if(player1.score>player3.score)
				System.out.println("player1 win the game!");
			if(player1.score<player3.score)
				System.out.println("player3 win the game!");
			if(player1.score==player3.score)
				System.out.println("no one  win the game!");
		}
		
		if(player1.score==player2.score)
		{ 
			if(player1.score>player3.score)
				System.out.println("no one  win the game!");
			if(player1.score<player3.score)
				System.out.println("player3 win the game!");
			if(player1.score==player3.score)
				System.out.println("no one win the games!");
		}
		
		if(player1.score<player2.score)
		{ 
			if(player2.score>player3.score)
				System.out.println("player2  win the game!");
			if(player2.score<player3.score)
				System.out.println("player3 win the game!");
			if(player2.score==player3.score)
				System.out.println("no one win the games!");
		}
	}

}
