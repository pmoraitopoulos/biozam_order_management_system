package traders;

import java.util.ArrayList;

public class TraderDB {
	private ArrayList<Trader> traderDB = new ArrayList<Trader>();
	
	
	public TraderDB() {
		System.out.println("Traders DB Initialized.");
	}
	
	public void addTrader(Trader trdr) {
		traderDB.add(trdr);
	}
	
	public void deleteTrader(Trader trdr) {
		traderDB.remove(trdr);
	}
	
	public Trader searchDBBy(String field, String value ) {
		
		if(traderDB.size() >= 1) {
		
			if( field.equals("name") ) {
				for(Trader trdr : traderDB) {
					
					if(trdr.getName().equals(value) ) {
						return trdr;
					}
				}
			} else if(field.equals("code")) {
				for(Trader trdr : this.traderDB) {
					
					if(trdr.getCode().equals(value) ) {
						return trdr;	
					}
				}
			} else if(field.equals("taxno")) {
				for(Trader trdr : this.traderDB) {
					
					if(trdr.getTaxno().equals(value) ) {
						return trdr;
					}
				}
			}
		}
		return null;
	}
	
	public void emptyDB() {
		for(Trader trdr : this.traderDB) {
			this.deleteTrader(trdr);
			System.out.println("All Traders have been deleted.");
		}
	}
	
	public void deleteAllCustomers() {
		for(Trader trdr : this.traderDB) {
			if(trdr instanceof Customer) {
				this.deleteTrader(trdr);
			}
			System.out.println("All Traders have been deleted.");
		}
	}
	
	public void deleteAllSuppliers() {
		for(Trader trdr : this.traderDB) {
			if(trdr instanceof Customer) {
				this.deleteTrader(trdr);
			}
			System.out.println("All Traders have been deleted.");
		}
	}
	
	public void printAll() {
		System.out.println("Lista Sinallassomenon");
		System.out.println("________________________");
		for(Trader trdr : traderDB) {
			if(trdr instanceof Supplier) {
				Supplier splr = (Supplier) trdr;
				splr.printInfo();
			}
			if(trdr instanceof Customer) {
				Customer cstm = (Customer) trdr;
				cstm.printInfo();
			}
		}
	}

}
