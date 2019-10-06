package model;

public class Angel{
	
	public static final String PROTECTION = "Protection";
	public static final String HEALTH = "Health";
	public static final String ABUNDANCE = "Abundance";
	public static final String JUSTICE = "Justice";
	public static final String LOYALTY = "Loyalty";
	public static final String JANUARY = "January";
	public static final String FEBRUARY = "February";
	public static final String MARCH = "March";
	public static final String APRIL = "April";
	public static final String MAY = "May";
	public static final String JUNE = "June";
	public static final String JULY = "July";
	public static final String AUGUST = "August";
	public static final String SEPTEMBER = "September";
	public static final String OCTOBER = "October";
	public static final String NOVEMBER = "November";
	public static final String DECEMBER = "December";
	
	private String name;
	private String photo;
	private String prayer;
	private int day;
	private String month;
	private String skill;
	private Candle candle;
	
	public Angel(String name, String photo,	String prayer, int day, String month, String skill){
		this.name = name;
		this.photo = photo;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.skill = skill;
	}
	
	/**
	*	This method change the attributes of one candle.<br>
	*	<b>pre:</b> The candle must be initialized.<br>
	*	<b>post:</b> The candle attributes have been changed.<br>
	*	@param color This is tha new candle color.
	*	@param size This is the new candle size.
	*	@param essence This is the new candle essence.
	*	@param illuminance This is the new candle illuminance.
	*	@throws Exception If the candle does'nt exist throws this exception.<br>
	*/
	public void setCandle(String color, double size, String essence, double illuminance){
		candle = new Candle(color,size,essence,illuminance);
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
	public Candle getCandle(){
		return candle;
	}
}