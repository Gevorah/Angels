package model;
import java.util.*;
public class Legion{
	
	public static final String TOP = "Top Maximun";
	public static final String SERAFIN = "Seraphim";
	public static final String LIBERI = "Liberi";

	private String legion;
	private int index;
	private ArrayList<Angel> listOfAngels;
	
	public Legion(String legion, int index){
		this.legion = legion;
		this.index = index;
		listOfAngels = new ArrayList<Angel>();
	}
	
	/**
	*	This method add a new angel to the legion.<br>
	*	<b>pre:</b> The list of angels must be initialized.<br>
	*	<b>post:</b> The angel has been created.<br>
	*	@param name The angel name.
	*	@param prayer The angel prayer.
	*	@param day The angel celebration day.
	*	@param month The angel celebration month.
	*	@param skill The angel skill.
	*	@param color The candle color.
	*	@param size The candle size.
	*	@param essence The candle essence.
	*	@param illuminance The candle illuminance.
	*	@throws ListException If the list of angels is of another datatype or hasn't been initialized trhows this exception.<br>
	*/
	public void addAngel(String name, String photo, String prayer, int day, String month, 
	String skill, String color, double size, String essence, double illuminance){
		listOfAngels.add(index, new Angel(name,photo,prayer,day,month,skill));
		listOfAngels.get(index).setCandle(color,size,essence,illuminance);
		index++;
		if(index>2) {
			System.out.println("\n"+"The angel has been created. \n\n");
		}
	}
	
	/**
	*	This method search one angel.<br>
	*	<b>pre:</b> The list of angels must be initialized and the parameters must be coincide with the reqeriments.<br>
	*	<b>post:</b> The angel's information has been shown.<br>
	*	@param index The type of search, name or skill.
	*	@param search The name or skill to search.
	*	@throws SearchException If the angel name or angel skill doesn't exist throw this exception.<br>
	*	@return The angel's information is show.<br>
	*/
	public String searchAngel(int index, String search){
		String show = "Doesn't exist.";
		if(index==1){
			for(int i=0;i<listOfAngels.size();i++){
				if(listOfAngels.get(i).getName().equalsIgnoreCase(search)){
					show = String.format("Name: %s%n"+"Prayer: %s%n"+"Day: %d%n"+"Month: %s%n"+
					"Skill: %s%n"+"Candle %n"+"Color: %s%n"+"Size: %s%n"+"Essence: %s%n"+"Illuminance: %s%n",
					listOfAngels.get(i).getName(), listOfAngels.get(i).getPrayer(), listOfAngels.get(i).getDay(),
					listOfAngels.get(i).getMonth(), listOfAngels.get(i).getSkill(), listOfAngels.get(i).getCandle().getColor(),
					listOfAngels.get(i).getCandle().getSize(), listOfAngels.get(i).getCandle().getEssence(), 
					listOfAngels.get(i).getCandle().getIlluminance());
				}
			}
		}else if(index==2){
			for(int i=0;i<listOfAngels.size();i++){
				if(listOfAngels.get(i).getSkill().equalsIgnoreCase(search)){
					show = String.format("Name: %s%n"+"Prayer: %s%n"+"Day: %d%n"+"Month: %s%n"+
					"Skill: %s%n"+"Candle %n"+"Color: %s%n"+"Size: %s%n"+"Essence: %s%n"+"Illuminance: %s%n",
					listOfAngels.get(i).getName(), listOfAngels.get(i).getPrayer(), listOfAngels.get(i).getDay(),
					listOfAngels.get(i).getMonth(), listOfAngels.get(i).getSkill(), listOfAngels.get(i).getCandle().getColor(),
					listOfAngels.get(i).getCandle().getSize(), listOfAngels.get(i).getCandle().getEssence(),
					listOfAngels.get(i).getCandle().getIlluminance());
				}
			}
		}
		return show;
	}
	
	/**
	*	This method check the name.<br>
	*	<b>pre:</b> The list of angels must be initialized and the parameters must be coincide with the reqeriments.<br>
	*	<b>post:</b> The name is correct or incorrect.<br>
	*	@param name The name to check.
	*	@throws NameException If the angel name has an incorrect finish or already exist throw this exception.<br>
	*	@return True if the name is correct or false if the name has an incorrect finish or already exist..<br>
	*/
	public boolean checkName(String name){
		boolean correct = true;
		int i = 0;
		if(name.endsWith("el")==true){
			while(i<listOfAngels.size() && correct==true){
				if(listOfAngels.get(i).getName().equalsIgnoreCase(name)){
					correct = false;
					System.out.println("The Name Already Exist. \n");
				}else{
					i++;
				}
			}
		}else {
			System.out.println("The Name has an Incorrect Finish. \n");
			correct = false;
		}
		return correct;
	}
	
