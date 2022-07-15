import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
public static int sq(int side){
                return side*side;
        }
 public static boolean check(int coordinates[]){
                int a,b,c;
a=sq(coordinates[0]-coordinates[2])+sq(coordinates[1]-coordinates[3]);
b=sq(coordinates[0]-coordinates[4])+sq(coordinates[1]-coordinates[5]);
c=sq(coordinates[2]-coordinates[4])+sq(coordinates[3]-coordinates[5]);
                if (a==0 || b==0 || c==0)
                        return false;
                if (a+b==c||a+c==b||b+c==a){
                        return true;
                }
            return false;
        }
        public static void main(String s[])
          {
            Scanner sc = new Scanner(System.in);
            int coordinates[]=new int[6];
            for(int i=0;i<6;i++)
                coordinates[i]=sc.nextInt();
            if(check(coordinates)){
                    System.out.println("Right");
                    return ;
            }
for(int i=0;i<6;i++){
 coordinates[i]++;
                if(check(coordinates)){
 System.out.println("Special");
                    return ;
                }
        coordinates[i]--;   
        coordinates[i]--;
        if(check(coordinates)){
        System.out.println("Special");
        return ;
                }
 coordinates[i]++; 
            }

 System.out.println("Simple");
}
}