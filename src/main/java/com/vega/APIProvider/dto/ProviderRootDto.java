package com.vega.APIProvider.dto;

public class ProviderRootDto {
	private Integer providerrootid;
	private String name;
	private String logo;
	private String rs;
	private String vatcode;
	private String rcs;
	private String billingaddress;
	private Byte isdeleted;
	public Integer getProviderrootid() {
		return providerrootid;
	}
	public void setProviderrootid(Integer providerrootid) {
		this.providerrootid = providerrootid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public String getVatcode() {
		return vatcode;
	}
	public void setVatcode(String vatcode) {
		this.vatcode = vatcode;
	}
	public String getRcs() {
		return rcs;
	}
	public void setRcs(String rcs) {
		this.rcs = rcs;
	}
	public String getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}
	public Byte getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Byte isdeleted) {
		this.isdeleted = isdeleted;
	}
	public ProviderRootDto(Integer providerrootid, String name, String logo, String rs, String vatcode, String rcs,
			String billingaddress, Byte isdeleted) {
		super();
		this.providerrootid = providerrootid;
		this.name = name;
		this.logo = logo;
		this.rs = rs;
		this.vatcode = vatcode;
		this.rcs = rcs;
		this.billingaddress = billingaddress;
		this.isdeleted = isdeleted;
	}
	

}
