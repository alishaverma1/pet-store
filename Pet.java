public class Pet 
{
	private String name;
	private int age;
	private boolean adopted;
	
	public Pet()
	{
		name = "";
		age = 0;
		adopted = false;
	}
	public Pet(String name1, int age1)
	{
		name = name1;
		age = age1;
		adopted = false;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void ageIncrease()
	{
		age = age+1;
	}
	public int getAge()
	{
		return age;
	}
	public void adoption()
	{
		adopted = true;
	}
	public boolean getAdopted()
	{
		return adopted;
	}
}
