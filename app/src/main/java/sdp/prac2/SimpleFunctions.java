package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
       //code goes here
       
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> results = new ArrayList<Integer>();
    
       
       for (int i = 0; i < number.size(); i++) 
       {
           if(number.get(i) % 100 != 0)
           {
               int devide = (number.get(i) / 100 ) + 1;
               results.add(devide * 100);
               
           }
           else if(number.get(i) % 100 == 0) {
               results.add(number.get(i));
           }
           
       } 
       
       System.out.println(results);
            
     }
}
