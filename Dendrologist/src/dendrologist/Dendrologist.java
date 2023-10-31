package dendrologist;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * A testbed for an augmented implementation of an AVL tree
 * @author William Duncan, Chloe Chin
 * @see AVLTreeAPI, AVLTree
 * <pre>
 * Date: 10-18-2023
 * Course: CSC 3102 
 * Programming Project # 2
 * Instructor: Dr. Duncan 
 * </pre>
 */

public class Dendrologist{
	
    public static void main(String[] args) throws FileNotFoundException, AVLTreeException 
    {
        String usage = "Dendrologist <order-code> <command-file>\n";
        usage += "  <order-code>:\n";
        usage += "  0 ordered by increasing string length, primary key, and reverse lexicographical order, secondary key\n";
        usage += "  -1 for reverse lexicographical order\n";
        usage += "  1 for lexicographical order\n";
        usage += "  -2 ordered by decreasing string length\n";
        usage += "  2 ordered by increasing string length\n";
        usage += "  -3 ordered by decreasing string length, primary key, and reverse lexicographical order, secondary key\n";
        usage += "  3 ordered by increasing string length, primary key, and lexicographical order, secondary key\n";      
        if (args.length != 2)
        {
            System.out.println(usage);
            throw new IllegalArgumentException("There should be 2 command line arguments.");
        }
   
        String file = args[1];
        Scanner inFile=new Scanner(new FileReader(file)); 
        
        Comparator<String>cmp=null;
        
        AVLTree<String>dendrologist;
        
        int orderCode =Integer.parseInt(args[0]);
        
        switch(orderCode){
	    	case 0:
	    		cmp=(a,b)->{
	    			if(a.length()!=b.length()) {
	    				return a.length()-b.length();
	    			}
	    			return -a.compareTo(b);
	    		};
	    		break;
    	
    	case -1:
	    		cmp=(a,b)->{
	    			return -a.compareTo(b);
	    		};
	    		break;
    		
    	case 1:
	    		cmp=(a,b)->{
	    			return a.compareTo(b);
	    		};
	    		break;
    		
    	case -2:
	    		cmp=(a,b)->{
	    			return -a.length()-b.length();
	    		};
	    		break;
    		
    	case 2:
	    		cmp=(a,b)->{
	    			return a.length()-b.length();
	    		};
	    		break;
    		
    	case -3:
	    		cmp=(a,b)->{
	    			if(a.length()!=b.length()) {
	    				return b.length()-a.length();
	    			}
	    			return -a.compareTo(b);
	    		};
	    		break;
    		
    	case 3:
	    		cmp=(a,b)->{
	    			if(a.length()!=b.length()) {
	    				return a.length()-b.length();
	    			}
	    			return a.compareTo(b);
	    		};
	    		break;
       default:
    	   throw new IllegalArgumentException("File Paring Error");
    		
    	
    }
    
    dendrologist=new AVLTree<>(cmp);
    
    while (inFile.hasNext ()) {
    	String lineText=inFile.nextLine();
    	String[]line=lineText.split ("\\s+");
    	String command=line[0];
    	
    	if(line.length==2) {
    		String word=line[1];
    		
    		if(command.equals("Insert")) {
    			dendrologist.insert(word);
    			System.out.println("Inserted: "+ word);
    			
    		}else if(command.equals("delete")) {
    			dendrologist.remove(word);
    			System.out.println("Deleted: "+ word);
    		
    		}else if(command.equals("Gen")) {
    			System.out.println("Genealogy:"+ word);
    			if(dendrologist.inTree(word)) {
    				
    				ArrayList<String>children = dendrologist.getChildren(word);
    				
    				String leftChild = children.get(0);
    				String rightChild = children.get(1);
    				
    				if (children.get(1) == null) rightChild = "NONE";
    				if (children.get(0) == null) leftChild = "NONE";
    				
    				int NumOfAnc = dendrologist.ancestors(word);
    				int NumOfDes = dendrologist.descendants(word);
    				
    				System.out.println("Parent:"+dendrologist.getParent(word) + " left child = " + leftChild + " right child = " + rightChild + " #ancestors:"+NumOfAnc + " #descendants:" + NumOfDes);
    				
    			}else {
    				System.out.println("Genealogy:"+ word+ " UNDEFINED");
    			}
    		}
    	 }
    	
    	else if (command.equals("props")) {
    		System.out.println("Properties:");
    		System.out.println("Size:"+dendrologist.size()+", Height:"+dendrologist.height()+", Diameter:"+dendrologist.diameter());
    		System.out.println("Fibonaaci? = "+dendrologist.isFibonacci()+", Complete? = "+dendrologist.isComplete());
    		
    	 }
    	
    	else if (command.equals("traverse")) {
    		System.out.println("Pre-order Travesal");
    		dendrologist.preorderTraverse(x->System.out.printf("%s%n",x));
    		
    		System.out.println("In-order Travesal");
    		dendrologist.traverse(x->System.out.printf("%s%n",x));
    		
    		System.out.println("Post-order Travesal");
    		dendrologist.postorderTraverse(x->System.out.printf("%s%n",x));
    	}
    }
  }
}      