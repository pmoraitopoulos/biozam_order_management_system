package docentries;

import items.Fruit;

public class Purchorderline extends DcLine {
	
	private Fruit fruit;
	private double qty=0;
	private double price=0;
	private double grossval=0;
	private double netval=0;
	private double discval=0;
	private double discperc=0;
	private double vatval=0;
	private double totalval=0;
	private double vat=0;
	
	
	public Purchorderline(double qty, Fruit fruit) {
		this.fruit = fruit;
		this.qty = qty;
		this.price = fruit.getPurchprice();
		this.vat = fruit.getVat();
		this.setDiscPerc(0);
		calculateAccumulators();
	}
	
	public void setQty(double qty) {
		this.qty = qty;
		this.calculateAccumulators();
	}
	
	public void setPrice(double price) {
		this.price = price;
		calculateAccumulators();
	}
	
	
	public void setDiscPerc(double disc) {
		if(disc>=0 && disc<=1) {
			this.discperc = disc;
		} else {
			System.out.println("Discount cannot be more than 1 and bellow 0");
			this.setDiscPerc(in.nextDouble());
		}
		calculateAccumulators();
		
	}
	
	protected void calculateGrossVal() {
		this.grossval = this.getQty()*price;
	}
	
	protected void calculateDiscVal() {
		this.discval = grossval*discperc;
	}
	
	protected void calculateNetval() {
		this.netval = grossval - discval;
	}

	protected void calculateVatVal() {
		this.vatval = this.netval*vat;
	}
	
	protected void calculateTotalVal() {
		this.totalval = this.netval + this.vatval;
	}
	
	public void calculateAccumulators() {
		calculateGrossVal();
		calculateDiscVal();
		calculateNetval();
		calculateVatVal();
		calculateTotalVal();
	}

	public Fruit getFruit() {
		return fruit;
	}

	public double getPrice() {
		return price;
	}

	public double getGrossval() {
		return grossval;
	}

	public double getNetval() {
		return netval;
	}

	public double getDiscval() {
		return discval;
	}

	public double getDiscperc() {
		return discperc;
	}

	public double getVatval() {
		return vatval;
	}

	public double getTotalval() {
		return totalval;
	}

	public double getVat() {
		return vat;
	}
	
	public double getQty() {
		return qty;
	}
	
	public void printInfo() {
		System.out.println("Kodikos: "+fruit.getCode());
		System.out.println("Perigrafi: "+fruit.getName());
		System.out.println("Posotita: "+getQty());
		System.out.println("Timi: "+getPrice());
		System.out.println("Axia Pro Ektposeon: "+getGrossval());
		System.out.println("Ekptosi (Pososto): "+getDiscperc()*100);
		System.out.println("Ekptosi (Axia): "+getDiscval());
		System.out.println("Axia Meta Ekptoseon: "+ getNetval());
		System.out.println("Axia FPA: "+getVatval());
		System.out.println("Sinoliki Axia: "+ getTotalval());
		System.out.println("FPA: "+getVat()*100);
	}
	
	
}
