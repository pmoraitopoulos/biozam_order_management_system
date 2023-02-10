package users;
public class User {
	private String id;
	private String login;
	private String password;
	private String name;
	private String lastName;
	private String department;
	private boolean isAdmin;
	private String email;
	private boolean isActive;
	public Privilege myPrivileges;

	public String getId() {
		return this.id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String aLogin) {
		this.login = aLogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String aLastName) {
		this.lastName = aLastName;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String aDepartment) {
		this.department = aDepartment;
	}

	public void changePassword() {
		throw new UnsupportedOperationException();
	}

	public boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(boolean aIsAdmin) {
		this.isAdmin = aIsAdmin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String aEmail) {
		this.email = aEmail;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean aIsActive) {
		this.isActive = aIsActive;
	}
}