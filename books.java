import java.util.Scanner;

public class books {
	 name,author;
		int choice,ID;
		Scanner s=new Scanner(System.in);
		public void hbooks()
		{
			do
			{
				System.out.println("1:Exit");     
				System.out.println("2:Add book");
				System.out.println("3:Remove book");
				System.out.println("4:Display book");
				System.out.println("5:Search book");
				System.out.println("Enter a choice:");
				choice=s.nextInt();
				switch(choice)
				{
					case 1: System.out.print("\nExiting...");
									break;
					case 2: System.out.print("\nEnter book name:");
									name=s.next();
									System.out.println("Enter author's name:");
									author=s.next();
									System.out.println("Enter the book ID:");
									ID=s.nextInt();
									binsert(name,author,ID);
									break;
					case 3: System.out.println("\nEnter the ID of the book to be removed:");
									ID=s.nextInt();
									bremove(ID);
									break;
					case 4: System.out.println("\nEnter the book ID to display:");
									ID=s.nextInt();
									bdisplay(ID);
									break;
					case 5: System.out.println("Enter the book ID to be searched:");
									ID=s.nextInt();
									int m=bsearch(ID);
									break;
					default: System.out.println("Wrong choice. Please re-enter");
				}
			}while(choice!=1);
		}
		static Vector<Books>bv=new Vector<Books>();
		static void binsert(String name,String author,int ID)
		{
			Books bks=new Books(name,author,ID);
			bv.add(bks);
		}
		static void bremove(int ID)
		{
			for(int i=0;i<bv.size();i++)
			{
				Books bks;
				bks=bv.get(i);
				if(bks.ID==ID)
				{
					bv.removeElementAt(i);
					break;
				}
			}
		}
		static void bdisplay(int ID)
		{
			for(int i=0;i<bv.size();i++)
			{
				Books bks;
				bks=bv.get(i);
				if(bks.ID==ID)
				{
					System.out.println("\n\t---Book---");
					System.out.println("Name:"+bks.name+"\nAuthor:"+bks.author+"\nID:"+bks.ID);
					break;
				}
			}
		}
		static int bsearch(int ID)
		{
			int flag=0;
			for(int i=0;i<bv.size();i++)
			{
				Books bks;
				bks=bv.get(i);
				if(bks.ID==ID)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				System.out.println("Book present");
				return 1;
			}
			else
			{
				System.out.println("Book not there");
				return 0;
			}
		}
		public void magazines()
		{
			do
			{
				System.out.println("1:Exit");
				System.out.println("2:Add magaize");
				System.out.println("3:Remove magazine");
				System.out.println("4:Display magazine");
				System.out.println("5:Search magazines");
				System.out.println("Enter a choice:");
				choice=s.nextInt();
				switch(choice)
				{
					case 1: System.out.println("Exiting...");
									break;
					case 2: System.out.println("\nEnter magzine name:");
									name=s.next();
									System.out.println("Enter author's name:");
									author=s.next();
									System.out.println("Enter the magazine ID:");
									ID=s.nextInt();
									minsert(name,author,ID);
									break;
					case 3: System.out.println("\nEnter the ID of the magazine to be removed:");
									ID=s.nextInt();
									mremove(ID);
									break;
					case 4: System.out.println("\nEnter the magazine ID to display:");
									ID=s.nextInt();
									mdisplay(ID);
									break;
					case 5: System.out.println("\nEnter the magazine ID to be searched:");
									ID=s.nextInt();
									msearch(ID);
					default: System.out.println("Wrong choice. Please re-enter");
				}
			}while(choice!=1);
		}
		static Vector <Magazines> mv=new Vector<Magazines>();
		static void minsert(String name,String author,int ID)
		{
			Magazines mgs=new Magazines(name,author,ID);
			mv.add(mgs);
		}
		static void mremove(int ID)
		{
			for(int i=0;i<mv.size();i++)
			{
				Magazines mgs;
				mgs=mv.get(i);
				if(mgs.ID==ID)
				{
					mv.removeElementAt(i);
					break;
				}
			}
		}
		static void mdisplay(int ID)
		{
			for(int i=0;i<mv.size();i++)
			{
				Magazines mgs;
				mgs=mv.get(i);
				if(mgs.ID==ID)
				{
					System.out.println("\n\t---Magazine---");
					System.out.println("Name:"+mgs.name+"\nAuthor:"+mgs.author+"\nID:"+mgs.ID);
					break;
				}
			}
		}
		static void msearch(int ID)
		{
			int flag=0;
			for(int i=0;i<mv.size();i++)
			{
				Magazines mgs;
				mgs=mv.get(i);
				if(mgs.ID==ID)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				System.out.println("Magazine present");
			}
			else
			{
				System.out.println("Magazine not there");
			}
		}
		public void journal()
		{	
			do
			{
				System.out.println("\n1:Exit");
				System.out.println("2:Add journal");
				System.out.println("3:Remove journal");
				System.out.println("4:Display journal");
				System.out.println("5:Search journal");
				System.out.println("Enter a choice:");
				choice=s.nextInt();
				switch(choice)
				{
					case 1: break;
					case 2: System.out.println("\nEnter journal name:");
									name=s.next();
									System.out.println("Enter author's name:");
									author=s.next();
									System.out.println("Enter the journal ID:");
									ID=s.nextInt();
									jinsert(name,author,ID);
									break;
					case 3: System.out.println("\nEnter the ID of the journal to be removed:");
									ID=s.nextInt();
									jremove(ID);
									break;
					case 4: System.out.println("\nEnter the journal ID to display:");
									ID=s.nextInt();
									jdisplay(ID);
									break;
					case 5: System.out.println("Enter the journal ID to be searched:");
									ID=s.nextInt();
									jsearch(ID);
									break;
					default: System.out.println("Wrong choice. Please re-enter");
				}
			}while(choice!=1);
		}
		static Vector <Journal> jv=new Vector<Journal>();
		static void jinsert(String name,String author,int ID)
		{
			Journal jrnl=new Journal(name,author,ID);
			jv.add(jrnl);
		}
		static void jremove(int ID)
		{
			for(int i=0;i<jv.size();i++)
			{
				Journal jrnl;
				jrnl=jv.get(i);
				if(jrnl.ID==ID)
				{
					jv.removeElementAt(i);
					break;
				}
			}
		}
		static void jdisplay(int ID)
		{
			for(int i=0;i<jv.size();i++)
			{
				Journal jrnl;
				jrnl=jv.get(i);
				if(jrnl.ID==ID)
				{
					System.out.println("\n\t---Journal---");
					System.out.println("Name:"+jrnl.name+"\nAuthor:"+jrnl.author+"\nID:"+jrnl.ID);
					break;
				}
			}
		}
		static void jsearch(int ID)
		{
			int flag=0;
			for(int i=0;i<jv.size();i++)
			{
				Journal jrnl;
				jrnl=jv.get(i);
				if(jrnl.ID==ID)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				System.out.println("journal present");
			}
			else
			{
				System.out.println("journal not there");
			}
		}

}
