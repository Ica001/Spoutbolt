package MainPackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Publication {
	private int stationId;
	private String city;
	private int temp;
	private float rain;
	private int wind;
	private String direction;
	private Date date;
	

	
	public Publication() {
		// TODO Auto-generated constructor stub
	}



	public int getStationId() {
		return stationId;
	}



	public String getCity() {
		return city;
	}



	public int getTemp() {
		return temp;
	}



	public float getRain() {
		return rain;
	}



	public int getWind() {
		return wind;
	}



	public String getDirection() {
		return direction;
	}



	public Date getDate() {
		return date;
	}



	public void setStationId(int stationId) {
		this.stationId = stationId;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public void setTemp(int temp) {
		this.temp = temp;
	}



	public void setRain(float rain) {
		this.rain = rain;
	}



	public void setWind(int wind) {
		this.wind = wind;
	}



	public void setDirection(String direction) {
		this.direction = direction;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Publication [stationId=" + stationId + ", city=" + city + ", temp=" + temp + ", rain=" + rain
				+ ", wind=" + wind + ", direction=" + direction + ", date=" + date.getDay() +"-"+date.getMonth()+"-"+date.getYear()+ "]";
	}
	
  
	

	
}
