package docentries;

import java.util.ArrayList;

import traders.Supplier;

public class PurchOrder extends Docentry {
	
	private Supplier supplier;
	private int payMethod; //0 Cash, 1 On Credit
	private double totalqty=0;
	private double grossval=0;
	private double totaldiscval=0;
	private double totalnetval=0;
	private double totalvatval=0;
	private double totalval=0;
	private double totaldiscperc=0;
	private String deliveryAdress;
	private double prevTraderBallance;
	private double newTraderBallance;
	
	
	
	private ArrayList<Purchorderline> lines = new ArrayList<Purchorderline>();
	
	
	
	
	

	public PurchOrder(String date, int no, FiscalYear fy) {
		super(date, no, "PAR", fy);
		}
	
	public void setSupplier(Supplier splr) {
		this.supplier = splr;
		this.prevTraderBallance = splr.getBalance();
		this.deliveryAdress = splr.getStreet()+" " + splr.getStreetno()+" " + splr.getPostCode()+" " + splr.getCity();
		
	}
	
	public void addLine(Purchorderline ln) {
		ln.setDocentryId(this.getId());
		lines.add(ln);
	}
	
	public ArrayList<Purchorderline> getAllLines(){
		return lines;
	}
	
	public void removeLineById(String Id) {
		for(Purchorderline ln : lines) {
			if(ln.getId() == Id) {
				lines.remove(ln);
			}
		}
	}
	
	protected void calculateTotalQty() {
		double qty=0;
		for(Purchorderline ln : this.getAllLines()) {
			qty =+ ln.getQty();
		}
		this.totalqty = qty;
	}
	
	protected void calculateTotalGrossVal() {
		double tgrossval=0;
		for(Purchorderline ln : this.getAllLines()) {
			tgrossval =+ ln.getGrossval();
		}
		this.grossval = tgrossval;
	}
	
	protected void calculateTotalDiscVal() {
		double totaldiscval=0;
		for(Purchorderline ln : this.getAllLines()) {
			totaldiscval =+ ln.getDiscval();
		}
		this.totaldiscval = totaldiscval;
	}
	
	protected void calculateTotalNetVal() {
		double totalnetval=0;
		for(Purchorderline ln : this.getAllLines()) {
			totalnetval =+ ln.getNetval();
		}
		this.totalnetval = totalnetval;
	}
	
	protected void calculateTotalVatVal() {
		double totalvatval=0;
		for(Purchorderline ln : this.getAllLines()) {
			totalvatval =+ ln.getVatval();
		}
		this.totalvatval = totalvatval;
	}
	
	protected void calculateTotalVal() {
		double totalval=0;
		for(Purchorderline ln : this.getAllLines()) {
			totalval =+ ln.getTotalval();
		}
		this.totalval = totalval;
	}
	
	protected void calculateTotalDiscPerc() {
		double disc = 0;
		
		if(this.grossval !=0) {
			disc = (this.totaldiscval/this.grossval)*100;
		}
		this.totaldiscperc = disc;
	}
	public void calculateAccumulators() {
		calculateTotalQty();
		calculateTotalGrossVal();
		calculateTotalDiscVal();
		calculateTotalNetVal();
		calculateTotalVatVal();
		calculateTotalVal();
		calculateTotalDiscPerc();
	}
	
	public void setPayMethod(int pm) {
		if(pm == 0 || pm ==1) {
			this.payMethod = pm;
		} else {
		System.out.println("Payment Method has two values. 0 is Cash, 1 is On Credit. You set "+String.valueOf(pm)+". Set again.");
		this.setPayMethod(in.nextInt());
		}
	}
	
	public int getPayMethod() {
		return payMethod;
	}
	
	public String getPayMethodName() {
		if(payMethod == 0) {
			return "Metrita";
		} else if(payMethod == 1) {
			return "Epi Pistosi";
		}
		return "Unknown Payment Method";
	}
	
	
	protected void savePurchOrder() {
		calculateAccumulators();
		this.supplier.incrBalanceBy(this.totalval*getPayMethod());
		this.newTraderBallance = this.prevTraderBallance + this.totalval*getPayMethod();
		System.out.println("Thelete na ektipothi to parastatiko; "+ this.getCode()+" (y/n)");
		String answer = in.nextLine();
		while( !( answer.equals("y") || answer.equals("n") ) ) {
			System.out.println("Thelete na ektipothi to parastatiko; "+ this.getCode()+" (y/n)");
			answer = in.nextLine();
		}
		if(answer.equals("y")) {
			this.printPurchOrder();
		} else {
			System.out.println("I ektiposi akirothike apo to xristi.");
			System.out.println();
		}
	
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public double getTotalqty() {
		return totalqty;
	}

	public double getGrossval() {
		return grossval;
	}

	public double getTotaldiscval() {
		return totaldiscval;
	}

	public double getTotalnetval() {
		return totalnetval;
	}

	public double getTotalvatval() {
		return totalvatval;
	}

	public double getTotalval() {
		return totalval;
	}

	public double getTotaldiscperc() {
		return totaldiscperc;
	}

	public String getDeliveryAdress() {
		return deliveryAdress;
	}

	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	
	
	
	public void printPurchOrder() {
		System.out.println("Stoixeia Paraggelias");
		System.out.println("Kodikos: "+getCode());
		System.out.println("Sintomorgafia: "+getAbbreviation());
		System.out.println("Arithmos Par: "+getNoAsString());
		System.out.println("Imerominia Ekdosis: " + getOfficialDateAsString());
		System.out.println("Tropos Pliromis: "+getPayMethodName());
		System.out.println("Stoixeia Paradosis: " + getDeliveryAdress());
		System.out.println("Aitiologia/Sxolia: "+getJustification());
		System.out.println("__________________________");
		System.out.println("");
		supplier.printInfo();
		System.out.println("__________________________");
		System.out.println("");
		System.out.println("Eidi Paraggelias");
		System.out.println("__________________________");
		int count = 1;
		for(Purchorderline ln : lines) {
			System.out.println("A/A: "+count);
			ln.printInfo();
			System.out.println();
			count++;
		}
		System.out.println("");
		System.out.println("__________________________");
		System.out.println("");
		System.out.println("Apotelesmata: ");
		System.out.println("__________________________");
		System.out.println();
		System.out.println("Sinoliki Posotita: "+getTotalqty());
		System.out.println("Axia pro Ekptoseon: "+getGrossval());
		System.out.println("Axia Ekptoseon: "+getTotaldiscval());
		System.out.println("Synoliko Pososto Ekptoseon: "+getTotaldiscperc());
		System.out.println("Axia Meta Ekptoseon: "+getTotalnetval());
		System.out.println("Ajia FPA: "+getTotalvatval());
		System.out.println("Pliroteo: "+getTotalval());
		System.out.println("Proigoumeno Ipoloipo Promitheuti: "+getPrevTraderBallance());
		System.out.println("Trexon Ipoloipo: "+getNewTraderBallance());
		System.out.println("__________________________");		
		
	}

	public double getPrevTraderBallance() {
		return prevTraderBallance;
	}

	public double getNewTraderBallance() {
		return newTraderBallance;
	}
	
	
	
	
}