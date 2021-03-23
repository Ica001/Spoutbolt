package MainPackage;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONArray;

public class RandomValueGenrator {
	public RandomValueGenrator() {
		initMountDay();
	}
	 public  Random random=new Random();
	  private   HashMap<Integer,Integer> mount_day=new HashMap<>();
		private  void initMountDay() {
			mount_day.put(1, 31);
			mount_day.put(2, 28);
			mount_day.put(3, 31);
			mount_day.put(4, 30);
			mount_day.put(5, 31);
			mount_day.put(6, 30);
			mount_day.put(7, 31);
			mount_day.put(8, 31);
			mount_day.put(9, 30);
			mount_day.put(10, 31);
			mount_day.put(11, 30);
			mount_day.put(12, 31);
		}
	private boolean isBisect(int year) {
		if(year%4==0) {
			if(year%100==0 && !(year%400==0)) return false;
			return true;
		}
		return false;
	}
  /////////////////////////////////////////////////////
	public int genStationId(int min,int max) {
		min=1;
		max=240;
		return random.nextInt(max)+min;
	}
	public String genCity() {
		JSONArray cityArray=Domains.cityArray;
		int cityNumber =random.nextInt(cityArray.size());
		String city=(String) cityArray.get(cityNumber);
		return city;
	}



	public int genTemp(int min,int max) {
		return random.nextInt(max-min+1)+min;
		
	}



	public float genRain(int min,int max) {
		
		int rainPercent=random.nextInt(max-min+1)+min;
		return (float)rainPercent/100;
	}



	public int genWind(int min,int max) {
	return random.nextInt(max-min+1)+min;
	}



	public String genDirection() {
		JSONArray directionArray=Domains.directionArray;
		int directionNumber =random.nextInt(directionArray.size());
		String direction=(String)directionArray.get(directionNumber);
		return direction;
	}



	public LocalDate genDate(int minYear,int maxYear,int minMounth,int maxMounth) {
		int year=random.nextInt(maxYear-minYear+1)+minYear;
		int mounth=random.nextInt(maxMounth-minMounth+1)+minMounth;
		
		int maxDay=0;
		if(isBisect(year)&&mounth==2) {		
				maxDay=29;
		}else {
		maxDay=mount_day.get(mounth);
		}
		int day=random.nextInt(maxDay)+1;
		return LocalDate.of(year, mounth, day);
		
		
	}
}
