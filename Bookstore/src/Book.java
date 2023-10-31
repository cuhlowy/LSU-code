//Student Name: Chloe Chin
//LSU ID: 894023599


public class Book extends Publication {

    public String author;

    public Book(String author, String title, String genre) {
        super(title, genre);
    	this.author = author;
    }


    @Override 
    public String getInfo() {
       return (title+", "+genre +". Written by "+ author +" "); 
       
    }

    public int compareTo(Book o) {
		if(author.compareTo(o.author) != 0)
			return author.compareTo(o.author);
			else
			return author.compareTo(title);
	}


}