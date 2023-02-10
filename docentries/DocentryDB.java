package docentries;

import java.util.ArrayList;
import java.util.ListIterator;

import traders.Supplier;

public class DocentryDB {
	private ArrayList<Docentry> docentryDb = new ArrayList<Docentry>();
	private DcLineDB linedb;
	
	public DocentryDB() {
		System.out.println("Document Entries DB Initialized.");
		linedb  = new DcLineDB();
	}
	
	public void savePurchOrder(PurchOrder doc) {
		ArrayList<Purchorderline> doclines = doc.getAllLines();
		if(doclines.size() != 0) {
			doc.savePurchOrder();
			docentryDb.add(doc);
			for(Purchorderline ln : doclines) {
				linedb.addLine(ln);
			}
		} else {
			System.out.println(doc.getId()+" - " + doc.getCode() + "has no lines. Add lines to save.");
		}
		
		
	}
	
	public void deleteDoc(Docentry doc) {

		ListIterator<Docentry> iterator = docentryDb.listIterator();
		while (iterator.hasNext()) {
			Docentry dc = iterator.next();
			if (dc.getId().equals(doc.getId())) {
				iterator.remove();
				break;
			}
		}
		linedb.deleteAllLinesByDocId(String.valueOf(doc.getId()));
		if (doc instanceof PurchOrder) {
			Supplier splr = ((PurchOrder) doc).getSupplier();
			splr.dicrBalanceBy(((PurchOrder) doc).getTotalval());
		}
		System.out.println("To parastatiko kai oi grammes aftou me kodiko " + doc.getCode() + " diagrafikan apo ti vasi kai enimerothike to ipoloipo tou sinallasomenou.");
	
	
	}
	
	public Docentry getDocByCode(String code) {
		for(Docentry dc : docentryDb) {
			if(dc.getCode().equals(code)) {
				return dc;
			}
		}
		return null;
	}
	
	public void printAllDocCodes() {
		System.out.println("Parastatika Vasis");
		for( Docentry doc : docentryDb ) {
			
			System.out.println(doc.getCode());
		}
	}
	
	public void reprintAllPurchOrders() {
		System.out.println("Paragelies Agoron Vasis");
		for( Docentry doc : docentryDb ) {
			if( doc instanceof PurchOrder) {
				((PurchOrder) doc).printPurchOrder();
			}
		}
		
	}
	
	public void reprintAllLines() {
		linedb.printAllLines();
	}
	
}