package MainPackage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		new Domains().fillDoamains("config.json");
//		GeneratorPublications genPub=new GeneratorPublications();
//		FileWriter fr=new FileWriter("publications.txt");
//		genPub.generatePublications(100).forEach(pub->{
//			
//				try {
//					fr.write(pub.toString()+"\n");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//	
//		});
//		fr.close();
//
		
		
    	GeneratorSubscriptions genSub=new GeneratorSubscriptions();
     	
     	genSub.setFieldFrequency("city", 0.3);
     	genSub.setFieldFrequency("rain", 0.3);
     	genSub.setFieldFrequency("direction", 0.0);
     	genSub.setFieldFrequency("temp", 0.0);
     	genSub.setFieldFrequency("wind", 0.0);
     	genSub.setFieldFrequency("date", 0.0);
    	//genSub.setFieldWithOperatorFrequency("stationId", 0.5,"!=" ,0.5);
    	genSub.setFieldFrequency("stationId", 0.7);
     	//genSub.setFieldWithOperatorFrequency("wind", 0.1, "==", 1.0);
    
    	//genSub.setFieldFrequency("temp", 0.1);
   	
    	
          //genSub.setFieldWithOperatorFrequency("rain", 0.5, "==", 0.5);
     	
    	genSub.gennerateSubscriptions(10);
     	
//		ArrayList<Integer> lis=new ArrayList<Integer>();
//    	UniqRandoms.loadUniqRandoms(lis, 4, 10);
//    	lis.forEach(x->System.out.println(x));

	}

}
