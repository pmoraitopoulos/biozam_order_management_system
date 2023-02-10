package items;

import java.util.ArrayList;

import traders.Trader;


public class ItemDB {
	private ArrayList<Item> itemDB = new ArrayList<Item>();
	
	
	public ItemDB() {
		System.out.println("Items DB Initialized.");
	}
	
	public void addItem(Item itm) {
		itemDB.add(itm);
	}
	
	public void deleteItem(Item itm) {
		itemDB.remove(itm);
	}
	
	public Item searchDBby(String field, String value) {
		
		if(itemDB.size() >= 1) {
			
			if( field.equals("name") ) {
				for(Item itm : itemDB) {
					if(itm.getName().equals(value) ) {
						return itm;
					}
				}
			} else if(field.equals("code")) {
				for(Item itm : this.itemDB) {
					if(itm.getCode().equals(value) ) {
						return itm;	
					}
				}
			}
		}
		return null;
		
	}
	
	public void printAll() {
		System.out.println("Lista Eidon");
		System.out.println("________________________");
		
		for(Item itm : itemDB) {
			if( itm instanceof Fruit) {
				Fruit frt = (Fruit) itm;
				frt.printInfo();
			}
			if( itm instanceof Jam) {
				Jam jam = (Jam) itm;
				jam.printInfo();
			}
		}
	}
}