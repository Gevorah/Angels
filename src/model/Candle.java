package model;

/**
*	This class allows create candles.
*	@author Jhon Ijaji.
*	@version 1.0
*	@since 1.0
*/
public class Candle{
	
	private String color;
	private double size;
	private String essence;
	private double illuminance;
	
	/**
	*	Candle constructor<br>
	*	@param color This is the candle color.
	*	@param size This is the candle size.
	*	@param essence This is the candle essence.
	*	@param illuminance This is the candle illuminance grade.
	*	@throws IllegalArgumentException In the case of an invalid candle.<br>
	*/
	public Candle(String color, double size, String essence, double illuminance){
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.illuminance = illuminance;
	}
	
	/**
	*	This method gets the color of the candle.<br>
	*	@return The color of the candle.<br>
	*/
	public String getColor(){
		return color;
	}
	
	/**
	*	This method gets the size of the candle.<br>
	*	@return The size of the candle.<br>
	*/
	public double getSize(){
		return size;
	}
	
	/**
	*	This method gets the essence of the candle.<br>
	*	@return The essence of the candle.<br>
	*/
	public String getEssence(){
		return essence;
	}
	
	/**
	*	This method gets the iluminance grade of the candle.<br>
	*	@return The illuminance grade of the candle.<br>
	*/
	public double getIlluminance(){
		return illuminance;
	}
}