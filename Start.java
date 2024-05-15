public class Start{
	public static void main(String []args){
		Book b1 = new Book("978-1260463415","Java Complete Reference","Herbert Schildt",500.5,12);
		b1.showDetails();
		
		Book b2 = new Book();
		b2.setIsbn("9781408855652");
		b2.setBookTitle("Harry Potter and the Philosopher's Stone");
		b2.setAuthorName("J.K. Rowling");
		b2.setPrice(-100);
		b2.setAvaiableQuantity(-2);
		b2.setPrice(1134.13);
		b2.setAvaiableQuantity(20);
		//b2.showDetails();
		
		System.out.println("ISBN: " + b2.getIsbn());
		System.out.println("Book title: " + b2.getBookTitle());
		System.out.println("Author name: " + b2.getAuthorName());
		System.out.println("Price: " + b2.getPrice());
		System.out.println("Currently available: "+ b2.getAvailableQuantity() + "\n");
		
		b2.sellQuantity(10);
		b2.addQuantity(5);
		b1.sellQuantity(15);
		b1.addQuantity(3);
		b1.sellQuantity(15);
	}
}