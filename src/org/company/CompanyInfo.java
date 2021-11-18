package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Greens Tech");
		}
	private void companyId() {
		System.out.println("789");
		}
	private void companyAddress() {
		System.out.println("Anna nagar, Chennai");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
