package users;

import java.util.UUID;

public class Privilege {
	private String id = UUID.randomUUID().toString();
	private String name;
	private boolean canCreateFruit;
	private boolean canUpdateFruit;
	private boolean canDeleteFruit;
	private boolean canViewFruit;
	private boolean canCreateJam;
	private boolean canUpdateJam;
	private boolean canDeleteJam;
	private boolean canViewJam;
	private boolean canCreateSupplier;
	private boolean canUpdateSupplier;
	private boolean canDeleteSupplier;
	private boolean canViewSupplier;
	private boolean canCreateCustomer;
	private boolean canUpdateCustomer;
	private boolean canDeleteCustomer;
	private boolean canViewCustomer;
	private boolean canCreateSalesOrder;
	private boolean canUpdateSalesOrder;
	private boolean canDeleteSalesOrder;
	private boolean canViewSalesOrder;
	private boolean canCreatePurchOrder;
	private boolean canUpdatePurchOrder;
	private boolean canDeletePurchOrder;
	private boolean canViewPurchOrder;
	private boolean canCreatePrpsOrder;
	private boolean canUpdatePrpsOrder;
	private boolean canDeletePrpsOrder;
	private boolean canViewPrpsOrder;
	private boolean canCreateFsyrLimit;
	private boolean canUpdateFsyrLimit;
	private boolean canDeleteFsyrLimit;
	private boolean canViewFsyrLimit;
	private boolean canCreateProductivity;
	private boolean canUpdateProductivity;
	private boolean canDeleteProductivity;
	private boolean canViewProductivity;
	private boolean canCreateShipping;
	private boolean canUpdateShipping;
	private boolean canDeleteShipping;
	private boolean canViewShipping;
	private boolean canCreateUser;
	private boolean canViewUser;
	private boolean canDeleteUser;
	private boolean canUpdateUser;
	private boolean canCreatePrivilege;
	private boolean canUpdatePrivilege;
	private boolean canDeletePrivilege;
	private boolean canViewPrivilege;
	private boolean canCreateFiscalYear;
	private boolean canUpdateFiscalYear;
	private boolean canDeleteFiscalYear;
	private boolean canViewFiscalYear;
	
