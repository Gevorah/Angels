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
	
	public void setColor(String color){
		this.color = color;
	}
	public void setSize(double size){
		this.size = size;
	}
	public void setEssence(String essence){
		this.essence = essence;
	}
	public void setIlluminance(double illuminance){
		this.illuminance = illuminance;
	}
}