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
//    	genPub.generatePublications(100).forEach(pub->{
//			try {
//				fr.write(pub.toString()+"\n");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});
    	
     	
     	GeneratorSubscriptions genSub=new GeneratorSubscriptions();
     	
     	genSub.setFieldFrequency("city", 0.1);
     	genSub.setFieldFrequency("rain", 0.1);
     	genSub.setFieldWithOperatorFrequency("stationId", 0.6,"!=" ,0.5);
     	genSub.setFieldWithOperatorFrequency("wind", 0.1, "==", 1.0);
     
     	//genSub.setFieldFrequency("temp", 0.1);
     	
     	
     //	genSub.setFieldWithOperatorFrequency("rain", 0.5, "==", 0.5);
     	
     	genSub.gennerateSubscriptions(10);
//     	
     	

	}

}
