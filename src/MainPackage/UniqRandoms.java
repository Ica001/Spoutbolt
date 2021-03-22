package MainPackage;

import java.util.ArrayList;
import java.util.Random;

public class UniqRandoms {
 
	public static void loadUniqRandoms(ArrayList<Integer> output,int size,int n) {
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=i;
		}
		
		Random rand=new Random();
		int p=n;
		for(int i=0;i<size;i++) {
			int k=rand.nextInt(p);
			output.add(a[k]);
			a[k]=a[p-1];
			p--;
		}
	}
	
}
