package ui;
import model.Legion;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner readerString = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner readerInt = new Scanner(System.in);
		Legion legion = new Legion();
		boolean exit = false;
		do{
			menu();
			int menu = readerInt.nextInt();
			if(menu==1){
				System.out.println("Input the Attributes of the Archangel");
				boolean checkName = false;
				boolean checkMonth = false;
				boolean checkSkill = false;
				String name;
				String month;
				String skill;
				do{
					System.out.println("Name:");
					name = readerString.nextLine();
					if(legion.checkName(name)==true) {
						checkName = true;
					}
				}while(checkName==false);
				System.out.println("Prayer:");
				String prayer = readerString.nextLine();
				System.out.println("Celebration Day:");
				int day = readerInt.nextInt();
				do{
					System.out.println("Celebration Month:");
					month = reader.next();
					checkMonth = Legion.checkMonth(month);
				}while(checkMonth==false);
				do{
					System.out.println("Skill: ");
					skill = readerString.nextLine();
					checkSkill = legion.checkSkill(skill);
				}while(checkSkill==false);
				System.out.println("\n"+"Input the Attributes of the Candle \n"+"Color:");
				String color = readerString.nextLine();
				System.out.println("Size:");
				double size = reader.nextDouble();
				System.out.println("Essence:");
				String essence = readerString.nextLine();
				System.out.println("Illuminance:");
				double illuminance = reader.nextDouble();
				legion.addAngel(name, prayer, day, Legion.correctlyMonth(month), skill, color, size, essence, illuminance);
			}else if(menu==2){
				System.out.println("Search: \n"+"1.Name \n"+"2.Skill");
				boolean checkExist = false;
				String searchName;
				String searchSkill;
				do{
					int search = readerInt.nextInt();
					if(search==1){					
						searchName = readerString.nextLine();
						if(legion.searchAngel(1,searchName).equalsIgnoreCase("Don't exist.")){
							System.out.println("Don't exist.");
						}else {
							System.out.println(legion.searchAngel(1,searchName));
							checkExist = true;
						}
					}else if(search==2){
						searchSkill = readerString.nextLine();
						if(legion.searchAngel(1,searchSkill).equalsIgnoreCase("Don't exist.")){
							System.out.println("Don't exist.");							
						}else {
							System.out.println(legion.searchAngel(2,searchSkill));
							checkExist = true;
						}
					}
				}while(checkExist = false);
			}else if(menu==3){
				String oneMonth = "";
				boolean checkOneMonth;
				do{
					System.out.println("Month:");
					oneMonth = reader.next();
					checkOneMonth = Legion.checkMonth(oneMonth);
				}while(checkOneMonth=false);
				System.out.println(legion.showCelebrationsInOneMonth(Legion.correctlyMonth(oneMonth)));
			}else if(menu==4){
				System.out.println(legion.showAllCelebrations());
			}else if(menu==5) {
				instructions();
			}else if(menu==0){
				System.out.println("Bye, Thank's");
			}else{
				System.out.println("Invalid function. Please write the correct number of the function.");
			}
		}while(exit==false);
	}
	
	public static void menu(){
		System.out.println("Legion Top Maximum: \n"+
		"1.Create an Angel \n"+
		"2.Search an Angel \n"+
		"3.Show All Celebrations in one Month \n"+
		"4.Show All Celebrations in the Year \n"+
		"5.Instructions \n"+
		"0.Exit");
	}
	
	public static void instructions(){
		System.out.println("Angels Instruction: \n"+">The month can be input in number or name. \n"+
		">Just exists X days for each month. \n"+">The name must be finish in <el>");
	}
}