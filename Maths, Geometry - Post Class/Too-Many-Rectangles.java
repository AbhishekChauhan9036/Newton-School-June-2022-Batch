import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Main {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
	  	int n = input.nextInt();
		int c = 4*n+1;
		ArrayList<pair> arr=new ArrayList<>();
		//ArrayList<int[]> arr=new ArrayList<>();
		while(c-->0){
			int x = input.nextInt();
			int y = input.nextInt();
			arr.add(new pair(x,y));
		}
		HashMap<Integer,Integer> X = new HashMap<>();
		HashMap<Integer,Integer> Y = new HashMap<>();
		for(int i = 0;i<arr.size();i++){
			//int[] p=arr.get(i);
			pair p=arr.get(i);
			// int a=p[0];
			// int b=p[1];
			int a=p.x;
			int b=p.y;
			if(!X.containsKey(a))
				X.put(a,1);
			else 
				X.put(a,X.get(a)+1);			  
			if(!Y.containsKey(b))
				Y.put(b,1);			  
			else
				Y.put(b,Y.get(b)+1);
						  
		}			  
		int x_coordinate=0,y_coordinate=0;
		for(Map.Entry<Integer,Integer>entry:X.entrySet()){
			if(entry.getValue()%2!= 0){
				x_coordinate = entry.getKey();
				break;
			}
		}
		for(Map.Entry<Integer,Integer>entry:Y.entrySet()){
		  	if(entry.getValue()%2 != 0){
				y_coordinate = entry.getKey();
				break;
			}
		}
		System.out.println(x_coordinate+" "+y_coordinate);

					  
	}
}