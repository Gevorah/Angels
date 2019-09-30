package model;

public class Archangel{
	
	public static final String PROTECTION = "Protection";
	public static final String HEALTH = "Health";
	public static final String ABUNDANCE = "Abundance";
	public static final String JUSTICE = "Justice";
	public static final String LOYALTY = "Loyalty";
	
	private String name;
	private String prayer;
	private int day;
	private String month;
	private String skill;
	private Candle candle;
	
	public Archangel(String name, String prayer, int day, String month, String skill, Candle candle){
		this.nombre = name;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.skill = skill;
		this.candle = candle;
	}
	
	public String getName(){
		return name;
	}
	public String getPrayer(){
		return prayer;
	}
	public int getDay(){
		return day;
	}
	public String getMonth(){
		return month;
	}
	public String getSkill(){
		return skill;
	}
}