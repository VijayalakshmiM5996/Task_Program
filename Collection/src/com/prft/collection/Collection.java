package com.prft.collection;
import java.util.*;  
 class Collection{  
 public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();   
      list.add("Deepika");   
      list.add("Deekshitha");    
      list.add("Saranya");    
      list.add("Shruthi");
      list.add("Deekshitha");
      System.out.println("Adding the elements in ArrayList\n"+list);  
      Iterator itr=list.iterator(); 
      System.out.println("Added elements using iterator :");
      while(itr.hasNext()){  
       System.out.println(itr.next());}
       list.remove("Deepika"); 
       System.out.println("After Removing the element from the list :\n"+list+
    		   "\n Get method : "+list.get(2));
       list.clear();
       System.out.println("After clear all the element : "+list);       
       System.out.println("The element is empty : "+list.isEmpty());
       LinkedList<String> list1=new LinkedList<String>();
       list1.add("Sriram");
       list1.add("shreenath");     
      list1.addLast("yeswanth");
      System.out.println("Linked List elements : "+list1);
      System.out.println("Adding First Element : ");
      list1.addFirst("Aishu");
      System.out.println(list1+"\n The Size of the elements : "+list1.size());
      //HashSet 
      HashSet<String> set=new HashSet<String>(); 
      set.addAll(list1);
      Iterator itr1=list1.iterator();
      System.out.println("Add all the elements from list1 to set : ");
      //set does not allow duplicate values eg deekshitha
      while(itr1.hasNext()) {
      System.out.println(itr1.next());
      }
      System.out.println("PeekFirst which returns the first and element and does not remove the 1st elements : "
      		+list1.peekFirst());
      System.out.println(""+set);
      //Tree set
      TreeSet<String> treeset=new TreeSet<String>();
      treeset.add("CTS");
      treeset.add("wipro");
      treeset.add("Perficient");
      treeset.add("TCS");
      System.out.println("The treeset shows in ascending order : "+treeset);
      System.out.println("After adding the decending order : "+treeset.descendingSet());
      System.out.println("Head Set: "+treeset.headSet("TCS", true));      
      System.out.println("SubSet: "+treeset.subSet("CTS", false, "wipro", true));  
      System.out.println("TailSet: "+treeset.tailSet("Perficient", false)); 
    //MAP
      Map<Integer,String> map=new HashMap<Integer,String>();  
      map.put(1,"Lead");  
      map.put(2,"Senior");  
      map.put(3,"Technical"); 
      map.putIfAbsent(5, "Intern");  
      System.out.println("After invoking putIfAbsent() method and Hash map class "); 
      map.put(4,"Associate");
      map.put(6,"Director");
      //Elements can traverse in any order  
      for(Map.Entry m:map.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());
           }
      map.remove(6,"Director");
      System.out.println("After using remove method : "+map);      
 }}
 
