package Car;

public class BaseCar
{
	String name;
	float tank;
	float oilConsumption;
	
	public BaseCar(String Name,float Tank,float OilConsumption)
	{
		this.name=Name;
		this.tank=Tank;
		this.oilConsumption=OilConsumption;
	}
	
	public void Gas(float number)
	{
		this.tank=this.tank+number;
	}
	
	public float Run()
	{
		if(tank<=0)
		{
			System.out.println("��ǰ����������ʻ��");
			return 0;
		}
		System.out.println("��ǰ��������ʻʱ��Ϊ��"+tank/oilConsumption);
		return tank/oilConsumption;
	}
	
	public void print()
	{
		System.out.println("**************BaseCar Information****************");
		System.out.println("( name:"+name+",tank:"+tank+",oilConsumption:"+oilConsumption+" )");
		Run();
		System.out.println();
	}

}
