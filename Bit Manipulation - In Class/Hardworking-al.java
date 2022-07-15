import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> list =  new ArrayList<Long>();
        int incrementer = 0;
        long andd = 1;
        long n = sc.nextLong();
        for(;andd <=10000000000000L;){
             list.add(andd);
             andd = andd * 2;
        }
        int nn =( list.size()-1);
        for(int i=nn;i>=0;i--){
            if(list.get(i)<=n){incrementer++;
                n = n - list.get(i);            
            }
        }
     System.out.print(incrementer);
    }
}