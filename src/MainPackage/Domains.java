package MainPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Domains {
	public static JSONArray cityArray;
	public static JSONArray directionArray;
	public static JSONArray rainArray;
	public static JSONArray windArray;
	public static JSONArray dateArray;
	public static JSONArray stationIdArray;
	public static JSONArray tempArray;
	
	JSONParser parser = new JSONParser();
	public  void fillDoamains(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = parser.parse(new FileReader(filename));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject domains= (JSONObject) jsonObject.get("domains");
			 cityArray = (JSONArray) domains.get("city");
			 directionArray=(JSONArray) domains.get("direction");
			 rainArray=(JSONArray) domains.get("rain");
			 windArray=(JSONArray) domains.get("wind");
			 dateArray=(JSONArray) domains.get("date");
			 stationIdArray=(JSONArray) domains.get("stationId");		
			 tempArray=(JSONArray) domains.get("temp");
	}
}