	public Privilege(String name) {
		this.setName(name);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public boolean getCanCreateFruit() {
		return this.canCreateFruit;
	}

	public void setCanCreateFruit(boolean aCanCreateFruit) {
		this.canCreateFruit = aCanCreateFruit;
	}

	public boolean getCanUpdateFruit() {
		return this.canUpdateFruit;
	}

	public void setCanUpdateFruit(boolean aCanUpdateFruit) {
		this.canUpdateFruit = aCanUpdateFruit;
	}

	public boolean getCanDeleteFruit() {
		return this.canDeleteFruit;
	}

	public void setCanDeleteFruit(boolean aCanDeleteFruit) {
		this.canDeleteFruit = aCanDeleteFruit;
	}

	public boolean getCanViewFruit() {
		return this.canViewFruit;
	}

	public void setCanViewFruit(boolean aCanViewFruit) {
		this.canViewFruit = aCanViewFruit;
	}

	public boolean getCanCreateJam() {
		return this.canCreateJam;
	}

	public void setCanCreateJam(boolean aCanCreateJam) {
		this.canCreateJam = aCanCreateJam;
	}

	public boolean getCanUpdateJam() {
		return this.canUpdateJam;
	}

	public void setCanUpdateJam(boolean aCanUpdateJam) {
		this.canUpdateJam = aCanUpdateJam;
	}

	public boolean getCanDeleteJam() {
		return this.canDeleteJam;
	}

	public void setCanDeleteJam(boolean aCanDeleteJam) {
		this.canDeleteJam = aCanDeleteJam;
	}

	public boolean getCanViewJam() {
		return this.canViewJam;
	}

	public void setCanViewJam(boolean aCanViewJam) {
		this.canViewJam = aCanViewJam;
	}

	public boolean getCanCreateSupplier() {
		return this.canCreateSupplier;
	}

	public void setCanCreateSupplier(boolean aCanCreateSupplier) {
		this.canCreateSupplier = aCanCreateSupplier;
	}

	public boolean getCanUpdateSupplier() {
		return this.canUpdateSupplier;
	}

	public void setCanUpdateSupplier(boolean aCanUpdateSupplier) {
		this.canUpdateSupplier = aCanUpdateSupplier;
	}

	public boolean getCanDeleteSupplier() {
		return this.canDeleteSupplier;
	}

	public void setCanDeleteSupplier(boolean aCanDeleteSupplier) {
		this.canDeleteSupplier = aCanDeleteSupplier;
	}

	public boolean getCanViewSupplier() {
		return this.canViewSupplier;
	}

	public void setCanViewSupplier(boolean aCanViewSupplier) {
		this.canViewSupplier = aCanViewSupplier;
	}

	public boolean getCanCreateCustomer() {
		return this.canCreateCustomer;
	}

	public void setCanCreateCustomer(boolean aCanCreateCustomer) {
		this.canCreateCustomer = aCanCreateCustomer;
	}

	public boolean getCanUpdateCustomer() {
		return this.canUpdateCustomer;
	}

	public void setCanUpdateCustomer(boolean aCanUpdateCustomer) {
		this.canUpdateCustomer = aCanUpdateCustomer;
	}

	public boolean getCanDeleteCustomer() {
		return this.canDeleteCustomer;
	}

	public void setCanDeleteCustomer(boolean aCanDeleteCustomer) {
		this.canDeleteCustomer = aCanDeleteCustomer;
	}

	public boolean getCanViewCustomer() {
		return this.canViewCustomer;
	}

	public void setCanViewCustomer(boolean aCanViewCustomer) {
		this.canViewCustomer = aCanViewCustomer;
	}

	public boolean getCanCreateSalesOrder() {
		return this.canCreateSalesOrder;
	}

	public void setCanCreateSalesOrder(boolean aCanCreateSalesOrder) {
		this.canCreateSalesOrder = aCanCreateSalesOrder;
	}

	public boolean getCanUpdateSalesOrder() {
		return this.canUpdateSalesOrder;
	}

	public void setCanUpdateSalesOrder(boolean aCanUpdateSalesOrder) {
		this.canUpdateSalesOrder = aCanUpdateSalesOrder;
	}

	public boolean getCanDeleteSalesOrder() {
		return this.canDeleteSalesOrder;
	}

	public void setCanDeleteSalesOrder(boolean aCanDeleteSalesOrder) {
		this.canDeleteSalesOrder = aCanDeleteSalesOrder;
	}

	public boolean getCanViewSalesOrder() {
		return this.canViewSalesOrder;
	}

	public void setCanViewSalesOrder(boolean aCanViewSalesOrder) {
		this.canViewSalesOrder = aCanViewSalesOrder;
	}

	public boolean getCanCreatePurchOrder() {
		return this.canCreatePurchOrder;
	}

	public void setCanCreatePurchOrder(boolean aCanCreatePurchOrder) {
		this.canCreatePurchOrder = aCanCreatePurchOrder;
	}

	public boolean getCanUpdatePurchOrder() {
		return this.canUpdatePurchOrder;
	}

	public void setCanUpdatePurchOrder(boolean aCanUpdatePurchOrder) {
		this.canUpdatePurchOrder = aCanUpdatePurchOrder;
	}

	public boolean getCanDeletePurchOrder() {
		return this.canDeletePurchOrder;
	}

	public void setCanDeletePurchOrder(boolean aCanDeletePurchOrder) {
		this.canDeletePurchOrder = aCanDeletePurchOrder;
	}

	public boolean getCanViewPurchOrder() {
		return this.canViewPurchOrder;
	}

	public void setCanViewPurchOrder(boolean aCanViewPurchOrder) {
		this.canViewPurchOrder = aCanViewPurchOrder;
	}

	public boolean getCanCreatePrpsOrder() {
		return this.canCreatePrpsOrder;
	}

	public void setCanCreatePrpsOrder(boolean aCanCreatePrpsOrder) {
		this.canCreatePrpsOrder = aCanCreatePrpsOrder;
	}

	public boolean getCanUpdatePrpsOrder() {
		return this.canUpdatePrpsOrder;
	}

	public void setCanUpdatePrpsOrder(boolean aCanUpdatePrpsOrder) {
		this.canUpdatePrpsOrder = aCanUpdatePrpsOrder;
	}

	public boolean getCanDeletePrpsOrder() {
		return this.canDeletePrpsOrder;
	}

	public void setCanDeletePrpsOrder(boolean aCanDeletePrpsOrder) {
		this.canDeletePrpsOrder = aCanDeletePrpsOrder;
	}

	public boolean getCanViewPrpsOrder() {
		return this.canViewPrpsOrder;
	}

	public void setCanViewPrpsOrder(boolean aCanViewPrpsOrder) {
		this.canViewPrpsOrder = aCanViewPrpsOrder;
	}

	public boolean getCanCreateFsyrLimit() {
		return this.canCreateFsyrLimit;
	}

	public void setCanCreateFsyrLimit(boolean aCanCreateFsyrLimit) {
		this.canCreateFsyrLimit = aCanCreateFsyrLimit;
	}

	public boolean getCanUpdateFsyrLimit() {
		return this.canUpdateFsyrLimit;
	}

	public void setCanUpdateFsyrLimit(boolean aCanUpdateFsyrLimit) {
		this.canUpdateFsyrLimit = aCanUpdateFsyrLimit;
	}

	public boolean getCanDeleteFsyrLimit() {
		return this.canDeleteFsyrLimit;
	}

	public void setCanDeleteFsyrLimit(boolean aCanDeleteFsyrLimit) {
		this.canDeleteFsyrLimit = aCanDeleteFsyrLimit;
	}

	public boolean getCanViewFsyrLimit() {
		return this.canViewFsyrLimit;
	}

	public void setCanViewFsyrLimit(boolean aCanViewFsyrLimit) {
		this.canViewFsyrLimit = aCanViewFsyrLimit;
	}

	public boolean getCanCreateProductivity() {
		return this.canCreateProductivity;
	}

	public void setCanCreateProductivity(boolean aCanCreateProductivity) {
		this.canCreateProductivity = aCanCreateProductivity;
	}

	public boolean getCanUpdateProductivity() {
		return this.canUpdateProductivity;
	}

	public void setCanUpdateProductivity(boolean aCanUpdateProductivity) {
		this.canUpdateProductivity = aCanUpdateProductivity;
	}

	public boolean getCanDeleteProductivity() {
		return this.canDeleteProductivity;
	}

	public void setCanDeleteProductivity(boolean aCanDeleteProductivity) {
		this.canDeleteProductivity = aCanDeleteProductivity;
	}

	public boolean getCanViewProductivity() {
		return this.canViewProductivity;
	}

	public void setCanViewProductivity(boolean aCanViewProductivity) {
		this.canViewProductivity = aCanViewProductivity;
	}

	public boolean getCanCreateShipping() {
		return this.canCreateShipping;
	}

	public void setCanCreateShipping(boolean aCanCreateShipping) {
		this.canCreateShipping = aCanCreateShipping;
	}

	public boolean getCanUpdateShipping() {
		return this.canUpdateShipping;
	}

	public void setCanUpdateShipping(boolean aCanUpdateShipping) {
		this.canUpdateShipping = aCanUpdateShipping;
	}

	public boolean getCanDeleteShipping() {
		return this.canDeleteShipping;
	}

	public void setCanDeleteShipping(boolean aCanDeleteShipping) {
		this.canDeleteShipping = aCanDeleteShipping;
	}

	public boolean getCanViewShipping() {
		return this.canViewShipping;
	}

	public void setCanViewShipping(boolean aCanViewShipping) {
		this.canViewShipping = aCanViewShipping;
	}

	public boolean getCanCreateUser() {
		return this.canCreateUser;
	}

	public void setCanCreateUser(boolean aCanCreateUser) {
		this.canCreateUser = aCanCreateUser;
	}

	public boolean getCanViewUser() {
		return this.canViewUser;
	}

	public void setCanViewUser(boolean aCanViewUser) {
		this.canViewUser = aCanViewUser;
	}

	public boolean getCanDeleteUser() {
		return this.canDeleteUser;
	}

	public void setCanDeleteUser(boolean aCanDeleteUser) {
		this.canDeleteUser = aCanDeleteUser;
	}

	public boolean getCanUpdateUser() {
		return this.canUpdateUser;
	}

	public void setCanUpdateUser(boolean aCanUpdateUser) {
		this.canUpdateUser = aCanUpdateUser;
	}

	public boolean getCanCreatePrivilege() {
		return this.canCreatePrivilege;
	}

	public void setCanCreatePrivilege(boolean aCanCreatePrivilege) {
		this.canCreatePrivilege = aCanCreatePrivilege;
	}

	public boolean getCanUpdatePrivilege() {
		return this.canUpdatePrivilege;
	}

	public void setCanUpdatePrivilege(boolean aCanUpdatePrivilege) {
		this.canUpdatePrivilege = aCanUpdatePrivilege;
	}

	public boolean getCanDeletePrivilege() {
		return this.canDeletePrivilege;
	}

	public void setCanDeletePrivilege(boolean aCanDeletePrivilege) {
		this.canDeletePrivilege = aCanDeletePrivilege;
	}

	public boolean getCanViewPrivilege() {
		return this.canViewPrivilege;
	}

	public void setCanViewPrivilege(boolean aCanViewPrivilege) {
		this.canViewPrivilege = aCanViewPrivilege;
	}

	public boolean getCanCreateFiscalYear() {
		return this.canCreateFiscalYear;
	}

	public void setCanCreateFiscalYear(boolean aCanCreateFiscalYear) {
		this.canCreateFiscalYear = aCanCreateFiscalYear;
	}

	public boolean getCanUpdateFiscalYear() {
		return this.canUpdateFiscalYear;
	}

	public void setCanUpdateFiscalYear(boolean aCanUpdateFiscalYear) {
		this.canUpdateFiscalYear = aCanUpdateFiscalYear;
	}

	public boolean getCanDeleteFiscalYear() {
		return this.canDeleteFiscalYear;
	}

	public void setCanDeleteFiscalYear(boolean aCanDeleteFiscalYear) {
		this.canDeleteFiscalYear = aCanDeleteFiscalYear;
	}

	public boolean getCanViewFiscalYear() {
		return this.canViewFiscalYear;
	}

	public void setCanViewFiscalYear(boolean aCanViewFiscalYear) {
		this.canViewFiscalYear = aCanViewFiscalYear;
	}
}