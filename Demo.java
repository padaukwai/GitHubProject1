package bookdata;
import java.util.*;
public class Demo {
public static ArrayList<Book>bookarraylist=new ArrayList<>();
public static Scanner scannerobj=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java","1999","James");
		Book b2=new Book(2,"python","2000","Michel");
		Book b3=new Book(3,"MS.net","1986","Adason");
		Book b4=new Book(4,"Perl Script","2010","Richard");
		bookarraylist.add(b1);
		bookarraylist.add(b2);
		bookarraylist.add(b3);
		bookarraylist.add(b4);
		char check;
		do {
			
		menu();
		int choosenum=scannerobj.nextInt();
		if(choosenum==1)
			insertBook();
		else if(choosenum==2)
			updateBook();
		else if(choosenum==3)
			deleteBook();
		else if(choosenum==4)
			viewBookList();
		else
			System.out.println("Please enter 1 to 4");
		System.out.println("Do you want to try again y/n");
		check=scannerobj.next().charAt(0);
		}while(check=='y');
		
		

	}
	public static void menu()
	{
		System.out.println("Please choose insert/update/delete/view");
		System.out.println("1: Insert Book");
		System.out.println("2: Update Book");
		System.out.println("3: Delete Book");
		System.out.println("4: View Book Lists");
	}
	public static void insertBook()
	{
		//bookarraylist
		/*
		 * public int bookid;
	public String bookname;
	public String publisheddate;
	public String authorname;
		 */
		System.out.println("Enter bookid");
		int id=scannerobj.nextInt();
		scannerobj.nextLine();
		System.out.println("Enter book name");
		String name=scannerobj.nextLine();
		
		System.out.println("Enter published date");
		String pubdate=scannerobj.nextLine();
		
		System.out.println("Enter author name");
		String autname=scannerobj.nextLine();
		Book bookobj=new Book(id,name,pubdate,autname);
		bookarraylist.add(bookobj);
		System.out.println("Number of books"+bookarraylist.size());
	}
	public static void updateBook()
	{
		System.out.println("Enter bookid to update");
		int bid=scannerobj.nextInt();
		for(int i=0;i<bookarraylist.size();i++)
		{
			if(bid==bookarraylist.get(i).getBookid())
			{
				scannerobj.nextLine();
				System.out.println("Enter book name to update");
				String bname=scannerobj.nextLine();
				System.out.println("Enter published date");
				String pubdate=scannerobj.nextLine();
				
				System.out.println("Enter author name");
				String autname=scannerobj.nextLine();
				Book bookobj=new Book(bid,bname,pubdate,autname);
				bookarraylist.set(i, bookobj);
			}
		}
		
	}
	public static void deleteBook()
	{
		//(index)
		//bookarraylist.remove(0);
	}
	public static void viewBookList()
	{
		for(int i=0;i<bookarraylist.size();i++)
		{
			System.out.println(bookarraylist.get(i).print());
		}
	}

}
