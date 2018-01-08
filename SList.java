package lab9;
public class SList <AnyType> // Singly linked list
{
	// Data members
	private SListNode<AnyType> head; // Reference to the beginning of the list
	private SListNode<AnyType> cursor; // Reference to current cursor position
	
	
	// Constructors & Helper Method
	// Default constructor: Creates an empty list
	public SList () {
		head = null;
		cursor = head;
	}
	

	// Class methods
	void insert ( AnyType newElement ){
		if (cursor == null){
			cursor = new SListNode<AnyType>(newElement,null);
		}
		else {
			cursor.setNext(new SListNode<AnyType>(newElement,null));
			cursor = cursor.getNext();
		}
	}

	void remove (){
		SListNode <AnyType>toDelete = cursor;
		if (gotoPrior()) {
			//had privious
			cursor.setNext(toDelete.getNext());
			toDelete = null;
		}
	}

	void replace ( AnyType newElement ){
		cursor.setElement(newElement);
	}
	
	void clear ( ){
		SListNode <AnyType>toDelete;
		cursor = head;
		
		while (cursor != null) {
			toDelete = cursor;
			cursor = toDelete.getNext();
			toDelete = null;
		}
		gotoBeginning();
	}
	
	boolean isEmpty (){
		return (head == null);
	}
	
	boolean gotoBeginning (){
		if (!isEmpty()) {
			cursor = head;
			return true;
		}
		return false;
	}
	
	boolean gotoEnd (){
		if (isEmpty())
			return false;
					
		while (gotoNext());
		
		return true;
	}
	
	boolean gotoNext(){
		if (cursor.getNext() != null) {
			cursor = cursor.getNext();
			return true;
		}
		return false;
	}
	
	boolean gotoPrior ( ){
		SListNode <AnyType>cur;
		cur = head;
		while (cur.getNext() != null) {
			if (cur.getNext() == cursor) {
				cursor = cur;
				return true;
			}
			cur = cur.getNext();
		}
		return false;
	}
	
	AnyType getCursor (){
		return cursor.getElement();
	}
	
	void showStructure (){
		SListNode <AnyType>cur = head;
		while (cur != null)
		{
			System.out.println(cur.getElement());
			cur = cur.getNext();
		}
	}
	
	public boolean findElement(AnyType toFind) {
		SListNode <AnyType> cur = head;
		
		while (cur != null)
		{
			if (cur.getElement() == toFind) {
				cursor = cur;
				return true;
			}
			cur = cur.getNext();
		}
		return false;
	}
	
} // class SList