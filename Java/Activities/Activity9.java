package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		
		 //declaring Arraylist of String objects
       List<String> myList = new ArrayList<>();
     //Adding 5 objects to Array List 
       myList.add("Apple");
       myList.add("Mango");
       myList.add("Orange");
       
       //Adding object at specific index
       myList.add(2, "Grapes");
       myList.add(1, "Papaya");
       System.out.println(myList);
       
       for(String name : myList){
           System.out.println(name);
       }
           //Print the 3rd element
           System.out.println("3rd element in the list is: " + myList.get(2));
           
           //Search for a name
           System.out.println("Is Mango is in list: " + myList.contains("Mango"));
           
           //Remove a value
           myList.remove(3);
           myList.remove("Apple");
           
           //Print the size
           System.out.println("New Size of ArrayList: " + myList.size());
           System.out.println(myList);
       

	}

}
