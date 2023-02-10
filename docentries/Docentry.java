package docentries;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public abstract class Docentry {
	private Date officialDate;
	private String id = UUID.randomUUID().toString();
	private String code;
	private FiscalYear fy;
	private int no;
	private String abbreviation;
	private String justification;
	Scanner in = new Scanner(System.in);
	
	
	public Docentry(String date,int no, String abbreviation, FiscalYear fy) {
		this.setFy(fy);
		this.setAbbreviation(abbreviation);
		this.setNo(no);
		String aCode = abbreviation +"-"+ "0".repeat(8 - String.valueOf(no).length())+String.valueOf(no) ;
		this.setCode(aCode);
		this.setOfficialDate(date);	
		this.justification = "";
	}

	public String getJustification() {
		return justification;
	}
	
	public String getId() {
		return id;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public int getNo() {
		return no;
	}
	
	public String getNoAsString() {
		return String.valueOf(no);
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getAbbreviation() {
		return abbreviation;
	}


	protected void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}


	public Date getOfficialDate() {
		return officialDate;
	}
	
	public String getOfficialDateAsString() {
		return String.valueOf(officialDate);
	}

	public void setOfficialDate(String officialDate) {
		if(fy.fyContainsDate(officialDate)) {
			this.officialDate = Date.valueOf(officialDate);
		} else {
			System.out.println(officialDate + " does not contained in selected"
					+ " Fiscal Year "+fy.getCode()  + " - " + fy.getName() + " ("+fy.getFirstDay().toString() + " - " + fy.getLastDay() + "). Set new Date as String in this Format yyy-MM-dd.");
			this.setOfficialDate(in.nextLine());
		}
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public FiscalYear getFy() {
		return fy;
	}


	public void setFy(FiscalYear fy) {
		this.fy = fy;
	}
	
	
	
	
	
}