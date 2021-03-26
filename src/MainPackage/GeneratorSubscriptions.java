package MainPackage;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GeneratorSubscriptions {
	static ArrayList<Integer> availablePositions=new ArrayList<Integer>();
	Random random=new Random();
	private ArrayList<Requirement> requirements=new ArrayList<Requirement>();

	public void setFieldFrequency(String field, double frequency) {
		requirements.add(new Requirement(field,frequency));
		
	}

	public void setFieldWithOperatorFrequency(String field, double fild_fr, String operator, double op_fr) {
		requirements.add(new Requirement(field, fild_fr,operator,op_fr));
	}
	
	public void  gennerateSubscriptions(int n) {
		
		ArrayList<AtomicSubscription> atomicSubscriptionts=new ArrayList<AtomicSubscription>();
		System.out.println("atomic subscription done!");
		requirements.forEach(req->{
			try {
				req.updateRequirement(n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println("update requirements! done");
		FileWriter fr=null;
		System.out.println("file wirter done");
		try {
			fr=new FileWriter("subscriptions.txt");
		for(int i=0;i<n;i++) {
			for(int j=0;j<requirements.size();j++) {
				 Requirement req=requirements.get(j);
				if(req.distribution.contains(i)) { atomicSubscriptionts.add(generateAtomicSubscription( i,req));}
				
			}
			//System.out.println(completeSubscription(atomicSubscriptionts));		
			String subscription=completeSubscription(atomicSubscriptionts).toString();
			
			
				
				fr.write(subscription+"\n");
			 
			atomicSubscriptionts=new ArrayList<AtomicSubscription>();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

	

	private  ArrayList<AtomicSubscription> completeSubscription(ArrayList<AtomicSubscription> atomicSubscriptionts) {
		 int maxfields=GeneratorRandomAtomicSubscription.FIELDS.length-atomicSubscriptionts.size();
		 int c=0;
		 if(maxfields!=0)
         c=random.nextInt(maxfields);
		 /// c=random.nextInt(maxfields);
		 //System.out.println("c="+c);
		for (int i=0;i<c;i++) {
			AtomicSubscription atom=GeneratorRandomAtomicSubscription.generate(atomicSubscriptionts,requirements);
			//System.out.println("generate..");
			if(atom!=null)
			atomicSubscriptionts.add(atom);
	}
		return atomicSubscriptionts;
		}

	private AtomicSubscription generateAtomicSubscription(int i,Requirement req) {
		 String field= req.field;
		 String operator="";
		 if(req.operatorDistribution.contains(i)) {
		   operator  = req.operator;}
		 else operator=GeneratorRandomAtomicSubscription.OPERATORS[random.nextInt(6)];
		    Object value= GeneratorRandomAtomicSubscription.generateRandomValue(field);
		 return new AtomicSubscription(field,operator,value);
		 
	}


	
	
	
	
}
