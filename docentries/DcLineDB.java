package docentries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class DcLineDB {
	private ArrayList<DcLine> lineDB = new ArrayList<DcLine>();
	
	
	public DcLineDB() {
		System.out.println("Lines DB Initialized.");
	}
	
	
	public void addLine(DcLine ln) {
		lineDB.add(ln);
	}
	
	public ArrayList<DcLine> getLinesByDocId(String DocId) {
		ArrayList<DcLine> lines = new ArrayList<DcLine>();
		
		for(DcLine line : lineDB) {
			if(line.getDocentryId().equals(DocId)) {
				lines.add(line);
			}
		}
		
		return lines;
	}
	
	public void deleteLineById(String id) {
		boolean dummy = false;
		for(DcLine line : lineDB) {
			if(line.getId().equals(id)) {
				lineDB.remove(line);
				dummy = true;
			}
		}
		if(dummy) {
			System.out.println("A line has been deleted");
		}
		
	}
	
	public void deleteAllLinesByDocId(String DocId) {
		
		List<DcLine> linesToRemove = new ArrayList<>();
	    for (DcLine line : lineDB) {
	        if (line.getDocentryId().equals(DocId)) {
	            linesToRemove.add(line);
	        }
	    }
	    lineDB.removeAll(linesToRemove);
	    int count = linesToRemove.size();
	    if (count > 0) {
	        System.out.println(String.valueOf(count) + " lines have been deleted.");
	    } else {
	        System.out.println("No Lines deleted.");
	    }
	}
	
	public void printAllLines() {
		System.out.println("Anafora Grammon Vasis");
		System.out.println();
		System.out.println("________________________");
		int count = 1;
		for(DcLine ln : lineDB) {
			if(ln instanceof Purchorderline) {
				System.out.println();
				System.out.println("A/A:"+count);
				System.out.println("Id grammis: "+ln.getId());
				((Purchorderline) ln).printInfo();
				count++;
			}
		}
		
		
	}
	
}