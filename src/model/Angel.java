package model;

/**
*	This class allows create angels.
*	@author Jhon Ijaji.
*	@version 1.0
*	@since 1.0
*/
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
	
	/**
	*	Angel constructor<br>
	*	@param name The angel name.
	*	@param photo The angel photo.
	*	@param prayer The angel prayer.
	*	@param day The angel celebration day.
	*	@param month The angel celebration month.
	*	@param skill The angel skill.
	*	@throws IllegalArgumentException In the case of an invalid angel.<br>
	*/
	public Angel(String name, String photo,	String prayer, int day, String month, String skill){
		this.name = name;
		this.photo = photo;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.skill = skill;
	}
	
	/**
	*	This method add one candle to the angel.<br>
	*	<b>pre:</b> The candle must be initialized.<br>
	*	<b>post:</b> The candle attributes have been changed.<br>
	*	@param color This is tha new candle color.
	*	@param size This is the new candle size.
	*	@param essence This is the new candle essence.
	*	@param illuminance This is the new candle illuminance.
	*	@throws Exception If the candle doesn't exist.<br>
	*/
	public void addCandle(String color, double size, String essence, double illuminance){
		candle = new Candle(color,size,essence,illuminance);
	}
	
	/**
	*	This method gets the angel name.<br>
	*	@return The angel name<br>
	*/
	public String getName(){
		return name;
	}
	
	/**
	*	This method gets the angel photo.<br>
	*	@return The angel photo.<br>
	*/
	public String getPhoto(){
		return photo;
	}
	
	/**
	*	This method gets the angel prayer.<br>
	*	@return The angel prayer.<br>
	*/
	public String getPrayer(){
		return prayer;
	}
	
	/**
	*	This method gets the angel celebration day.<br>
	*	@return The angel celebration day.<br>
	*/
	public int getDay(){
		return day;
	}
	
	/**
	*	This method gets the angel celebration month.<br>
	*	@return The angel celebration month.<br>
	*/
	public String getMonth(){
		return month;
	}
	
	/**
	*	This method gets the angel skill.<br>
	*	@return The angel skill.<br>
	*/
	public String getSkill(){
		return skill;
	}
	
	/**
	*	This method gets the angel candle.<br>
	*	@return The angel candle.<br>
	*/
	public Candle getCandle(){
		return candle;
	}
}