package ui;
import java.util.Scanner;

public class Angels{
	private Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args){
		Legion legion = new Legion();
		do{
			boolean exit = false;
			System.out.println("Angels: \n"+"1.Create an Angel \n"+"2.Search an Angel \n"+"3.Show All Angels \n"+"0.Exit");
			int main = reader.nextInt();
			if(main==1){
				System.out.println("Input the attributes of the archangel");
				do{
					boolean existsName;
					String name = reader.nextLine();
					existsName = legion.checkName(name);
				}while(existsName==true);
				String prayer = reader.nextLine();
				int day = reader.nextInt();
				String month = reader.next():
				do{
					boolean existsSkill;
					String skill = reader.nextLine();
					existsSkil = legion.checkSkill(skill);
				}while(existsSkill==true);
				String color = reader.nextLine();
				double size = reader.nextDouble();
				String essence = reader.nextLine();
				double illuminance = reader.nextDouble();
				legion.manager(name, prayer, day, month, skill, color, sixe, essence, illuminance);
			}else if(main==2){
				System.out.println("Search: \n"+"1.Name \n"+"2.Power");
				int search = reader.nextInt();
			}else if(main==3){
				System.out.println("A");
			}else if(main==0){
				System.out.println("Bye");
			}
		}while(exit==false);
	}
}