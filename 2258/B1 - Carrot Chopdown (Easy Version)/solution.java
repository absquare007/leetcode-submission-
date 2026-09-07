import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] cnt=new int[M+1];
		for(int ctr=1;ctr<=N;ctr++){
			int curr=sc.nextInt();
			cnt[curr]++;
		}
		int[] psum=new int[M+1];
		for(int i=1;i<=M;i++){
			psum[i]=psum[i-1]+cnt[i];
		}
		int ans=0;
		for(int x=1;x<=M;x++){
			int car=psum[M]-psum[x-1];
			if(2*x<=M){
				car+=cnt[2*x];
			}
			ans=Math.max(ans,car);
		}
		System.out.println(ans);
		
	}
	}
}