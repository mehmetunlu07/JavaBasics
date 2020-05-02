package com.syntax.class30;
import java.util.*;
import java.util.Map.*;
//Create a Method in Main class using below specification. 
//Method Name: Display. Return Type: Void  Parameters : Map<String,Integer>
//Logic: 
//First the method will check the given map is empty or not. 
//If the map is not empty print pairs of key and value using loops
//If map is empty simply print "map is empty"
//NOW IN MAIN METHOD
//Create HashMap of String keys and Integer values
//add values as below
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//using created display method to display. then clear the map. use the same method to display
class Repl204 {
  
   public static void display(Map<String, Integer> map)  {
       if (map.isEmpty()){ 
            System.out.println("map is empty"); 
        }else{ 
            for (String keys : map.keySet()) {
              System.out.println (keys + " : " + map.get(keys));
            }
        } 
     }
  public static void main(String[] args) {
   Map<String, Integer> map = new HashMap<>(); 
          
        map.put("mango", 10); 
        map.put("apple", 30); 
        map.put("orange", 20); 
     display(map); 
     map.clear();
     display(map); 
  }
}