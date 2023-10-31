
public class Queue {
	LinkedList <String> List;

    public Queue() {
        List = new LinkedList<String>();
    }

    public void Add(String name) {
         List.AddAtEnd(name);
    }

    public String Process() {
        return List.RemoveFromBeginning();
    }

    public int NumInFront(String name) {
        return List.IndexOf(name);
    }

    public void printQueue() {
         List.toString();
         System.out.println("[*]Queue: " + List);
    }

    public int getSize() {
         return List.getSize();
    }

    public String nextUp() {
        return List.Peek();
    }
}