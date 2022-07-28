import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

class Solution{
   static int longestSubstrDistinctChars(String S){
       HashMap<Character,Integer>map=new HashMap<>();
       int count=0,max=0;
       for(int i=0;i<S.length();i++){
           char x=S.charAt(i);
           if(!map.containsKey(x))

            {
               map.put(x,i);
               count++;               
             }   else

               {
                  i=map.get(x);
                  map.clear();count=0;
                }
           if(max<count){
               max=count;
               }
               
       }
      return max; 
   }
}