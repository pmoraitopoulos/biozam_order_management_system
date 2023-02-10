package docentries;

import java.sql.Date;
import java.util.Scanner;

public class FiscalYear {
	private int code;
	private String name;
	private Date firstDay;
	private Date lastDay;
	Scanner in = new Scanner(System.in);
	
	public FiscalYear(int aCode, String first, String last) {
		this.setCode(aCode);
		this.name = "Xrisi " + getCode();
		this.setFirstDay(first);
		this.setLastDay(last);
		System.out.println("Fiscal year has  been created. Code: "+getCode() + " - " + getName() + " (" + String.valueOf(getFirstDay()) + " - " + String.valueOf(getLastDay()) + ")" );
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		if(code >= 2000 && code <= 2100) {
			this.code = code;
		} else if(code <2000) {
			System.out.println("Fiscal Year must be between 2000 and 2100. Insert again.");
			this.setCode(in.nextInt());
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(String firstDay) {
		this.firstDay = Date.valueOf(firstDay);
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(String lastDay) {
		this.lastDay = Date.valueOf(lastDay);
	}
	
	
	public boolean fyContainsDate(String aDate) {
		if( !isDdateBeforeFirstDay(aDate) && !isDateAfterLastDay(aDate) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isDateAfterLastDay(String aDate) {
		if(Date.valueOf(aDate).after(lastDay) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isDdateBeforeFirstDay(String aDate) {
		if( Date.valueOf(aDate).before(firstDay) ) {
			return true;
		} else {
			return false;
		}
	}
	
}