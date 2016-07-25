package labassign4;

public class MenuOrder {
	private int cokePrice;
	private int lemonPrice;
	private int coffeePrice;
	int change;
	public int getCokePrice() {
		return cokePrice;
	}
	public void setCokePrice(int cokePrice) {
		this.cokePrice = cokePrice;
	}
	public int getLemonPrice() {
		return lemonPrice;
	}
	public void setLemonPrice(int lemonPrice) {
		this.lemonPrice = lemonPrice;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	public void showMenu(){
		System.out.println("0:Coke."+getCokePrice());
		System.out.println("1:Lemeonade."+getLemonPrice());
		System.out.println("2:Coffee."+getCoffeePrice());
	}
	public void drinkCost(int inputMoney,int menuChoice){
		switch(menuChoice){
		case 0: 
			change=inputMoney-cokePrice;
			break;
		case 1:
			change=inputMoney-lemonPrice;
			break;
		case 2: 
			change=inputMoney-coffeePrice;
			break;
		}
	}
	public void showResult(int menuChoice){
		switch(menuChoice){
		case 0: 
			System.out.println("You selected Coke.");
			break;
		case 1:
			System.out.println("You selected Lemonade.");
			break;
		case 2:
			System.out.println("You selected Coffee.");
			break;
		}
		System.out.println("Your change is "+change+"won.");
	
	}
	
}
