public class Book {
	private String title; // immutable property
	private float price; // 4 bytes , mutable property
	private STATUS status; // ISSUED, AVAILABLE, DAMAGED ( mutable property)

	public void issue() {
		if (status != STATUS.AVAILABLE) {
			throw new BookNotAvailableException("book is not available");
		}
		this.status = STATUS.ISSUED;
	}

	public Book(String title) //Constructor: immutable property must be consider via constructor
	{
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public float getPrice()  
	{
		return price;
	}

	public void setPrice(float price) // Set method:mutable property must be consider via Set Method
	{
		this.price = price;
	}

	public STATUS getStatus() 
	{
		return status;
	}

	public void setStatus(STATUS status)// Set method:mutable property must be consider via Set Method
	{
		this.status = status;
	}
}