
public class Main {

	public static void main(String[] args) {
		
		int[] f = new int[5];
		
		f[0] = 8;
		
		for(int i = 1; i < 5; i++)f[i]=0;
		
		int r = 0;
		
		while(f[4] != 8) {
			r++;
			
			for(int i:f) {
				if(i>4) {
					r--;
					break;
				}
			}
			
			for(int i = 3; i >= 0; i--) {
				
				if(f[i]!=0) {
					
					f[i] --;
					int t = f[4];
					f[4] = 0;
					f[i+1] = 1 + t;
					break;
					
				}
				
			}
			
			for(int i:f)System.out.print(i);
			System.out.println();
			
		}
		
		System.out.println(r);
		

	}

}
