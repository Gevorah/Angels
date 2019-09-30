package model;

public class Candle{
	
	private String color;
	private double size;
	private String essence;
	private double illuminance;
	
	public Candle(String color, double size, String essence, double illuminance){
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.illuminance = illuminance;
	}
	
	public String getColor(){
		return color;
	}
	public double getSize(){
		return size;
	}
	public String getEssence(){
		return essence;
	}
	public double getIlluminance(){
		return illuminance;
	}
}