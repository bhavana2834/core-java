package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionMethod {
                  public static void main(String met[]) {
                	  Collection  data =new ArrayList();
                	  
                	  data.add("Divya");
                	  data.add("Spurthi");
                	  data.add("Deepika");
                	  data.add("Yaseen");
                	  data.add(9902456722L);
                	  data.add(87675.989);
                	  data.add('B');
                	  data.add("abcd");
                	  data.add(68778);
                	  data.add(2255.22);
                	  
                	  System.out.println(data);
                	  
                	  System.out.println(data.contains("Spurthi"));
                	  System.out.println(data.size());
                	  System.out.println(data.equals("Divya"));
                	  System.out.println(data.isEmpty());
                	  System.out.println(data.remove('B'));
                	  
                	  
                	  
                	  
                	  
                	  
                  }
}
