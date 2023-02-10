import traders.*;

import java.sql.Date;

import docentries.*;
import users.*;
import items.*;
public class main {

	public static void main(String[] args) {
		
		//Dimiourgia vaseon kai enarxi programmatos
		System.out.println("BOMS - Biozam Orders Information System");
		System.out.println("Initializing....");
		
		TraderDB trdrDb = new TraderDB();
		//SearchDB Fields: code, name, taxno
		ItemDB itemDb = new ItemDB();
		//SearchDBBy Fields: code, name
		DocentryDB docDb = new DocentryDB();
		//Dimiourgia xrisis
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("Dmiourgia Neas Oikonomikis Xrisis");
		FiscalYear fy2023 = new FiscalYear( 2023, "2023-01-01", "2023-12-31" );
		//Dimiourgia Statheron Stoixeion Promitheuton
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("Dimiourgia Master Data apo to Xristi");
		Supplier splr1 = new Supplier(trdrDb, "Patidou Olga", 
									"PROM-00000001", "998563214", 
									"FAE Thessalonikis", "Vas. Olgas", 
									"15A", "Thessaloniki", 54634, "Agrotis", 0);
		
		Supplier splr2 = new Supplier(trdrDb, "Alexiou Fotis", "PROM-00000002", "013569874", 
									"Ionias Thessalonikis", "Xr. Smirnis", 
									"17", "Thessaloniki", 57400, "Emporia Frouton kai Viologikon Proionton", 786.32);
		//Dimiourgia Statheron Stoixeion Frouton
		Fruit frt1 = new Fruit(itemDb, "EID-00000001", "Fraoula", "Kila", 1.2, 0.24);
		Fruit frt2 = new Fruit(itemDb, "EID-00000002", "Mantarini", "Kila", 1.4, 0.24);
		Fruit frt3 = new Fruit(itemDb, "EID-00000003", "Portokali", "Kila", 0.9, 0.24);
		Fruit frt4 = new Fruit(itemDb, "EID-00000004", "Kerasi", "Kila", 2.9, 0.24);
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("Dimiourgia Transaction Data apo to xristi");
		
		
		//Dimiourgia paraggelias 1
		PurchOrder ord1 = new PurchOrder("2023-02-05", 1, fy2023);
		Supplier ord1splr = (Supplier) trdrDb.searchDBBy("code","PROM-00000001");
		ord1.setSupplier(ord1splr);
		ord1.setPayMethod(1);
		Purchorderline ord1ln1 = new Purchorderline(150, (Fruit) itemDb.searchDBby("name", "Fraoula") );
		ord1ln1.setPrice(2.3);
		ord1ln1.setDiscPerc(0.10);
		ord1.addLine(ord1ln1);;
		Purchorderline ord1ln2 = new Purchorderline(400, (Fruit) itemDb.searchDBby("name", "Mantarini") );
		ord1ln2.setPrice(0.95);
		ord1ln2.setDiscPerc(0.15);
		ord1.addLine(ord1ln2);;
		Purchorderline ord1ln3 = new Purchorderline(200, (Fruit) itemDb.searchDBby("name", "Mantarini") );
		ord1ln2.setPrice(2.8);
		ord1.addLine(ord1ln3);;
		Purchorderline ord1ln4 = new Purchorderline(600, (Fruit) itemDb.searchDBby("name", "Kerasi") );
		ord1ln2.setPrice(3.1);
		ord1ln2.setDiscPerc(0.15);
		ord1.addLine(ord1ln4);;
		//Prosthiki Paraggelias sti vasi kai apothikeusi kai grammon
		docDb.savePurchOrder(ord1);
		
		//Dimiourgia paraggelias 2
		PurchOrder ord2 = new PurchOrder("2023-02-05", 2, fy2023);
		Supplier ord2splr = (Supplier) trdrDb.searchDBBy("taxno","998563214");
		ord2.setSupplier(ord2splr);
		ord2.setPayMethod(1);
		ord2.setJustification("I Paradosi tha gini sto Ipokatastima.");
		ord2.setDeliveryAdress("Ieroloxiton 17, Athina, 12345");
		Purchorderline ord2ln1 = new Purchorderline(150, (Fruit) itemDb.searchDBby("name", "Fraoula") );
		ord2ln1.setPrice(1);
		ord2.addLine(ord2ln1);;
		Purchorderline ord2ln2 = new Purchorderline(400, (Fruit) itemDb.searchDBby("name", "Mantarini") );
		ord2ln2.setPrice(1.95);
		ord2ln2.setDiscPerc(0.15);
		ord2.addLine(ord2ln2);;
		Purchorderline ord2ln3 = new Purchorderline(200, (Fruit) itemDb.searchDBby("name", "Mantarini") );
		ord2ln3.setPrice(0.8);
		ord2.addLine(ord2ln3);;
		Purchorderline ord2ln4 = new Purchorderline(600, (Fruit) itemDb.searchDBby("name", "Kerasi") );
		ord2ln4.setPrice(5.1);
		ord2.addLine(ord2ln4);;
		//Prosthiki Paraggelias sti vasi kai apothikeusi kai grammon
		docDb.savePurchOrder(ord2);
		
		
		//Dimiourgia paraggelias 3
		PurchOrder ord3 = new PurchOrder("2023-02-05", 3, fy2023);
		Supplier ord3splr = (Supplier) trdrDb.searchDBBy("name","Alexiou Fotis");
		ord3.setSupplier(ord3splr);
		ord3.setPayMethod(1);
		Purchorderline ord3ln1 = new Purchorderline(150, (Fruit) itemDb.searchDBby("code", "EID-00000001") );
		ord3ln1.setPrice(1);
		ord3.addLine(ord3ln1);;
		Purchorderline ord3ln2 = new Purchorderline(400, (Fruit) itemDb.searchDBby("code", "EID-00000002") );
		ord3ln2.setPrice(1.95);
		ord3ln2.setDiscPerc(0.15);
		ord3.addLine(ord3ln2);;
		Purchorderline ord3ln3 = new Purchorderline(200, (Fruit) itemDb.searchDBby("code", "EID-00000001") );
		ord3ln3.setPrice(0.8);
		ord3.addLine(ord3ln3);;
		Purchorderline ord3ln4 = new Purchorderline(600, (Fruit) itemDb.searchDBby("code", "EID-00000004") );
		ord3ln4.setPrice(5.1);
		ord3.addLine(ord3ln4);;
		//Prosthiki Paraggelias sti vasi kai apothikeusi kai grammon
		docDb.savePurchOrder(ord3);

		//Dimiourgia paraggelias 3
		PurchOrder ord4 = new PurchOrder("2023-02-05", 4, fy2023);
		Supplier ord4splr = (Supplier) trdrDb.searchDBBy("name","Alexiou Fotis");
		ord4.setSupplier(ord4splr);
		ord4.setPayMethod(0);
		ord4.setJustification("Paradosi katopin epikoinonias.");
		ord4.setDeliveryAdress("Egnatia 14, Thessaloniki");
		Purchorderline ord4ln1 = new Purchorderline(300, (Fruit) itemDb.searchDBby("code", "EID-00000001") );
		ord4ln1.setPrice(1);
		ord4.addLine(ord4ln1);;
		Purchorderline ord4ln2 = new Purchorderline(1500, (Fruit) itemDb.searchDBby("code", "EID-00000002") );
		ord4ln2.setPrice(1.95);
		ord4ln2.setDiscPerc(0.15);
		ord4.addLine(ord4ln2);;
		Purchorderline ord4ln3 = new Purchorderline(2400, (Fruit) itemDb.searchDBby("code", "EID-00000003") );
		ord4ln3.setPrice(0.8);
		ord4.addLine(ord4ln3);;
		Purchorderline ord4ln4 = new Purchorderline(6060, (Fruit) itemDb.searchDBby("code", "EID-00000004") );
		ord4ln4.setPrice(5.1);
		ord4.addLine(ord4ln4);;
		//Prosthiki Paraggelias sti vasi kai apothikeusi kai grammon
		docDb.savePurchOrder(ord4);
		
		
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("O Xristis zitaei na dei olous tous kodikous ton paraggelion");
		
		docDb.printAllDocCodes();
		System.out.println();
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("O Xristis zitaei ti diagrafi tis paraggelias 2");
		
		docDb.deleteDoc(docDb.getDocByCode("PAR-00000002"));
		
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("O Xristis zitaei ektiposeis.");
		
		System.out.println();
		System.out.println();
		System.out.println("Ektiposi Anaforon Vasis Dedomenon");
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println();
		trdrDb.printAll();
		System.out.println();
		System.out.println();
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println();
		itemDb.printAll();
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println();
		docDb.reprintAllPurchOrders();
		System.out.println();
		System.out.println();
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println();
		docDb.reprintAllLines();
		System.out.println();
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println();
	}

}
