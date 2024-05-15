import java.lang.*;

public class Book{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book(){
		System.out.println("Empty constructor called.");
	}
	
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
		System.out.println("Parameterized constructor called.");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		if(price<0){
			System.out.println("Price can not be negative.");
		}else{
			this.price = price;
		}
		if(availableQuantity<0){
			System.out.println("Quantity can not be negative.");
		}else{
			this.availableQuantity = availableQuantity;
		}
	}
	
	//setter methods
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public void setPrice(double price){
		if(price<0){
			System.out.println("Price can not be negative.");
		}else{
			this.price = price;
		}
	}
	public void setAvaiableQuantity(int availableQuantity){
		if(availableQuantity<0){
			System.out.println("Quantity can not be negative.");
		}else{
			this.availableQuantity = availableQuantity;
		}
	}
	
	//getter methods
	public String getIsbn(){ return isbn; }
	public String getBookTitle(){ return bookTitle; }
	public String getAuthorName(){ return authorName; }
	public double getPrice(){ return price; }
	public int getAvailableQuantity(){
		return this.availableQuantity; 
	}
	
	public void addQuantity(int amount){
		if(amount<0){
			System.out.println("Amount can not be negative.");
		}else{
			availableQuantity = availableQuantity + amount;
			System.out.println(bookTitle + " - "+ amount + " books added. Currently " +availableQuantity + " books available.");
		}
	}
	public void sellQuantity(int amount){
		if(amount<0){
			System.out.println("Amount can not be negative.");
		}else{
			if(availableQuantity >= amount){
				availableQuantity = availableQuantity - amount;
				System.out.println(bookTitle + " - " + amount + " books sold. Currently " +availableQuantity + " books available.");
			}else{
				System.out.println(bookTitle+ " - " +amount + " books can not be sold. Currently " +availableQuantity + " books available.");
			}
		}
	}
	
	public void showDetails(){
		System.out.println("ISBN: " + isbn);
		System.out.println("Book title: " + bookTitle);
		System.out.println("Author name: " + authorName);
		System.out.println("Price: " + price);
		System.out.println("Currently available: "+ availableQuantity);
		System.out.println("");
	}
}