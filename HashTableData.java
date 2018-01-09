package lab9;

public class HashTableData{
	private String key; 

	//c'tor
	public HashTableData ( String key){
		this.key = key;
	}
	
	public HashTableData (double key)
	{
		this.key = Double.toString(key);
	}
	
	public HashTableData (){
		this.key = "";
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	
	
	public String toString() {
		return key;
	}

} 