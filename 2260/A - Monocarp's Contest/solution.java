import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			boolean first=false;
			boolean last=false;
			int cntz=0;
			for(int i=0;i<N;i++){
				int num=sc.nextInt();
				if(num==0 && i==0)first=true;
				else if(num==0 && i==N-1) last=true;
				else if(num==0) cntz++;
				
			}
			if(first && last) System.out.println(0);
			else if(!first && !last && cntz>1) System.out.println(2);
			else if(((!first && last)||(!last && first )) && cntz>0) System.out.println(1);
			else System.out.println(-1); 
		}
	}
}