package CUS1156_Lab2;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	
   public static int countUnique(ArrayList<String> list)
   {
	 HashSet<String> fruits = new HashSet<>(list);
	 return fruits.size();
   }
   
   
   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard"); 
	  words.add("apple");  
	  words.add("orange"); 
	  words.add("sun");  
	  words.add("moon"); 
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
