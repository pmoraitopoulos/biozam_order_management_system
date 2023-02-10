package items;

import java.util.Scanner;

public abstract class Item {
	private String code;
	private String name;
	private String mu; //measurement unit
	private double vat;
	Scanner in = new Scanner(System.in);
	
	public Item(ItemDB db,String aCode, String aName, String aMu, double vat) {
		this.setCode(db, aCode);
		this.setName(aName);
		this.setMu(aMu);
		this.setVat(vat);
		
	}
	
	public double getVat() {
		return vat;
	}
	
	public void setVat(double vat) {
		if( vat>=0 && vat <= 1) {
			this.vat= vat;
		} else {
			System.out.println("Vat must be greater than 0 and smaller than 1. Set it again: ");
			this.setVat(in.nextDouble());
		}
		
	}

	public String getCode() {
		return code;
	}


	public void setCode(ItemDB db,String code) {
		
		
		if( code != null && !code.isBlank() && !code.isEmpty() ) {
			Item itm = db.searchDBby("code", code);
			
			if(itm == null) {
				this.code = code;
			}else {
				System.out.println("Item already exists with this code. Please insert a new one:");
				this.setCode(db, in.nextLine());
				
			}
		} else {
			System.out.println("Code cannot be empty. Insert code:");
			this.setCode(db, in.nextLine());
		}
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if( name != null && !name.isBlank() && !name.isEmpty() ) {
			this.name = name;
		} else {
			System.out.println("Name cannot be empty. Insert name:");
			this.setName(in.nextLine());
		}
	}

	public String getMu() {
		return mu;
	}


	public void setMu(String mu) {
		if( mu != null && !mu.isBlank() && !mu.isEmpty() ) {
			this.mu = mu;
		} else {
			System.out.println("Measurement unit cannot be empty. Insert MU:");
			this.setMu(in.nextLine());
		}
	}
	
	
	public void printInfo() {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Kodikos: "+getCode());
		System.out.println("Onoma: "+getName());
		System.out.println("MonadaMetrisis"+getMu());
		
	}
	
	
	
	
	
	
}