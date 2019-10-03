package ui;
import java.util.Scanner;

public class Main{
	private static Scanner reader = new Scanner(System.in);
	private Legion legion = new Legion();
	
	public static void main(String[] args){
		do{
			boolean exit = false;
			menu();
			int menu = reader.nextInt();
			if(menu==1){
				System.out.println("Input the Attributes of the Archangel");
				do{
					System.out.println("Name:");
					boolean checkName = true;
					String name = reader.nextLine();
					checkName = legion.checkName(name);
				}while(checkName==true);
				System.out.println("Prayer:");
				String prayer = reader.nextLine();
				System.out.println("Celebration Day:");
				int day = reader.nextInt();
				do{
					System.out.println("Celebration Month:");
					boolean checkMonth = false;
					String month = reader.next();
					checkMonth = Legion.checkMonth(month);
				}while(checkMonth==false);
				do{
					System.out.println("Skill: ");
					boolean checkSkill = true;
					String skill = reader.nextLine();
					checkSkill = legion.checkSkill(skill);
				}while(checkSkill==true);
				System.out.println("\n"+"Input the Attributes of the Candle \n"+"Color:");
				String color = reader.nextLine();
				System.out.println("Size:");
				double size = reader.nextDouble();
				System.out.println("Essence:");
				String essence = reader.nextLine();
				System.out.println("Illuminance:");
				double illuminance = reader.nextDouble();
				legion.manager(name, prayer, day, Legion.correctlyMonth(month), skill, color, size, essence, illuminance);
			}else if(menu==2){
				System.out.println("Search: \n"+"1.Name \n"+"2.Skill");
				do{
					int search = reader.nextInt();
					boolean checkExist = false;
					if(search==1){
						String searchName = reader.nextLine();
						if(legion.searchAngel(1,searchName).equalsIgnoreCase("Don't exist.")){
							System.out.println(legion.searchAngel(1,searchName));
							checkExist = true;
						}
					}else if(search==2){
						String searchSkill = reader.nextLine();
						if(legion.searchAngel(1,searchName).equalsIgnoreCase("Don't exist.")){
							System.out.println(legion.searchAngel(2,searchSkill));
							checkExist = true;
						}
					}
				}while(checkExist = false);
			}else if(menu==3){
				System.out.println(legion.showAllAngels());
			}else if(menu==4){
				do{
					System.out.println("Month:");
					String oneMonth = reader.next;
					boolean checkOneMonth = false;
					checkOneMonth = legion.checkMonth(oneMonth);
				}while(checkOneMonth=false);
				System.out.println(showCelebrationsInOneMonth(oneMonth));
			}else if(menu==5){
				System.out.println(showAllCelebrations());
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
		"3.Show All Angels \n"+
		"4.Show All Celebrations in one Month \n"+
		"5.Show All Celebrations in the Year \n"+
		"6.Instructions \n"+
		"0.Exit");
	}
	
	public static void instructions(){
		System.out.println("Angels Instruction: \n"+">The month can be input in number or name. \n"+
		">Just exists X days for each month.");
	}
}