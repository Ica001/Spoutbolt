package MainPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONArray;

public class GeneratorPublications {
	RandomValueGenrator rv=new RandomValueGenrator();
	  public Publication generatePublicatio() {
		  Publication p= new Publication();
		  p.setCity(rv.genCity());
		  p.setDate(
				 rv.genDate(
				  (int)(long)Domains.dateArray.get(0),
				  (int)(long)Domains.dateArray.get(1),
				  (int)(long)Domains.dateArray.get(2),
				  (int)(long)Domains.dateArray.get(3)
				  ));
				 
		  p.setDirection(rv.genDirection());
		  p.setRain(rv.genRain((int)(long)Domains.rainArray.get(0), (int)(long)Domains.rainArray.get(1)));//setRain(randombetween inferior limit to superior limit)
		  p.setStationId(rv.genStationId((int)(long)Domains.stationIdArray.get(0),(int)(long) Domains.stationIdArray.get(1))); // same
		  p.setTemp(rv.genTemp((int)(long)Domains.tempArray.get(0), (int)(long)Domains.tempArray.get(1)));
		  p.setWind(rv.genWind((int)(long)Domains.windArray.get(0), (int)(long)Domains.windArray.get(1)));
		  return p;
		  
	  }
	
	public ArrayList<Publication> generatePublications(int bound) {

        ArrayList<Publication> publications=new ArrayList<Publication>();
        for(int i=0;i<bound;i++) {
           Publication pub=	generatePublicatio();
           publications.add(pub);
        }
        return publications;
		
	}

}
