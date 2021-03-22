package MainPackage;

import java.util.ArrayList;

public class Requirement {
  String field;
  double fiedFrequency=-1;
  String operator;
  double opFrequency=-1;
  
  ArrayList<Integer> distribution=new ArrayList<Integer>();
   ArrayList<Integer>  operatorDistribution=new ArrayList<Integer>();
  int numberOfFields;
  int numberOfOperators;
  
  
public Requirement(String field, double fiedFrequency, String operator, double opFrequency) {
	this.field = field;
	this.fiedFrequency = fiedFrequency;
	this.operator = operator;
	this.opFrequency = opFrequency;
}
public Requirement(String field,double fieldFrequency) {
  this.field=field;
  this.fiedFrequency=fieldFrequency;
}
public void updateRequirement(int n) throws Exception {
	if(fiedFrequency!=-1) {
	numberOfFields=(int) Math.round(fiedFrequency*n);
	if(numberOfFields>n) throw new IllegalArgumentException("Frequency for field "+field+" must be in intevarl [0,1]");
	else if(numberOfFields<0) throw new IllegalArgumentException("Frequency for field "+field+" can not be negative");
	UniqRandoms.loadUniqRandoms(distribution,numberOfFields, n);
	if(opFrequency!=-1) {
		numberOfOperators=(int) Math.round(opFrequency*numberOfFields);
	  ArrayList<Integer> positions=new ArrayList<Integer>();
	UniqRandoms.loadUniqRandoms(positions,numberOfOperators, numberOfFields);
	      for(int i=0;i<numberOfOperators;i++)
	   operatorDistribution.add(distribution.get(positions.get(i)));
	   //System.out.println(numberOfFields+", operators= "+ numberOfOperators);
	}
		}
	
	
	
}


}
