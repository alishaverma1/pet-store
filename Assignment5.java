import java.util.Scanner;

public class Assignment5 
{
	static Scanner scan = new Scanner(System.in);
	private static String printList()
	{
		System.out.println("Type the letter to make your selection.");
		System.out.println("A. List the pets in the store.");
		System.out.println("B. Age up the new pets.");
		System.out.println("C. Add a new pet.");
		System.out.println("D. Adopt a pet.");
		System.out.println("E. Quit.");
		String input = scan.nextLine();
		return input;
	}
	
	public static void main(String[] args)
	{
		Pet obj1 = new Pet("Fido", 3);
		Pet obj2 = new Pet("Furball", 1);
		Pet obj3 = null;
		
		System.out.println("Welcome to the pet store!");
		String input = printList();

		while(!(input.equals("E")))
		{
			if(input.equals("A"))
			{
				boolean isAdopted = false;
				boolean isOne = false;
				if(obj1.getAge()==1)
				{
					isOne = true;
				}
				if(obj1.getAdopted()==true)
				{
					isAdopted = true;
				}
				if(isOne)
				{
					if(isAdopted)
					{
						System.out.println(obj1.getName() + " is " + obj1.getAge() + " year old and is adopted.");
					}
					else
					{
						System.out.println(obj1.getName() + " is " + obj1.getAge() + " year old and is unadopted.");
					}
				}
				else
				{
					if(isAdopted)
					{
						System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old and is adopted.");
					}
					else
					{
						System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old and is unadopted.");
					}
				}
				isAdopted = false;
				isOne = false;
				if(obj2.getAge()==1)
				{
					isOne = true;
				}
				if(obj2.getAdopted()==true)
				{
					isAdopted = true;
				}
				if(isOne)
				{
					if(isAdopted)
					{
						System.out.println(obj2.getName() + " is " + obj2.getAge() + " year old and is adopted.");
					}
					else
					{
						System.out.println(obj2.getName() + " is " + obj2.getAge() + " year old and is unadopted.");
					}
				}
				else
				{
					if(isAdopted)
					{
						System.out.println(obj2.getName() + " is " + obj2.getAge() + " years old and is adopted.");
					}
					else
					{
						System.out.println(obj2.getName() + " is " + obj2.getAge() + " years old and is unadopted.");
					}
				}
				if(obj3!=null)
				{
					isAdopted = false;
					isOne = false;
					if(obj3.getAge()==1)
					{
						isOne = true;
					}
					if(obj3.getAdopted()==true)
					{
						isAdopted = true;
					}
					if(isOne)
					{
						if(isAdopted)
						{
							System.out.println(obj3.getName() + " is " + obj3.getAge() + " year old and is adopted.");
						}
						else
						{
							System.out.println(obj3.getName() + " is " + obj3.getAge() + " year old and is unadopted.");
						}
					}
					else
					{
						if(isAdopted)
						{
							System.out.println(obj3.getName() + " is " + obj3.getAge() + " years old and is adopted.");
						}
						else
						{
							System.out.println(obj3.getName() + " is " + obj3.getAge() + " years old and is unadopted.");
						}
					}
				}
			}
			else if(input.equals("B"))
			{
				System.out.println("Everyone just a got a little older!");
				obj1.ageIncrease();
				obj2.ageIncrease();
				if(obj3!=null) {
				obj3.ageIncrease();}
			}
			else if(input.equals("C"))
			{
				if(obj3==null) 
				{
					System.out.println("Please type in a name.");
					String name = scan.nextLine();
					System.out.println("Please input an age.");
					int age = scan.nextInt();
					scan.nextLine();
					obj3 = new Pet(name, age);
					System.out.println(obj3.getName() + " has arrived in the store.");
				}
				else
				{
					System.out.println("Sorry, the store is full.");
				}
			}
			else if(input.equals("D"))
			{
				System.out.println("Please enter the number of the pet you want to adopt.");
				int value = scan.nextInt();
				scan.nextLine();
				if(value == 1 || value==2 || value==3)
				{
					if(value==1)
					{
						if(obj1.getAdopted()==true)
						{
							System.out.println(obj1.getName() + " has already been adopted.");
						}
						else
						{
							System.out.println(obj1.getName() + " is adopted!");
							obj1.adoption();
						}
					}
					else if(value==2)
					{
						if(obj2.getAdopted()==true)
						{
							System.out.println(obj2.getName() + " has already been adopted.");
						}
						else
						{
							System.out.println(obj2.getName() + " is adopted!");
							obj2.adoption();
						}
					}
					else
					{
						if(obj3==null)
						{
							System.out.println("This is an invalid input.");
						}
						else
						{
								if(obj3.getAdopted()==true)
								{
									System.out.println(obj3.getName() + " has already been adopted.");
								}
								else
								{
									System.out.println(obj3.getName() + " is adopted!");
									obj3.adoption();
								}
						}
					}
				}
				else
					System.out.println("This is not a valid choice.");
			}
			else
			{
				System.out.println("Invalid choice");
			}
			input = printList();
		}
		System.out.println("Have a good day!");
}
}
