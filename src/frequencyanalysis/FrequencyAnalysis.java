/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencyanalysis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FrequencyAnalysis {

    /**
     * @param args the command line arguments
     */
    
    static <K,V extends Comparable<? super V>> 
            List<Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

    List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());

    Collections.sort(sortedEntries, 
            new Comparator<Entry<K,V>>() {
                @Override
                public int compare(Entry<K,V> e1, Entry<K,V> e2) {
                    return e2.getValue().compareTo(e1.getValue());
                }
            }
    );

    return sortedEntries;
}
    public static void main(String[] args) {
        // TODO code application logic here
      String str = null;
      StringBuffer capitalLetter = null;
      StringBuffer smallLetter = null;
      try {
      File myObj = new File("C:\\Users\\User\\Desktop\\Adedeji Java\\analysis_cipher.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        str = myReader.nextLine();
        System.out.println(str);
      }
      //System.out.println(data);
      myReader.close();
        } 
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
       
        String strpStr = str.replaceAll("[,.' ]", "");
        //System.out.println(strpStr);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char ch : strpStr.toCharArray()){
            
            if(map.get(ch) == null){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
        
        map.forEach((key, value)-> {
            //System.out.print(sortedEntries.sort(key + "->" + value+ ", "));
            System.out.print(entriesSortedByValues(map));
        
        });
        
       System.out.println(" \nOption: \n 1) Take replace rule \n 2) Exit");
       
       Scanner sc = new Scanner(System.in);
        String option = sc.next();
           if(Integer.parseInt(option) == 1){
                System.out.println("Please Enter Your New Rule");
                Scanner sc1 = new Scanner(System.in);
                String rule = sc1.nextLine();
                String filteredRule = rule.replaceAll("[,:]", "");
                System.out.println("Your New Rule is \n" +filteredRule);
                System.out.println("The Cipher Text \n" +str);
                //loop through each character of the filtered Rule
                for(int i =0; i<filteredRule.length(); i++){
                    //System.out.println(filteredRule.charAt(i));
                    
                }
                //System.out.println("The Cipher Text \n" +str);
                
          //A:b,B:k,C:f,D:l,E:m,F:n,G:o,H:p,I:h,J:q,K:r,L:s,M:a,N:c,O:t,P:i,Q:u,R:g,S:e,T:j,U:d,V:v,W:w,X:x,Y:y,Z:z
         }else{
              System.out.println("System Will Exit");
           }
    }
 }
    
