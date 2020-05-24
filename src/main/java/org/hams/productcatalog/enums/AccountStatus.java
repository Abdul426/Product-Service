package org.hams.productcatalog.enums;

public enum AccountStatus {

	ACTIVE("Active"), INACTIVE("In-Active");

	final String status;

	private AccountStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
