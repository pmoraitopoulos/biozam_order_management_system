package traders;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Trader {
	private String name;
	private String code;
	private String taxno;
	private String doy;
	private String street;
	private String streetno;
	private String city;
	private int postCode;
	private String job;
	private double balance;
	Scanner in = new Scanner(System.in);
	
	
	
	public Trader(String aName, String aCode, String aTaxno, String aDoy, String aStreet, String aStreetno, String aCity, int pc, String aJob, double balance) {
		this.setName(aName);
		this.setCode(aCode);
		this.setTaxno(aTaxno);
		this.setDoy(aDoy);
		this.setStreet(aStreet);
		this.setStreetno(aStreetno);
		this.setCity(aCity);
		this.setPostCode(pc);
		this.setJob(aJob);
		this.setBalance(balance);
		
		
	}
	
	public void dicrBalanceBy(double ammount) {
		this.balance -= ammount;
	}
	
	public void incrBalanceBy(double ammount) {
		this.balance += ammount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCity() {
		return city;
	}

	public int getPostCode() {
		return postCode;
	}

	//Getters & Setters
	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getTaxno() {
		return taxno;
	}

	public String getDoy() {
		return doy;
	}

	public String getStreet() {
		return street;
	}

	public String getStreetno() {
		return streetno;
	}


	public void  setName(String aName) {
		if( aName != null && !aName.isBlank() && !aName.isEmpty() ) {
				this.name = aName;
		}else {
			System.out.println("Name cannot be null. Insert new name:" );
			this.setName(in.nextLine());
		} 
		
	}


	public void setCode(String aCode) {
		
		if( aCode != null && !aCode.isBlank() && !aCode.isEmpty() ) {
			this.code = aCode;
		} else {
			System.out.println("Code cannot be null. Insert new code");
			this.setCode(in.nextLine());
		}
	}


	public void setTaxno(String aTaxno) {

		if( aTaxno != null && !aTaxno.isBlank() && !aTaxno.isEmpty() ) {
			this.taxno = aTaxno;
		} else {
			System.out.println("TaxNo cannot be empty. Insert Tax Number:");
			this.setTaxno(in.nextLine());
		}
	
	}


	public void setDoy(String doy) {
		this.doy = doy;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	
	public void setCity(String aCity) {
		this.city = aCity;
	}
	
	public void setPostCode(int pc) {
		this.postCode = pc;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Kodikos: "+getCode());
		System.out.println("Onoma: "+getName());
		System.out.println("AFM: "+getTaxno());
		System.out.println("DOY: "+getDoy());
		System.out.println("Epaggelma: "+getJob());
		System.out.println("Dieuthinsi: "+getStreet() + " " + getStreetno() + " " + getPostCode()+", " + getCity());
		System.out.println("Ipoloipo: " + getBalance());
		System.out.println("--------------------------------");
		System.out.println();
	}
	
}

