//Student Name: Chloe Chin
//LSU ID: 894023599


public class Magazine extends Publication {

    public String publisher;

    public Magazine(String publisher, String title, String genre) {
    	super(title, genre);
        this.publisher = publisher;
    }
    
    public String getInfo() {
        return (title+", "+genre+". Published by "+publisher+" "); 
    }
    	
    	
    
 

}
