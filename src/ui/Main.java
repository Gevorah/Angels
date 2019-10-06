package ui;
import model.Legion;
import java.util.Scanner;

/**
*	This class allows create a main and manage the inputs and outputs.
*	@author Jhon Ijaji.
*	@version 1.0
*	@since 1.0
*/
public class Main{
	
	private Scanner reader;
	private Legion legion;
	
	/**
	*	Main constructor<br>
	*	@throws IllegalArgumentException In the case of an invalid main.<br>
	*/
	public Main(){
	    reader = new Scanner(System.in);
	}
	
	/**
	*	This method create a default legion and default angels into the legion.<br>
	*	@throws IllegalArgumentException In the case of an invalid main.<br>
	*/
	public void init(){
		legion = new Legion(Legion.ARCHANGELS);
	    legion.addAngel("Miguel","https://bit.ly/337AIFa",
		"Oh San Miguel arcángel. Tu que eres el guerrero predilecto de Dios. Te honramos, te veneramos, y te bendecimos."+
		"Te pedimos humildemente que veles por nuestra protección. Que seas tu valiente guerrero delante de nosotros."+
		"Para que ninguna potestad de maldad o peligro. Pueda levantarse en nuestro perjuicio. Así como te enfrentaste a sus enemigos."+
		"Te ruego que te enfrentes con quienes procuran el mal de mi familia. Te ruego que traigas contigo las huestes celestiales"+
		"Para que velen por mi hogar y familia en todo  momento. San Miguel arcángel, valiente guerrero de Dios"+
		"Te pido humildemente, que intercedas por nosotros ante él. Para que halle gracia delante de nuestro rostro"+
		"Y pueda guardarnos de todo mal y todo peligro. Gracias arcángel san Miguel, porque tú escuchas nuestra oración.",
		29,"September",legion.setSkill("Protection"),"Blue",15,"Rosemary",100);
        legion.addAngel("Rafael","https://bit.ly/2OnkfIH","(...) Oh gran asistente de Dios, tú que todo lo puedes hacer y a cualquier hombre puedes sanar."+
		"Te pido que veles por mi salud, para no sufrir ningún tipo de enfermedad de gravedad."+
		"Además, ruego por todos los enfermos quienes sufren de dolores e inquietudes."+ 
		"Para ellos solicito curas apropiadas para que logren salir adelante. Amén.",
		29,"September",legion.setSkill("Health"),"Green",15,"Pine tree",100);
	}
	
	public static void main(String[] args){
		Main main = new Main();
		main.init();
		boolean exit = false;
		int supp;
		do{
			main.menu();
			int menu = main.reader.nextInt();
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
					main.reader.nextLine();
					do{
						System.out.println("Name:");
						name = main.reader.nextLine();
						if(main.legion.checkName(name)==true) {
							checkName = true;
						}
					}while(checkName==false);
					System.out.println("Photo:");
					String photo = main.reader.nextLine();
					System.out.println("Prayer:");
					String prayer = main.reader.nextLine();
					do{
						System.out.println("Celebration Month:");
						month = main.reader.next();
						checkMonth = Legion.checkMonth(month);
					}while(checkMonth==false);
					do{
						System.out.println("Celebration Day:");
						day = main.reader.nextInt();
						checkDay = Legion.checkDay(Legion.correctlyMonth(month),day);
					}while(checkDay==false);
					main.reader.nextLine();
					do{
						System.out.println("Skill: ");
						skill = main.reader.nextLine();
						skill = main.legion.setSkill(skill);
						checkSkill = main.legion.checkSkill(skill);
					}while(checkSkill==true);
					System.out.println("\n"+"Input the Attributes of the Candle > \n"+"<>Color:");
					String color = main.reader.nextLine();
					System.out.println("<>Size:");
					double size = main.reader.nextDouble();
					System.out.println("<>Essence:");
					main.reader.nextLine();
					String essence = main.reader.nextLine();
					System.out.println("<>Illuminance:");
					double illuminance = main.reader.nextDouble();
					main.legion.addAngel(name, photo, prayer, day, Legion.correctlyMonth(month), skill, color, size, essence, illuminance);
					System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
					supp = main.reader.nextInt();
					if(supp==2) {
						endCreate = true;
					}else if(supp!=1){
						System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
					}
				}while(endCreate==false);
			}else if(menu==2){
				boolean endSearch = false;
				do {
					String searchName = "";
					String searchSkill = "";
					System.out.println("\n"+"Search: \n"+"<1>.Name \n"+"<2>.Skill \n");
					int search = main.reader.nextInt();
					if(search==1){	
						System.out.println("\n"+"Name:");
						main.reader.nextLine();
						searchName = main.reader.nextLine();
						if(main.legion.searchAngel(1,searchName).equalsIgnoreCase("Doesn't exist.")){
							System.out.println("\n"+"Doesnn't exist."+"\n");
						}else{
							System.out.println("\n"+main.legion.searchAngel(1,searchName));
						}
					}else if(search==2){
						System.out.println("\n"+"Skill:");
						main.reader.nextLine();
						searchSkill = main.reader.nextLine();
						if(main.legion.searchAngel(2,searchSkill).equalsIgnoreCase("Doesn't exist.")){
							System.out.println("\n"+"Doesn't exist."+"\n");							
						}else{
							System.out.println("\n"+main.legion.searchAngel(2,searchSkill));
						}
					}else{
						System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
					}
					if(search==1 || search==2){
						System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
						supp = main.reader.nextInt();
						if(supp==2) {
							endSearch = true;
						}else if(supp!=1){
							System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
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
					System.out.println("\n"+main.legion.showCelebrationsMonth(Legion.correctlyMonth(oneMonth)));
					System.out.println("<1>.Continue or <2>.Return to the Menu? \n");
					supp = main.reader.nextInt();
					if(supp==2) {
						endSearchMonth = true;
					}else if(supp!=1){
						System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
					}
				}while(endSearchMonth==false);
			}else if(menu==4){
				System.out.println("\n"+main.legion.showAllCelebrations()+"\n");
			}else if(menu==5) {
				main.instructions();
			}else if(menu==0){
				System.out.println("\n"+"Bye. Thank you for use this program");
				exit = true;
			}else{
				System.out.println("\n"+"Invalid function. Please write the correct number of the function.");
			}
		}while(exit==false);
	}
	
	
	/**
	*	This method is the menu of the program<br>
	*/
	public void menu(){
		System.out.printf("%n"+"Angels %s%n"+"Legion: %s%n"+
		"Number of Angels: %s%n"+
		"<1>.Create an Angel %n"+
		"<2>.Search an Angel %n"+
		"<3>.Show All Celebrations in one Month %n"+
		"<4>.Show All Celebrations in the Year %n"+
		"<5>.Instructions %n"+
		"<0>.Exit %n%n", 
		legion.getAngelType(), legion.getName(), legion.createdAngels());
	}
	
	/**
	*	This method contains the instructions to use the program.<br>
	*/
	public void instructions(){
		System.out.println("\n"+"Program Instructions: \n"+
		">ome of the recognized skills are the <1>protection, <2>health, <3>abundance, <4>justice, <5>loyalty \n"+
		"You can use the number for set the skill for one angel or create another skills"+
		">The month can be input in number or name. \n"+
		">The name must be finish in <el> \n"+">The illuminance must be measured in lux \n");
	}

}