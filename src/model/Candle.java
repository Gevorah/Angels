public class Candle{
	private String color;
	private double size;
	private String essence;
	private double illuminance;
	
	public Candle(String color, double size, String essence, double illuminance){
		this.color=color;
		this.size=size;
		this.essence=essence;
		this.illuminance=illuminance;
	}
	
	getColor(){
		return color;
	}
	getSize(){
		return size;
	}
	getEssence(){
		return essence;
	}
	getIlluminance(){
		return illuminance;
	}
}