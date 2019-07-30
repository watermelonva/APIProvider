package com.vega.APIProvider.dto;


import java.util.Date;



public class ProviderDto {

    private Short withrefund;
    private Short isdeleted;
    private Integer providerrootid;
    private Integer providerid;
    private String name;
    private String address;
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    private String phone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    private String fax;
    private String logo;
    private String gpslocation;
    private String rcs;
    private String mf;
    private String firstname;
    private String lastname;
    private String job;
    private String mobile;
    private String type;
    private String calcul;
    private Integer deletedby;
    private Date addeddate;
    private Date deleteddate;
    private Integer sectorid;
    private Date startingfrom;
    private String cuscode;
    private Integer amicaleid;
	public Short getWithrefund() {
		return withrefund;
	}
	public void setWithrefund(Short withrefund) {
		this.withrefund = withrefund;
	}
	public Short getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Short isdeleted) {
		this.isdeleted = isdeleted;
	}
	public Integer getProviderrootid() {
		return providerrootid;
	}
	public void setProviderrootid(Integer providerrootid) {
		this.providerrootid = providerrootid;
	}
	public Integer getProviderid() {
		return providerid;
	}
	public void setProviderid(Integer providerid) {
		this.providerid = providerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getGpslocation() {
		return gpslocation;
	}
	public void setGpslocation(String gpslocation) {
		this.gpslocation = gpslocation;
	}
	public String getRcs() {
		return rcs;
	}
	public void setRcs(String rcs) {
		this.rcs = rcs;
	}
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCalcul() {
		return calcul;
	}
	public void setCalcul(String calcul) {
		this.calcul = calcul;
	}
	public Integer getDeletedby() {
		return deletedby;
	}
	public void setDeletedby(Integer deletedby) {
		this.deletedby = deletedby;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public Date getDeleteddate() {
		return deleteddate;
	}
	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}
	public Integer getSectorid() {
		return sectorid;
	}
	public void setSectorid(Integer sectorid) {
		this.sectorid = sectorid;
	}
	public Date getStartingfrom() {
		return startingfrom;
	}
	public void setStartingfrom(Date startingfrom) {
		this.startingfrom = startingfrom;
	}
	public String getCuscode() {
		return cuscode;
	}
	public void setCuscode(String cuscode) {
		this.cuscode = cuscode;
	}
	public Integer getAmicaleid() {
		return amicaleid;
	}
	public void setAmicaleid(Integer amicaleid) {
		this.amicaleid = amicaleid;
	}
	public ProviderDto(Short withrefund, Short isdeleted, Integer providerrootid, Integer providerid, String name,
			String address, String email, String phone, String fax, String logo, String gpslocation, String rcs,
			String mf, String firstname, String lastname, String job, String mobile, String type, String calcul,
			Integer deletedby, Date addeddate, Date deleteddate, Integer sectorid, Date startingfrom, String cuscode,
			Integer amicaleid) {
		super();
		this.withrefund = withrefund;
		this.isdeleted = isdeleted;
		this.providerrootid = providerrootid;
		this.providerid = providerid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.fax = fax;
		this.logo = logo;
		this.gpslocation = gpslocation;
		this.rcs = rcs;
		this.mf = mf;
		this.firstname = firstname;
		this.lastname = lastname;
		this.job = job;
		this.mobile = mobile;
		this.type = type;
		this.calcul = calcul;
		this.deletedby = deletedby;
		this.addeddate = addeddate;
		this.deleteddate = deleteddate;
		this.sectorid = sectorid;
		this.startingfrom = startingfrom;
		this.cuscode = cuscode;
		this.amicaleid = amicaleid;
	}
	
}
