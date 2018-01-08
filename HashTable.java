
public class HashTable {
	private static final int DEF_MAX_HASH_SIZE = 10; // Default maximum hash table size
	private SList < HashTableData> [ ] hashArray; // Array containing the lists of keys
	
	// Constructor: default size
	public HashTable () {
		setup(DEF_MAX_HASH_SIZE);
	}
	
	
	// Constructor: specific size
	public HashTable ( int maxNumber ) {
		setup(maxNumber);
	}
	
	// Called by constructors only
	private void setup ( int maxNumber ) {
		hashArray =(SList<HashTableData>[]) new SList<?>[maxNumber];
		for (int i = 0; i < hashArray.length; i++) {
			hashArray[i] = new SList<HashTableData>();
		}
	}
	
	int HashFunction ( int key ) {
		if (key<0)
			return -1;
		return key%hashArray.length;
	}
	
	
	int HashFunction ( String key ){
		return HashFunction(stringToInt(key));
	}
	
	public boolean retrieve ( HashTableData searchElem) {
		if(hashArray[HashFunction(searchElem.getKey())] == null)
			return false;
		
		if (hashArray[HashFunction(searchElem.getKey())].findElement(searchElem))
			return true;
		
		return false;
		
	}
	
	
	public boolean insert ( HashTableData newElem) {
		if (isFull())
			return false;
		
		int spotOfNewElemInHashArray = HashFunction(newElem.getKey());
	
		hashArray[spotOfNewElemInHashArray].insert(newElem);
		
		return true;
	}
	
	
	public boolean remove ( HashTableData remElem) {
		int spotOfremElemInHashArray = HashFunction(remElem.getKey());
		
		if (retrieve(remElem))
		{
			hashArray[spotOfremElemInHashArray].remove();
			return true;
		}
		else
			return false;
	}
	
	// Hash status methods
	public void clear ( ) {
		for (int i=0; i<hashArray.length; i++)
			hashArray[i].clear();
	}
	
	
	public boolean isEmpty ( ) {
		for (int i=0; i<hashArray.length; i++) 
			if (hashArray[i] != null)
				return false;
		return true;
	}
	
	
	// Output the hash structure
	public boolean isFull ( ) {
		return false;
	}
	
	
	public void showStructure ( ) {
		for (int i=0; i<hashArray.length; i++) 
			hashArray[i].showStructure();
	}
	
	private int stringToInt(String key) {
		int sum = 0;
		
		for (int i=0; i<key.length(); i++) {
			sum += key.charAt(i);
		}
		return sum;
	}
} 