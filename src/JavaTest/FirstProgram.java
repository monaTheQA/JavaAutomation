package JavaTest;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstProgram {

	public static void main(String[] args) {
		//added new testcase
		// TODO Auto-generated method stub
		
		//System.out.println("Hello");
		//CommanClass cc = new CommanClass();
		//cc.add();
		//public static void main(String args[]) {  
			   // create and populate hash map  
		HashMap<Integer, String> map = new HashMap<Integer, String>();           
		   map.put(1,"Java");  
		   map.put(2, "Python");  
		   map.put(3, "PHP");  
		   map.put(4, "SQL");
		   map.put(5, "C++");
		   System.out.println("Tutorial in Guru99: "+ map);    
		   // Remove value of key 5  
		   map.remove(5);  
		   System.out.println("Tutorial in Guru99 After Remove: "+ map);
		   HashMap<String, String> hashmap = new HashMap<String, String>();
		   hashmap.put("abc", "Test");
		   hashmap.put("123","Test2");
		   System.out.println(hashmap);
		/////////////////////////////////////////////////////////   
		   ArrayList<String> arlist = new ArrayList<String>();
		   arlist.add("3");
		   arlist.add("test");
		   arlist.add("Java");
		   arlist.add("Selenium");
		   System.out.println(arlist);
		   arlist.remove(2);
		   System.out.println(arlist);
		   
		   
		   

			   }
		
	}
	
	


