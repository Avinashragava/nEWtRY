package org.company;

public class CompanyInfo {
	private void companyName()
	{
		System.out.println("company name");
	}
	private void companyId()
	{
		System.out.println("company Id");
	}
	private void companyAddress()
	{
		System.out.println("company Address");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}
	}


