import java.awt.print.Book;
import java.util.Scanner;

public class adminstration {
	 void admin()
		{	
			Scanner s=new Scanner(System.in);
			String name="Darshan Chheda";	
			int num,temp;	
			User u=new User();
			Book b=new Book();
			System.out.println("\n\nHello "+name+", welcome to the library!");
			System.out.println("\nDo you want to enter the library?\n1:YES\n2:NO");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1: do
								{
									System.out.println("\n1:Exit");
									System.out.println("2:User section");
									System.out.println("3:Books section");
									System.out.println("Enter your choice:");
									num=s.nextInt();
									switch(num)
									{
										case 1: System.out.println("\nExiting to menu...");
														break;
										case 2: u.student();
														break;
										case 3:	do
														{
															System.out.println("\n1:Exit\n2:Books\n3:Magazines\n4:Journals");
															System.out.println("Enter a choice:");
															temp=s.nextInt();
															switch(temp)
															{
																case 1: System.out.println("\nExiting...");
																break;
																case 2:	b.hbooks();
																				break;
																case 3: b.magazines();	
																				break;
																case 4: b.journal();
																				break;
																case 5: break;
																default: System.out.println("Wrong choice. Please re-enter.");
															}
														}while(temp!=1);
														break;
										default: System.out.println("Wrong choice. Please re-enter");
									}
								}while(num!=1);
								break;
				case 2: System.out.println("\nGoing back to the menu...");
								break;
				default: System.out.println("Wrong choice. Taking back to menu");
			}
		}

}
