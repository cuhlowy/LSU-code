//Student Name: Chloe Chin
//LSU ID: 894023599


public class Publication implements Comparable <Publication> {

    public String genre;
    public String title;

    public Publication(String title, String genre) {
        this.genre = genre;
        this.title = title;
    }
  


	public String getInfo() {
		return (title+", "+genre+"."); 
    }
   
   
    @Override
    public int compareTo(Publication o) {
		if(genre.compareTo(o.genre) != 0)
			return genre.compareTo(o.genre);
			else
			return title.compareTo(o.title);
	}

    	
    }



	