	/**
	*	This method check the skill.<br>
	*	<b>pre:</b> The list of angels must be initialized.<br>
	*	<b>post:</b> The skill exist or not.<br>
	*	@param name The skill to check.
	*	@throws SkillException If the angel skill already exist throw this exception.<br>
	*	@return True if the skill already exist or false if the skill is correct.<br>
	*/
	public boolean checkSkill(String skill){
		boolean exists = false;
		int i = 0;
		while(i<listOfAngels.size() && exists==false){
			if(listOfAngels.get(i).getSkill().equalsIgnoreCase(skill)){
				exists = true;
				System.out.println("The Skill Already Exist. \n");
			}else{
				i++;
			}
		}
		return exists;
	}
	
	/**
	*	This method get the size of the list of angels.<br>
	*	@return The size of the list of angels.<br>
	*/
	public int getSize(){
		return listOfAngels.size();
	}
	
	/**
	*	This method show all the celebrations of one month.<br>
	*	<b>pre:</b> The list of angels must be initialized.<br>
	*	<b>post:</b> Show simplified information of the angels with the same month.<br>
	*	@param month The month to show information.
	*	@throws CelebrationMonthException If in the  month doesn't exist angels throw this exception.<br>
	*	@return Text with simplified information of the angels.<br>
	*/
	public String showCelebrationsMonth(String month){
		String show = "";
		for(int i=0;i<listOfAngels.size();i++){
			if(listOfAngels.get(i).getMonth()==month){
				show += String.format("Name: %s%n"+"Day: %d%n"+"Candle Color: %s%n"+"Candle Essence: %s%n%n", listOfAngels.get(i).getName(), 
				listOfAngels.get(i).getDay(), listOfAngels.get(i).getCandle().getColor(), listOfAngels.get(i).getCandle().getEssence());
			}
		}
		if(show.equalsIgnoreCase("")) {
			show += "There aren't angels in this month \n";
		}
		return show;
	}
	
	/**
	*	This method show all the celebrations in the year.<br>
	*	<b>pre:</b> The list of angels must be initialized.<br>
	*	<b>post:</b> Show simplified information of all angels.<br>
	*	@throws AngelException If doesn't exist any angels throw this exception.<br>
	*	@return Text with simplified information of all angels.<br>
	*/
	public String showAllCelebrations(){
		String show = "";
		for(int i=0;i<listOfAngels.size();i++){
			show += String.format("%s: "+"%d "+"%s%n", listOfAngels.get(i).getName(), listOfAngels.get(i).getDay(), listOfAngels.get(i).getMonth());
		}
		return show;
	}
	
	/**
	*	This method check if the given day corresponds to the given month.<br>
	*	<b>pre:</b> The day must be a integer number.<br>
	*	<b>post:</b> The given day is correct or incorrect for the given month.<br>
	*	@param month The month.
	*	@param day The day to evaluate.
	*	@throws DayException If the day doesn't corresponds to the given month throw this exception.<br>
	*	@return True if the given day corresponds to the given month or false if is incorrect.<br>
	*/
	public static boolean checkDay(String month, int day){
		boolean correct = false;
		if(month.equalsIgnoreCase(Angel.FEBRUARY)){
			if(day>0 && day<30){
				correct = true;
			}
		}else if(month.equalsIgnoreCase(Angel.JANUARY) || month.equalsIgnoreCase(Angel.MARCH) || month.equalsIgnoreCase(Angel.MAY) ||
		month.equalsIgnoreCase(Angel.JULY) || month.equalsIgnoreCase(Angel.AUGUST) || month.equalsIgnoreCase(Angel.OCTOBER) ||
		month.equalsIgnoreCase(Angel.DECEMBER)){
			if(day>0 && day<=31){
				correct = true;
			}
		}else{
			if(day>0 && day<31){
				correct = true;
			}
		}	
		if(correct==false){
			System.out.printf("Wrong Day for %s%n",month);
		}
		return correct;
		
	}
	
