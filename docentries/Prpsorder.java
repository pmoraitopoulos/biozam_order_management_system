package docentries;

import java.util.ArrayList;

import traders.Supplier;

public class Prpsorder extends Docentry {
	public Prpsorder(String date, int no, String abbreviation, FiscalYear fy) {
		super(date, no, abbreviation, fy);
		// TODO Auto-generated constructor stub
	}

	public Salesorder sales;
	public ArrayList<FsyrLimit> calculatedWithFYLimits = new ArrayList<FsyrLimit>();
	public ArrayList<PrpsOrderLines> lines = new ArrayList<PrpsOrderLines>();
	public Supplier prpsordersplr;

	public void orderByFruit() {
		throw new UnsupportedOperationException();
	}

	public void orderBySupplier() {
		throw new UnsupportedOperationException();
	}
}