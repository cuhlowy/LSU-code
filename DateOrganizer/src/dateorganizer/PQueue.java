package dateorganizer;

import java.util.*;

/**
 * This class describes a priority min-queue that uses an array-list-based min binary heap that implements the PQueueAPI interface. The array holds objects that implement the parameterized Comparable interface.
 * @author Duncan, Chloe Chin
 * @param <E> the priority queue element type. 
 * @since 09/25/23
 * Course: csc 3102
 * Programming Project #: 1
 * Instructor: Dr. Duncan
 */


public class PQueue<E extends Comparable<E>> implements PQueueAPI<E> {    
   /**
    * A complete tree stored in an array list representing the 
    * binary heap
    */
	private ArrayList<E> tree;   
   /**
    * A comparator lambda function that compares two elements of this
    * heap when rebuilding it; cmp.compare(x,y) gives 1. negative when x less than y
    * 2. positive when x greater than y 3. 0 when x equal y
    */   
   
   private Comparator<? super E> cmp;
   
   /**
    * Constructs an empty PQueue using the compareTo method of its data type as the 
	* comparator
    */
   public PQueue() {
       tree = new ArrayList<>();
   }
   
   /**
    * A parameterized constructor that uses an externally defined comparator    
    * @param fn - a trichotomous integer value comparator function   
    */
   public PQueue(Comparator<? super E> fn) {
       tree = new ArrayList<>();
       cmp = fn;
   }

   public boolean isEmpty() {
       return tree.isEmpty();
   }

   public void insert(E obj) {
       tree.add(obj);
       int index = tree.size() - 1;
       
       // Percolate up to maintain the heap property
       while (index > 0) {
           int parentIndex = (index - 1) / 2;
           E parent = tree.get(parentIndex);
           
           // Use the comparator if available, otherwise use natural ordering
           if (cmp != null) {
               if (cmp.compare(obj, parent) < 0) {
                   swap(index, parentIndex);
                   index = parentIndex;
               } else {
                   break;
               }
           } else {
               if (obj.compareTo(parent) < 0) {
                   swap(index, parentIndex);
                   index = parentIndex;
               } else {
                   break;
               }
           }
       }
   }

   public E remove() throws PQueueException {
       if (isEmpty()) {
           throw new PQueueException("Queue is empty.");
       }
       
       // Remove the root (minimum element)
       E root = tree.get(0);
       int lastIndex = tree.size() - 1;
       E last = tree.remove(lastIndex);
       
       if (lastIndex > 0) {
           tree.set(0, last);
           
           // Percolate down to maintain the heap property
           rebuild(0);
       }
       return root;
   }

   public E peek() throws PQueueException {
       if (isEmpty()) {
           throw new PQueueException("Queue is empty.");
       }
       return tree.get(0);
   }

   public int size() {
       return tree.size();
   }
   
   private void swap(int place, int parent) {
       E temp = tree.get(place);
       tree.set(place, tree.get(parent));
       tree.set(parent, temp);
   }

   private void rebuild(int root) {
       int leftChild = 2 * root + 1;
       int rightChild = 2 * root + 2;
       int minIndex = root;

       if (leftChild < tree.size()) {
           if (cmp != null) {
               if (cmp.compare(tree.get(leftChild), tree.get(minIndex)) < 0) {
                   minIndex = leftChild;
               }
           } else {
               if (tree.get(leftChild).compareTo(tree.get(minIndex)) < 0) {
                   minIndex = leftChild;
               }
           }
       }

       if (rightChild < tree.size()) {
           if (cmp != null) {
               if (cmp.compare(tree.get(rightChild), tree.get(minIndex)) < 0) {
                   minIndex = rightChild;
               }
           } else {
               if (tree.get(rightChild).compareTo(tree.get(minIndex)) < 0) {
                   minIndex = rightChild;
               }
           }
       }

       if (minIndex != root) {
           swap(root, minIndex);
           rebuild(minIndex);
       }
   }
}
