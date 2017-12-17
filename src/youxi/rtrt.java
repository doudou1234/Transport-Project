package youxi;
public class rtrt
{

    

	private int age;
	private String name;
	public rtrt()
	{
		this(10);
	}
	public rtrt(int age)
	{
		this.age=age;	
	}
	public void setName(String name) 	
	{
		this.name=name;
	}

	public void print() 	
	{
		System.out.println(this.age);
	}
	
	public static void main(String[] args)
	{
		rtrt demo=new rtrt();
		demo.print();
	}
  
  
}
