package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTester2 {
            public static void main(String arg[]) {
            	
            	List data=new ArrayList();
            	
            	
            	data.add(0,"Spurthi");
            	data.add(1,"Divya");
            	data.add(2,43877);
            	data.add(3,588.24);
            	data.add(4,"Bhavana");
            	
            	
            	List data1=new Vector();
            	
            	data1.add(0,"Fruites");
            	data1.add(1,"Vegetables");
            	data1.add(2,"Lakshmi");
            	data1.add(3,"Navya");
            	data1.add(4,"Kshema");
            	data1.add(5,7989090457L);
            	data1.add(6,34677.3667);
            	data1.add(7,"Bhavana");
            	
            	System.out.println(data);
            	System.out.println(data1);
            	System.out.println(data.removeAll(data1));
            	System.out.println(data);
            	System.out.println(data.addAll(data1));
            	System.out.println(data);
            	System.out.println(data.removeAll(data1));
            	System.out.println(data);
            	System.out.println(data1);
            	System.out.println(data.containsAll(data1));
            	System.out.println(data.addAll(4, data1));
            	System.out.println(data);
            	System.out.println(data1);

            	System.out.println(data.hashCode());
            	System.out.println(data);
          	
            }
}
