package model;

public class Legion{
	
	public static final String TOP = "Top Maximun";
	public static final String SERAFIN = "Seraphim";
	public static final String LIBERI = "Liberi"
	
	private String legion;
	private int numbers;
	private Archangel[] archangels;
	private Candle candleA;
	private Candle candleB;
	private Archangel archangelA;
	private Archangel archangelB;
	private Candle candle;
	private Archangel archangel;
	
	public Legion(){
		legion = TOP;
		numbers = 2;
		archangels = new Archangel[numbers];
		candleA = new Archangel("Red",99,"Mint",999);
		candleB = new Archangel("Green",1,"@@@@@",-1);
		archangelA = new Archangel("Saitamael","Ooneee Puuunch",8,"October","One Punch",candleA);
		archangelB = new Archangel("Anuel","Real until the dead",10,"July","The Most Useless",candleB);
		archangels[0] = archangelA;
		archangels[1] = archangelB;
	}
	
	public void manager(String name, String prayer, int day, String month, String skill, String color, double size, String essence, double illuminance){
		numbers++;
		candle = new Candle(color, size, essence, illuminance);
		archangel = new Archangel(name, prayer, day, month, skill , candle);
		archangels[numbers-1] = archangel;
	}
	
	public boolean checkName(String name){
		boolean exists = false;
		int i = 0;
		while(i<archangels.lenght || exists==false){
			if(archangels[i].getName().equalsIgnoreCase(name)){
				exists = true;
			}else{
				exists = false;
			}
		}
		return exists;
	}
	
	public boolean checkSkill(String skill){
		boolean exists = false;
		int i = 0;
		while(i<archangels.lenght || exists==false){
			if(archangels[i].getName().equalsIgnoreCase(skill)){
				exists = true;
			}else{
				exists = false;
			}
		}
		return exists;
	}
}