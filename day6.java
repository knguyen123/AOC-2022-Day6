import java.io.*;
import java.util.*;
public class day6 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("communications.txt"));  
      String s = f.nextLine();
      HashMap<Character, Integer> m = new HashMap<>(); 
      int n = 0;
      boolean b = false;
      for(char c: s.toCharArray()){
         n++;
         if(m.containsKey(c)){
            m.put(c, m.get(c)+1);
         }else{
            m.put(c, 1);
         }
         if(n-1-4>=0){
            char c4 = s.charAt(n-1-4);
            if(m.get(c4)==1){
               m.remove(c4);
            }else{
               m.put(c4, m.get(c4)-1);
            }
         }
         if(n>3){
            for(Character key: m.keySet()){
               if(m.get(key)!=1){
                  b = false;
                  break;
               }
               b = true;   
            }
            if(b){
               break;
            }
         }
      }
      System.out.print(n+"");
  }
}