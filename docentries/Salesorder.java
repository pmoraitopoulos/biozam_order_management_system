package docentries;

import java.util.ArrayList;

import traders.Customer;

public class Salesorder extends Docentry {
	public Salesorder(String date, int no, String abbreviation, FiscalYear fy) {
		super(date, no, abbreviation, fy);
		// TODO Auto-generated constructor stub
	}
	public Shipping contains;
	public Customer customer;
	public ArrayList<SalesOrderLine> unnamed_SalesOrderLine_ = new ArrayList<SalesOrderLine>();
}