package lab9;

import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class TestHashTable {
	
	public static void main(String[] args) {

		HashTable hash = new HashTable();

		InputStreamReader reader = new InputStreamReader(System.in);
	
		StreamTokenizer tokens = new StreamTokenizer(reader);
		
		try {
			while (tokens.nextToken() == StreamTokenizer.TT_WORD){		//while next token is string
				switch (tokens.sval){
					case ("addStr"):{							
						tokens.nextToken();
						HashTableData newData = new HashTableData(tokens.sval);		
						hash.insert(newData);
						System.out.println("new element added biatch!");
						} break;
						
					case ("addInt"):{							
						tokens.nextToken();
						HashTableData newData = new HashTableData(tokens.nval);		
						hash.insert(newData);
						System.out.println("new element added biatch!");
						} break;
						
					case ("removeStr"):{								//gets value to matrix at i,j
						tokens.nextToken();
						HashTableData newData = new HashTableData(tokens.sval);		
						hash.remove(newData);
						System.out.println("element removed sis!");
					} break;
					case ("removeInt"):{								//gets value to matrix at i,j
						tokens.nextToken();
						HashTableData newData = new HashTableData(tokens.nval);		
						hash.remove(newData);
						System.out.println("element removed sis!");
					} break;
					case ("clear"):
						hash.clear();
						System.out.println("nothing inside me anymore (2)");
					; break;
		
					case ("print"):{
						hash.showStructure();
						System.out.println("structure showed!");
					} break;
					
	
					case ("Quit"):{								
						return;
					}
					default:	
						System.out.println("The command '" + tokens.sval + "' is invalid");
				}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
	}
	}
}
