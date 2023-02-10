package items;
public class Fruit extends Item {
	
	
	private double purchprice;
	
	public Fruit(ItemDB db, String aCode, String aName, String aMu, double purchprice, double vat) {
		super(db, aCode, aName, aMu, vat);
		this.setPurchprice(purchprice);
		db.addItem(this);
		System.out.println("Fruit "+getCode() + " - " + getName() + " has been created and added on DB.");
	}
	
	
	public double getPurchprice() {
		return purchprice;
	}
	
	public void setPurchprice(double price) {
		if(price>=0) {
			this.purchprice = price;
		} else {
			System.out.println("Purchase Price cannot be negative. Insert new Purchase price:");
			this.setPurchprice(in.nextDouble());
		}
		
	}
	
	public void printInfo() {
		System.out.println("Stoixeia Froutou");
		super.printInfo();
		System.out.println("Timi Agoras: " + getPurchprice());
		System.out.println("--------------------------");
		System.out.println();
	}
	
	
	
}