	/**
	*	This method check if the given month is correct acording to the calendar.<br>
	*	<b>pre:</b> The month must be correct acording to the calendar.<br>
	*	<b>post:</b> The given month is correct or incorrect.<br>
	*	@param month The month to evaluate.
	*	@throws MonthException If the month doesn't corresponds to the given month throw this exception.<br>
	*	@return True if the given month corresponds to the months in the calendar or false if the month is incorrect.<br>
	*/
	public static boolean checkMonth(String month){
		if(month.equalsIgnoreCase("1") || month.equalsIgnoreCase(Angel.JANUARY) || month.equalsIgnoreCase("2") || month.equalsIgnoreCase(Angel.FEBRUARY) ||
		month.equalsIgnoreCase("3") || month.equalsIgnoreCase(Angel.MARCH) || month.equalsIgnoreCase("4") || month.equalsIgnoreCase(Angel.APRIL) ||
		month.equalsIgnoreCase("5") || month.equalsIgnoreCase(Angel.MAY) || month.equalsIgnoreCase("6") || month.equalsIgnoreCase(Angel.JUNE) ||
		month.equalsIgnoreCase("7") || month.equalsIgnoreCase(Angel.JULY) || month.equalsIgnoreCase("8") || month.equalsIgnoreCase(Angel.AUGUST) ||
		month.equalsIgnoreCase("9") || month.equalsIgnoreCase(Angel.SEPTEMBER) || month.equalsIgnoreCase("10") || month.equalsIgnoreCase(Angel.OCTOBER) ||
		month.equalsIgnoreCase("11") || month.equalsIgnoreCase(Angel.NOVEMBER) || month.equalsIgnoreCase("12") || month.equalsIgnoreCase(Angel.DECEMBER)){
			return true;
		}else{
			System.out.println("Wrong Month. \n");
		}
		return false;
	}
	
	/**
	*	This method change the given text month for other with correct writing.<br>
	*	<b>pre:</b> The month must be correspond to the requeriments into the method.<br>
	*	<b>post:</b> The given month has been changed to a correct text month.<br>
	*	@param month The month to change in text.
	*	@throws MonthException If the month doesn't corresponds to the calendar this exception.<br>
	*	@return A text of month.<br>
	*/
	public static String correctlyMonth(String month){
		String correctlyMonth = "";
		if(month.equalsIgnoreCase("1") || month.equalsIgnoreCase(Angel.JANUARY)){
			correctlyMonth = Angel.JANUARY;
		}else if(month.equalsIgnoreCase("2") || month.equalsIgnoreCase(Angel.FEBRUARY)){
			correctlyMonth = Angel.FEBRUARY;
		}else if(month.equalsIgnoreCase("3") || month.equalsIgnoreCase(Angel.MARCH)){
			correctlyMonth = Angel.MARCH;
		}else if(month.equalsIgnoreCase("4") || month.equalsIgnoreCase(Angel.APRIL)){
			correctlyMonth = Angel.APRIL;
		}else if(month.equalsIgnoreCase("5") || month.equalsIgnoreCase(Angel.MAY)){
			correctlyMonth = Angel.MAY;
		}else if(month.equalsIgnoreCase("6") || month.equalsIgnoreCase(Angel.JUNE)){
			correctlyMonth = Angel.JUNE;
		}else if(month.equalsIgnoreCase("7") || month.equalsIgnoreCase(Angel.JULY)){
			correctlyMonth = Angel.JULY;
		}else if(month.equalsIgnoreCase("8") || month.equalsIgnoreCase(Angel.AUGUST)){
			correctlyMonth = Angel.AUGUST;
		}else if(month.equalsIgnoreCase("9") || month.equalsIgnoreCase(Angel.SEPTEMBER)){
			correctlyMonth = Angel.SEPTEMBER;
		}else if(month.equalsIgnoreCase("10") || month.equalsIgnoreCase(Angel.OCTOBER)){
			correctlyMonth = Angel.OCTOBER;
		}else if(month.equalsIgnoreCase("11") || month.equalsIgnoreCase(Angel.NOVEMBER)){
			correctlyMonth = Angel.NOVEMBER;
		}else if(month.equalsIgnoreCase("12") || month.equalsIgnoreCase(Angel.DECEMBER)){
			correctlyMonth = Angel.DECEMBER;
		}
		return correctlyMonth;
	}
}