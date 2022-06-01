package jsjf;

import java.io.Serializable; 
import java.util.Iterator;
import jsjf.*;
import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;
import jsjf.exceptions.NonComparableElementException;

public class LinkedOrderedList<T> implements ListADT<T>, OrderedListADT<T>
	,Serializable
{

	   protected int count;
	   protected LinearNode<T> head, tail;
	   protected int modCount;

	/** Creates an empty list.
	*/
	   public LinkedOrderedList() 
	   {
	      count = 0;
	      head = tail = null;
	      modCount = 0;
	   }
	   
	   @Override
	   public void add(T element) throws NonComparableElementException 
	   {
	      LinearNode<T> current = head;
	      LinearNode<T> previous = null;
	      boolean found = false;
	   
	      LinearNode<T> newNode = new LinearNode<T>(element);
	   
	      if (isEmpty()) { // Make a new list of just this new node.
	         head = newNode;
	         tail = newNode;
	         count++;
	         modCount++;
	      } 
	      else { 
	         if (!(element instanceof Comparable))
	            throw new NonComparableElementException("OrderedList");
	         Comparable<T> currentElement = (Comparable<T>) current.getElement();
	         while (current != null && currentElement.compareTo(element) < 0) {
	            previous = current;
	            current = current.getNext();
	            if (current != null)
	               currentElement = (Comparable<T>) current.getElement();
	         }
	         if (previous != null) 
	            previous.setNext(newNode);   
	         else
	            head = newNode;
	         if (current == null)
	            tail = newNode;
	        	 
	         newNode.setNext(current);
	         count++;
	         modCount++;
	      }
	   }
	   
	   public void add(int index, T element)
	   {
		   LinearNode<T> current = head;
		   LinearNode<T> previous = null;

		   LinearNode<T> newNode = new LinearNode<T>(element);
			   
		   if (isEmpty()) // Make a new list of just this new node.
		   { 
			   head = newNode;
		       tail = newNode;
		       count++;
		       modCount++;
		   }
		   else
		   {
	           // LinearNode<T> current = this.head;

	            for(int i = 0; i < index; i++)
	            {
	            		previous = current;
	                current = current.getNext();
	            }
	           
		         if (previous != null) 
		            previous.setNext(newNode);   
		         else
		            head = newNode;
		         if (current == null)
		            tail = newNode;
		        	 
		         newNode.setNext(current);
		         count++;
		         modCount++;
	           
	        }
	
       } 
		   
	   
	   
	   /** Removes the first instance of the specified element 
	   * from this list and returns it. Throws an EmptyCollectionException
	   * if the list is empty. Throws an ElementNotFoundException if the
	   * specified element is not found in the list.
	   */
	   public T remove(T targetElement) throws EmptyCollectionException,
	      											ElementNotFoundException 
	   {
	      if(isEmpty())
	         throw new EmptyCollectionException( "LinkedList" );
	         
	      boolean found = false;
	      LinearNode<T> previous = null;
	      LinearNode<T> current = head;
	      
	      while(current != null && !found)
	         if( targetElement.equals( current.getElement() ) )
	            found = true;
	         else {
	            previous = current;
	            current = current.getNext();
	         }
	            
	      if( ! found )
	         throw new ElementNotFoundException( "LinkedList" );
	         
	      if( size() == 1 ) // there was only one element in the list,
	                        // and we just removed it.
	         head = tail = null;    
	      else if (current.equals( head )) // target is at the head
	         head = current.getNext();
	      else if (current.equals( tail )) // target is at the tail
	      {
	         tail = previous;
	         tail.setNext( null );
	      } 
	      else // target is in the middle
	         previous.setNext( current.getNext() );
	      
	      count--;
	      
	      modCount++;
	      return current.getElement();     
	   }
	   
	   /** Returns true if list is empty.
	   * @return true if list is empty
	   */
	   public boolean isEmpty() 
	   {
	      return count == 0;
	   }
	   
	   /** Returns element at the head of the list.
	   * @return element at the head of the list.
	   */   
	   public T first() throws EmptyCollectionException 
	   {
	      if (size() == 0)
	         throw new EmptyCollectionException( "LinkedList" );
	      return head.getElement();  
	   }

	   /** Returns element at the tail of the list.
	   * @return element at the tail of the list.
	   */
	   public T last() throws EmptyCollectionException {
		   
	      if(isEmpty())
	         throw new EmptyCollectionException( "LinkedList" );      
	      return tail.getElement();
	   }

	   public Iterator<T> iterator() 
	   {
	      return new ListIterator(this);
	   }

	   @Override
	   public T removeFirst() throws EmptyCollectionException
	   {
	      if (count == 0)
	         throw new EmptyCollectionException("LinkedList");
	   	
	      T element = head.getElement();
	      head = head.getNext();
	      count --;
	      return element;		
	   }
	   
		/**
		 * Removes and returns the last element in the list
		 * @return element at the tail of the list
		 */
	   @Override
	   public T removeLast() 
	   {
	      T element;
	      LinearNode<T> previous = null;
	      LinearNode<T> current = head;
	       
	      if(isEmpty())
	         throw new EmptyCollectionException( "LinkedList" );
	      element = tail.getElement();
	      if(size() == 1) {
	         tail = head = null;
	      }
	      else { // need to traverse list to find second-to-last
	         while(current != tail) {
	            current = current.getNext();
	            previous = current;
	         }
	         tail = previous;
	      }    
	      return element;
	   }

		/**
		 * Checks the list to see if it contains the specified object
		 * @param target the object to check for
		 * @return boolean of whether the object was found
		 */
	   @Override
	   public boolean contains(T target) 
	   {
	      if (count == 0) 
	         throw new EmptyCollectionException( "LinkedList" );
	            
	      boolean found = false;
	      LinearNode<T> current = head;
	         
	      while (current != null && !found) {
	         if(target.equals(current.getElement()))
	            found = true;
	         else
	            current = current.getNext();
	      }	      
	      return found;     
	   }
	   
	   /**
	    * 
	    * @param element
	    * @return
	    */
	   public int indexOf(T element)
	   {
		   int index = 0;
		   if (count == 0) 
		         throw new EmptyCollectionException( "LinkedList" );
		            
		      boolean found = false;
		      LinearNode<T> current = head;
		         
		      while (current != null && !found) 
		      {
		         if(element.equals(current.getElement()))
		         {
		            found = true;
		         index++;
		         }
		         else
		         {
		            current = current.getNext();
		         }
		      }	      
		   
		   return index;
	   }
		
		/**
		 * Returns an integer that is the size of the list
		 * @return the size of the list
		 */
	   @Override
	   public int size() 
	   {
	      return count;
	   }

		public void set(int targetIndex, T element) 
		{
			 LinearNode<T> current = head;
			   LinearNode<T> previous = null;

			   LinearNode<T> newNode = new LinearNode<T>(element);
				   
			   if (isEmpty()) // Make a new list of just this new node.
			   { 
				   head = newNode;
			       tail = newNode;
			       count++;
			       modCount++;
			   }
			   else
			   {
		           // LinearNode<T> current = this.head;

		            for(int i = 0; i < targetIndex; i++)
		            {
		            		previous = current;
		                current = current.getNext();
		            }
		           
			         if (previous != null) 
			            previous.setNext(newNode);   
			         else
			            head = newNode;
			         if (current == null)
			            tail = newNode;
			        	 
			         newNode.setNext(current);
			         count++;
			         modCount++;
		           
		        }
			
		}
}
