package MainPackage;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorRandomAtomicSubscription {
	public static final String[] OPERATORS= {"<",">","!=","==",">=","<="};
	public static final String[] FIELDS= {"city","stationId","rain","wind","temp","direction","date"};
	static RandomValueGenrator rv=new RandomValueGenrator();
 public static AtomicSubscription generate(ArrayList<AtomicSubscription> subscriptions,ArrayList<Requirement> requirements) {
	 Random rand=new Random();
	  ArrayList<String> fields=new ArrayList<String>();
	  for(int i=0;i<FIELDS.length;i++) {
		  fields.add(FIELDS[i]);
	  }
	 for(int i=0;i<subscriptions.size();i++) {
		 String field=subscriptions.get(i).field;
	if (fields.contains(field)){fields.remove(field);} 
	}
	 for(int i=0;i<requirements.size();i++) {
		 String field=requirements.get(i).field;
		 if(fields.contains(field)) {fields.remove(field);}
	 }
	 int disponiblefields=fields.size();
	 if(disponiblefields==0) return null;
	 String field=fields.get(rand.nextInt(disponiblefields));
	 String operator=OPERATORS[rand.nextInt(OPERATORS.length)];
	  Object value= generateRandomValue(field);
	  return new AtomicSubscription(field, operator, value);
	  }
	public static Object generateRandomValue(String field) {
	     switch (field) {
		case "city": {
		 return rv.genCity();	
		}
		case "stationId":{
			return rv.genStationId((int)(long)Domains.stationIdArray.get(0),(int)(long)Domains.stationIdArray.get(1));
		}
		case "rain":{
			return rv.genRain((int)(long)Domains.rainArray.get(0),(int)(long)Domains.rainArray.get(1));
		}
		case "wind":{
			return rv.genWind((int)(long)Domains.windArray.get(0),(int)(long)Domains.windArray.get(1));
		}
		case "temp":{
			return rv.genTemp((int)(long)Domains.tempArray.get(0),(int)(long)Domains.tempArray.get(1));
		}
		case "direction":{
			return rv.genDirection();
		}
		case "date":{
			return 	 rv.genDate(
					  (int)(long)Domains.dateArray.get(0),
					  (int)(long)Domains.dateArray.get(1),
					  (int)(long)Domains.dateArray.get(2),
					  (int)(long)Domains.dateArray.get(3)
					  );
		}
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + field);
		}
	}
	
}
