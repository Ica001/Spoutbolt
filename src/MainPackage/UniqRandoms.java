package MainPackage;

import java.util.ArrayList;
import java.util.Random;

public class UniqRandoms {
 
	public static void loadUniqRandoms(ArrayList<Integer> output,int size,int n) {
		ArrayList<Integer> availablePositions=GeneratorSubscriptions.availablePositions;
	
		Random rand=new Random();
		int k=0;
		//System.out.println("size is"+size);
		for(int i=0;i<size;i++) {
			
			if(availablePositions.size()==0) {
				for(int j=0;j<n;j++) {
					availablePositions.add(j);
				}
				}
			k=rand.nextInt(availablePositions.size());
		       int z=	availablePositions.get(k);
			if(!output.contains(z))
			output.add(z);
			else size++;
			availablePositions.remove(k);
			
			//System.out.println(availablePositions);
			
		}
		
	}
	
}
