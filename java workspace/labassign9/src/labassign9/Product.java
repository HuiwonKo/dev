package labassign9;

public class Product { //Product
	int price; 
	int bonusPoint;
	Product(int price){ //constructor 
		this.price=price; //price instance variable °ª set
		bonusPoint=(int)(price/10.0); //bonusPoint °è»ê
	}
}
