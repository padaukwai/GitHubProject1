package bookdata;
import java.util.*;

public class Book {
	private String bookname;
	private String publisheddate;
	private String authorname;
	private int bookid;
	public Book(int bid, String bname,String pubdate,String authname)
	{
		bookid=bid;
		bookname=bname;
		publisheddate=pubdate;
		authorname=authname;
	}

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getPublisheddate() {
	return publisheddate;
}
public void setPublisheddate(String publisheddate) {
	this.publisheddate = publisheddate;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public String print()
{
	
	return bookid+" "+bookname;
}

}
