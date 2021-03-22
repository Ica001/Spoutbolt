package MainPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		new Domains().fillDoamains("config.json");
//		GeneratorPublications genPub=new GeneratorPublications();
//     	genPub.generatePublications(100).forEach(pub->System.out.println(pub));
     	
     	GeneratorSubscriptions genSub=new GeneratorSubscriptions();
     	
     	genSub.setFieldFrequency("city", 0.3);
     
     	genSub.setFieldFrequency("stationId", 0.2);
     	
     	genSub.setFieldWithOperatorFrequency("rain", 0.5, ">=", 0.5);
     	
     	genSub.gennerateSubscriptions(100);
     	
     	

	}

}
