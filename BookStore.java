import java.util.Scanner;
public class BookStore {
	public static void main(String[] args)
	{
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Welcome to the BookStore!");
		System.out.println("what would you like to do?");
		System.out.println("1.view Books");
		System.out.println("2.search for a Book");
		System.out.println("3.Exit");
		int choice =Scanner.nextInt();
		switch (choice)
		{
			case 1:
				viewBook();
			break;
			case 2:
				searchBook();
			break;
			case 3:
				System.out.println("Thank for visiting a Book Store!");
			break;
			default:
				System.out.println("Invalid choice");
		}
	}

	public static void viewBook()
	{
		System.out.println("Here are the Books available in the store:");
		System.out.println("1.Harry porter and the  sorcerer's stone");
		System.out.println("2.The Hunger Games");
		System.out.println("3.To kill a Mockingbird");
		System.out.println("4.Beloved");
		System.out.println("5.Mahabharta");
	}
	public static void searchBook()
	{
		Object system;
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the name to the you are Book looking for");
		String bookName=Scanner.nextLine();
		if(bookName.equalsIgnoreCase("Harry porter and the  sorcerer's stone"))
		{
			System.out.println("We have Harry porter and the  sorcerer's stone Book in stock!");
			
		}
		else if(bookName.equalsIgnoreCase("The Hunger Games"))
		{
			System.out.println("We have The Hunger Games Book in stock!");
		}
		else if(bookName.equalsIgnoreCase("To kill a Mockingbird"))
		{
			System.out.println("We have To kill a Mockingbird Book in stock!");
		}
		else if(bookName.equalsIgnoreCase("Beloved"))
		{
			System.out.println("We have Beloved Book in stock!");
		}
		else if(bookName.equalsIgnoreCase("Mahabharta"))
		{
			System.out.println("We have Mahabharta Book in stock!");
		}
		
		else
		{
			System.out.println("sorry,we don't have that book in stock!");
		}
		
	}
}
