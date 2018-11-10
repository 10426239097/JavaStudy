import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestList
{
	public TestList()
	{
		
	}
	
	public void TestLinkedList(ArrayList<Points> points)
	{
		LinkedList<Integer> LList=new LinkedList<Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�LinkedList��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��LinkedList��������
			for(int i=0;i<n;i++)
				LList.add(i);
			
			//��LList���������
			Iterator<Integer> iter=LList.iterator();
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				//��������
				while(iter.hasNext())
					if(iter.next()==goal)
						break;
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}

	public void TestArrayList(ArrayList<Points> points)
	{
		ArrayList<Integer> AList=new ArrayList<Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�LinkedList��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��ArrayList��������
			for(int i=0;i<n;i++)
				AList.add(i);
			
			//��AList���������
			Iterator<Integer> iter=AList.iterator();
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				//��������
				while(iter.hasNext())
					if(iter.next()==goal)
						break;
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}
	
	public void TestHashMap(ArrayList<Points> points)
	{
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�HashMap��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��HashMap��������
			for(int i=0;i<n;i++)
				hash.put(i, i);
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				
				//����
				hash.get(goal);
				
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}

	public void TestHashSet(ArrayList<Points> points)
	{
		HashSet<Integer> hashSet=new HashSet<Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�HashSet��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��HashSet��������
			for(int i=0;i<n;i++)
				hashSet.add(i);
			
			//��hashSet���������
			Iterator<Integer> iter=hashSet.iterator();
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				//��������
				while(iter.hasNext())
					if(iter.next()==goal)
						break;
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}

	public void TestTreeMap(ArrayList<Points> points)
	{
		TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�TreeMap��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��TreeMap��������
			for(int i=0;i<n;i++)
				tree.put(i, i);
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				
				//����
				tree.get(goal);
				
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}
	
	public void TestTreeSet(ArrayList<Points> points)
	{
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		//��¼��ѯʱ���
		double[] averTimeY=new double[10];
		int[] averTimeX=new int[10];
		
		//�ı�TreeSet��������
		int n=100000;
		//��¼����100����ʱ��
		double total=0;
		
		
		for(int average=0;average<10;average++)
		{
			//��TreeSet��������
			for(int i=0;i<n;i++)
				treeSet.add(i);
			
			//��treeSet���������
			Iterator<Integer> iter=treeSet.iterator();
			
			//100�β���
			for(int m=0;m<100;m++)
			{
				//�����漴������
				Random rand=new Random();
				int goal=rand.nextInt();
				int start=(int)System.currentTimeMillis();
				//��������
				while(iter.hasNext())
					if(iter.next()==goal)
						break;
				int end=(int)System.currentTimeMillis();
				//ȡ��100�β��ҵ���ʱ��
				total=total+end-start;
			}
			//ȡ��100�β��ҵ�averageTime
			averTimeY[average]=total/100.0;
			averTimeX[average]=n;
			points.add(new Points(averTimeX[average],averTimeY[average]));
			n=n+100000;
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<Points> points=new ArrayList<Points>();
		TestList tl=new TestList();
		
		//����LinkedList
		//tl.TestLinkedList(points);

		//����ArrayList
		//tl.TestArrayList(points);
		
		//����HashMap
		//tl.TestHashMap(points);
		
		//����HashSet
		//tl.TestHashSet(points); //��Ҫ����nֵ
		
		//����TreeMap
		//tl.TestTreeMap(points);
		
		//����TreeSet
		//tl.TestTreeSet(points);
		
		System.out.println("Exit!");
	}

}
