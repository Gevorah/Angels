package ui;
import model.Legion;
import java.util.Scanner;

public class Main{
	
	private Scanner readerLine;
	private Scanner readerNum;
	private Scanner reader;
	private Legion legion;
	
	public Main(){
	    readerLine = new Scanner(System.in);
	    readerNum = new Scanner(System.in);
	    reader = new Scanner(System.in);
	}
	
	public void init(){
		legion = new Legion(Legion.TOP,0);
	    legion.addAngel("Saitamael","Ooneee Puuunch",8,"October","One Punch","Red",99,"Mint",999);
        legion.addAngel("Anuel","Bebecitaaa",10,"July","Real until the dead","@@@",1,"@@@",3);	    
	}
	
	public static void main(String[] args){
		Main main = new Main();
		main.init();
		boolean exit = false;
		int supp;
		do{
			main.menu();
			int menu = main.readerNum.nextInt();
			if(menu==1){
				boolean endCreate = false;
				do{
					System.out.println("\n"+"Input the Attributes of the Archangel");
					boolean checkName = false;
					boolean checkMonth = false;
					boolean checkDay = false;
					boolean checkSkill = true;
					String name = "";
					String month = "";
					String skill = "";
					int day;
					do{
						System.out.println("Name:");
						name = main.readerLine.nextLine();
						if(main.legion.checkName(name)==true) {
							checkName = true;
						}
					}while(checkName==false);
					System.out.println("\n"+"Prayer:");
					String prayer = main.readerLine.nextLine();
					do{
						System.out.println("\n"+"Celebration Month:");
						month = main.reader.next();
						checkMonth = Legion.checkMonth(month);
					}while(checkMonth==false);
					do{
						System.out.println("\n"+"Celebration Day:");
						day = main.readerNum.nextInt();
						checkDay = Legion.checkDay(Legion.correctlyMonth(month),day);
					}while(checkDay==false);
					do{
						System.out.println("\n"+"Skill: ");
						skill = main.readerLine.nextLine();
						checkSkill = main.legion.checkSkill(skill);
					}while(checkSkill==true);
					System.out.println("\n"+"Input the Attributes of the Candle \n"+"Color:");
					String color = main.readerLine.nextLine();
					System.out.println("Size:");
					double size = main.readerNum.nextDouble();
					System.out.println("\n"+"Essence:");
					String essence = main.readerLine.nextLine();
					System.out.println("\n"+"Illuminance:");
					double illuminance = main.readerNum.nextDouble();
					main.legion.addAngel(name, prayer, day, Legion.correctlyMonth(month), skill, color, size, essence, illuminance);
					System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
					supp = main.readerNum.nextInt();
					if(supp==2) {
						endCreate = true;
					}else if(supp!=1){
						System.out.println("\n"+"Invalid function. Please write the correct number of the function. \n");
					}
				}while(endCreate==false);
			}else if(menu==2){
				boolean endSearch = false;
				do {
					String searchName = "";
					String searchSkill = "";
					System.out.println("\n"+"Search: \n"+"<1>.Name \n"+"<2>.Skill \n");
					int search = main.readerNum.nextInt();
					if(search==1){	
						System.out.println("\n"+"Name:");
						searchName = main.readerLine.nextLine();
						if(main.legion.searchAngel(1,searchName).equalsIgnoreCase("Don't exist.")){
							System.out.println("\n"+"Don't exist."+"\n");
						}else{
							System.out.println("\n"+main.legion.searchAngel(1,searchName));
						}
					}else if(search==2){
						System.out.println("\n"+"Skill:");
						searchSkill = main.readerLine.nextLine();
						if(main.legion.searchAngel(2,searchSkill).equalsIgnoreCase("Don't exist.")){
							System.out.println("\n"+"Don't exist."+"\n");							
						}else{
							System.out.println("\n"+main.legion.searchAngel(2,searchSkill));
						}
					}else{
						System.out.println("\n"+"Invalid function. Please write the correct number of the function. \n");
					}
					if(search==1 || search==2){
						System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
						supp = main.readerNum.nextInt();
						if(supp==2) {
							endSearch = true;
						}else if(supp!=1){
							System.out.println("\n"+"Invalid function. Please write the correct number of the function. \n");
						}
					}	
				}while(endSearch==false);
			}else if(menu==3){
				boolean endSearchMonth = false;
				do{
					String oneMonth = "";
					boolean checkOneMonth;
					do{
						System.out.println("\n"+"Month:");
						oneMonth = main.reader.next();
						checkOneMonth = Legion.checkMonth(oneMonth);
					}while(checkOneMonth==false);
					System.out.println("\n"+main.legion.showCelebrationsInOneMonth(Legion.correctlyMonth(oneMonth)));
					System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
					supp = main.readerNum.nextInt();
					if(supp==2) {
						endSearchMonth = true;
					}else if(supp!=1){
						System.out.println("\n"+"Invalid function. Please write the correct number of the function. \n");
					}
				}while(endSearchMonth==false);
			}else if(menu==4){
				System.out.println("\n"+main.legion.showAllCelebrations()+"\n");
			}else if(menu==5) {
				main.instructions();
			}else if(menu==0){
				System.out.println("\n"+"Bye, Thank's");
				exit = true;
			}else{
				System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
			}
		}while(exit==false);
	}
	
	public void menu(){
		System.out.println("\n"+"Legion Top Maximum: \n"+
		"<1>.Create an Angel \n"+
		"<2>.Search an Angel \n"+
		"<3>.Show All Celebrations in one Month \n"+
		"<4>.Show All Celebrations in the Year \n"+
		"<5>.Instructions \n"+
		"<0>.Exit \n");
	}
	
	public void instructions(){
		System.out.println("\n"+"Angels Instruction: \n"+">The month can be input in number or name. \n"+
		">Just exists max 31 days for each month. \n"+">The name must be finish in <el> \n");
	}

}