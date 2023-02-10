package traders;

public class Customer extends Trader {

	public Customer(TraderDB db, String aName, String aCode, String aTaxno, String aDoy, String aStreet, String aStreetno,
			String aCity, int pc, String aJob, double balance) {
		super(aName, aCode, aTaxno, aDoy, aStreet, aStreetno, aCity, pc, aJob, balance);
		this.setCode(db, aCode);
		this.setTaxno(db, aTaxno);
		db.addTrader(this);
		System.out.println("Customer "+this.getCode()+" - "+this.getName()+" has been created and added on DB.");
	}
	
	
	public void setTaxno(TraderDB db, String Taxno) {
	
		Trader trdr = db.searchDBBy("taxno", Taxno);
		
		if( trdr==null || !(trdr instanceof Customer) ) {
			super.setTaxno(Taxno);
		} else {
			System.out.println("There is already Customer with this Tax Number. Please insert new tax no:");
			this.setTaxno(db, in.nextLine());
		}
		
	}
	
	public void setCode(TraderDB db, String code) {
		
		Trader trdr = db.searchDBBy("code", code);
		
		if( trdr==null || !(trdr instanceof Customer)) {
			super.setCode(code);
		} else {
			System.out.println("There is already Customer with this Code. Please insert new Code:");
			this.setCode(db, in.nextLine());
		}
		
	}
	
	public void printInfo() {
		System.out.println("Stoixia Pelati");
		super.printInfo();
	}

	
}