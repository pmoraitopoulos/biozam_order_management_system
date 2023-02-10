package docentries;

import java.util.ArrayList;

import traders.Supplier;

public class Productivity extends Docentry {
	public Productivity(String date, int no, String abbreviation, FiscalYear fy) {
		super(date, no, abbreviation, fy);
		// TODO Auto-generated constructor stub
	}
	public Supplier supplier;
	public ArrayList<ProductiityLine> lines = new ArrayList<ProductiityLine>();
}