public class Archangel{
	private String name;
	private String prayer;
	private String power;
	
	public Archangel(String name, String prayer, String power){
		this.nombre=name;
		this.prayer=prayer;
		this.power=power;
	}
	
	getName(){
		return name;
	}
	getPrayer(){
		return prayer;
	}
	getPower(){
		return power;
	}
}