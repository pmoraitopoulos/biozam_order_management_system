package items;
public class Jam extends Item{

	private double salesprice;
	private Fruit madeOf;
	private double qtyMadeOf;
	
	public Jam(ItemDB db, String aCode, String aName, String aMu, double purchprice, Fruit madeof, double qty, double vat) {
		super(db, aCode, aName, aMu, vat);
		this.setSalePrice(purchprice);
		this.setMadeOf(madeof);
		this.setQtyMadeOf(qty);
		db.addItem(this);
		System.out.println("Jam "+getCode() + " - " + getName() + " has been created and added on DB.");
	}
	
	
	public double getSalePrice() {
		return salesprice;
	}
	
	public Fruit getMadeOf() {
		return madeOf;
	}
	
	public double getqtyMadeOf() {
		return qtyMadeOf;
	}
	
	public void setQtyMadeOf(double qty) {
		this.qtyMadeOf = qty;
	}
	
	public void setMadeOf(Fruit frt) {
		this.madeOf = frt;
	}
	
	public void setSalePrice(double price) {
		if(price>=0) {
			this.salesprice = price;
		} else {
			System.out.println("Sale Price cannot be negative. Insert new Sale price:");
			this.setSalePrice(in.nextDouble());
		}
		
	}
	
	public void printInfo() {
		System.out.println("Stoixeia Marmelas");
		super.printInfo();
		System.out.println("Timi Polisis: " + getSalePrice());
		System.out.println("Frouto Paragogis: " + getMadeOf().getCode()+ " - "+ getMadeOf().getName());
		System.out.println("Posotita Froutou Paragogis: "+getqtyMadeOf());
		System.out.println("--------------------------");
	}
	
	
	
	
	
	
}