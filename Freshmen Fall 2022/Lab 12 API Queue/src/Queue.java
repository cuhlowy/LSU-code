public class Queue  {


    LinkedList <String> List;

    public Queue() {
        List = new LinkedList<String>();
    }
    /*
    public void Add(String name) – Takes in the name of someone who wants to buy a ticket and adds it to the END of the queue.
    */
    public void Add(String name) {
         List.AddAtEnd(name);
    }
    /*
    public String Process() – Processes the first person waiting in line, removing them from the queue. 
    @return – the name of the person that was just processed.
    */
    public String Process() {
        return List.RemoveFromBeginning();
    }
    /*
   public int NumInFront(String name) – Takes in the name of someone in the queue
    @return – the number of people in from of them in the queue.
    */
    public int NumInFront(String name) {
        return List.IndexOf(name);
    }
    /*
    public void printQueue() – prints out a STRING REPRESENTATION of the queue
    @return – string representation
    */
    public void printQueue() {
         List.toString();
         System.out.println("[*]Queue: " + List);
    }
    /*
   public int getSize() – Returns the number of people in the queue
    @return – number of people in the queue
    */
    public int getSize() {
         return List.getSize();
    }
    /*
    public String nextUp() – Looks at the first person in the queue, and returns their name (But does NOT remove them from the queue!)
    @return – their name 
    */
    public String nextUp() {
        return List.Peek();
    }
}