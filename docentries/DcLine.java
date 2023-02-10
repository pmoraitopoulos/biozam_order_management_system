package docentries;

import java.util.Scanner;
import java.util.UUID;

public abstract class DcLine {
	
	private String DocentryId;
	private String id = UUID.randomUUID().toString();
	
	Scanner in = new Scanner(System.in);
	
	public DcLine() {
	}

	public String getDocentryId() {
		return DocentryId;
	}

	protected void setDocentryId(String docentryId) {
		DocentryId = docentryId;
	}

	public String getId() {
		return id;
	}
	
	

}
