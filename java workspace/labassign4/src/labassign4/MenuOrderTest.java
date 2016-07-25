package labassign4;

import java.util.Scanner;

public class MenuOrderTest {
	public static void main(String[] args){
		System.out.println("===========================");
		System.out.println("Major:Computer Engineering");
		System.out.println("ID:1415005");
		System.out.println("Name:Ko Huiwon");
		System.out.println("===========================");
		MenuOrder m=new MenuOrder();
		Scanner s=new Scanner(System.in);
		System.out.println("Input price for Coke");
		int cokePrice=s.nextInt();
		System.out.println("Input price for Lemonade");
		int lemonPrice=s.nextInt();
		System.out.println("Input price for Coffee");
		int coffeePrice=s.nextInt();
		m.setCoffeePrice(coffeePrice);
		m.setCokePrice(cokePrice);
		m.setLemonPrice(lemonPrice);
		String choice="Y";
		while(choice.equalsIgnoreCase("Y")){
		System.out.println("---Input Money---");
		int inputMoney=s.nextInt();
		System.out.println("---Select Drink---");
		m.showMenu();
		int menuChoice=s.nextInt();
		m.drinkCost(inputMoney,menuChoice);
		m.showResult(menuChoice);
		System.out.println("Do you want to continue?(y/n)");
		choice=s.nextLine();
		choice=s.nextLine();
		}
	}
}
