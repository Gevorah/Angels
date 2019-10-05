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
	
	public void addAngel(String name, String prayer, int day, String month, String skill, String color, double size, String essence, double illuminance){
		listOfAngels.add(index, new Angel(name,prayer,day,month,skill));
		listOfAngels.get(index).setCandle(color,size,essence,illuminance);
		index++;
		if(index>2) {
			System.out.println("\n"+"The angel has been created. \n\n");
		}
	}
	
	public String searchAngel(int index, String search){
		String show = "Don't exist.";
		if(index==1){
			for(int i=0;i<listOfAngels.size();i++){
				if(listOfAngels.get(i).getName().equalsIgnoreCase(search)){
					show = String.format("Name: %s%n"+"Prayer: %s%n"+"Day: %d%n"+"Month: %s%n"+
					"Skill: %s%n"+"Candle %n"+"Color: %s%n"+"Size: %s%n"+"Essence: %s%n"+"Illuminance: %s%n",
					listOfAngels.get(i).getName(), listOfAngels.get(i).getPrayer(), listOfAngels.get(i).getDay(),
					listOfAngels.get(i).getMonth(), listOfAngels.get(i).getSkill(), listOfAngels.get(i).getCandle().getColor(),
					listOfAngels.get(i).getCandle().getSize(), listOfAngels.get(i).getCandle().getEssence(), listOfAngels.get(i).getCandle().getIlluminance());
				}
			}
		}else if(index==2){
			for(int i=0;i<listOfAngels.size();i++){
				if(listOfAngels.get(i).getSkill().equalsIgnoreCase(search)){
					show = String.format("Name: %s%n"+"Prayer: %s%n"+"Day: %d%n"+"Month: %s%n"+
					"Skill: %s%n"+"Candle %n"+"Color: %s%n"+"Size: %s%n"+"Essence: %s%n"+"Illuminance: %s%n",
					listOfAngels.get(i).getName(), listOfAngels.get(i).getPrayer(), listOfAngels.get(i).getDay(),
					listOfAngels.get(i).getMonth(), listOfAngels.get(i).getSkill(), listOfAngels.get(i).getCandle().getColor(),
					listOfAngels.get(i).getCandle().getSize(), listOfAngels.get(i).getCandle().getEssence(), listOfAngels.get(i).getCandle().getIlluminance());
				}
			}
		}
		return show;
	}
	
	public boolean checkName(String name){
		boolean correct = true;
		int i = 0;
		if(name.endsWith("el")==true){
			while(i<listOfAngels.size() && correct==true){
				if(listOfAngels.get(i).getName().equalsIgnoreCase(name)){
					correct = false;
					System.out.println("The Name Already Exist.");
				}else{
					i++;
				}
			}
		}else {
			System.out.println("The Name has an Incorrect Finish.");
			correct = false;
		}
		return correct;
	}
	
	public boolean checkSkill(String skill){
		boolean exists = false;
		int i = 0;
		while(i<listOfAngels.size() && exists==false){
			if(listOfAngels.get(i).getSkill().equalsIgnoreCase(skill)){
				exists = true;
				System.out.println("The Skill Already Exist.");
			}else{
				i++;
			}
		}
		return exists;
	}
	
	public int getSize(){
		return listOfAngels.size();
	}
	
	public String showCelebrationsInOneMonth(String month){
		String show = "";
		for(int i=0;i<listOfAngels.size();i++){
			if(listOfAngels.get(i).getMonth()==month){
				show += String.format("Name: %s%n"+"Day: %d%n"+"Candle Color: %s%n"+"Candle Essence: %s%n%n", listOfAngels.get(i).getName(), 
				listOfAngels.get(i).getDay(), listOfAngels.get(i).getCandle().getColor(), listOfAngels.get(i).getCandle().getEssence());
			}
		}
		if(show.equalsIgnoreCase("")) {
			show += "There are'nt angels in this month \n";
		}
		return show;
	}
	
	public String showAllCelebrations(){
		String show = "";
		for(int i=0;i<listOfAngels.size();i++){
			show += String.format("%s: "+"%d "+"%s%n", listOfAngels.get(i).getName(), listOfAngels.get(i).getDay(), listOfAngels.get(i).getMonth());
		}
		return show;
	}
	
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
	
	public static boolean checkMonth(String month){
		if(month.equalsIgnoreCase("1") || month.equalsIgnoreCase(Angel.JANUARY) || month.equalsIgnoreCase("2") || month.equalsIgnoreCase(Angel.FEBRUARY) ||
		month.equalsIgnoreCase("3") || month.equalsIgnoreCase(Angel.MARCH) || month.equalsIgnoreCase("4") || month.equalsIgnoreCase(Angel.APRIL) ||
		month.equalsIgnoreCase("5") || month.equalsIgnoreCase(Angel.MAY) || month.equalsIgnoreCase("6") || month.equalsIgnoreCase(Angel.JUNE) ||
		month.equalsIgnoreCase("7") || month.equalsIgnoreCase(Angel.JULY) || month.equalsIgnoreCase("8") || month.equalsIgnoreCase(Angel.AUGUST) ||
		month.equalsIgnoreCase("9") || month.equalsIgnoreCase(Angel.SEPTEMBER) || month.equalsIgnoreCase("10") || month.equalsIgnoreCase(Angel.OCTOBER) ||
		month.equalsIgnoreCase("11") || month.equalsIgnoreCase(Angel.NOVEMBER) || month.equalsIgnoreCase("12") || month.equalsIgnoreCase(Angel.DECEMBER)){
			return true;
		}else{
			System.out.println("Wrong Month.");
		}
		return false;
	}
	
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