/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.io.*; 
import java.util.*; 
class Main {
    public static void main (String[] args) {
       Scanner inp=new Scanner(System.in);
       double a,b,c,root1,root2;
			int temp;
			a=inp.nextDouble();
			b=inp.nextDouble();
			c=inp.nextDouble();
			double dt=(b*b)-(4.0*a*c);
			if(dt>0.0)
				temp=1;
			else if(dt==0.0)
				temp=0;
			else
				temp=-1;
			switch(temp)
			{
				case 1:
					root1=(-b+Math.sqrt(dt))/(2.0*a);
					root2=(-b-Math.sqrt(dt))/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root2);
					break;
				case 0:
					root1=-b/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root1);
					break;
				case -1:
					root1=-b/(2.0*a);
					root2=Math.sqrt(-dt)/(2.0*a);
					System.out.format("%.2f+",root1);
					System.out.format("i%.2f",root2);
					System.out.format("\n%.2f-",root1);
					System.out.format("i%.2f",root2);
					
					break;
			}
    }
}
/******************************************************************************************************************************************/
/***********End****************/