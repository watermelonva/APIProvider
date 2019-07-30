package com.vega.APIProvider.dto;

import java.util.Date;


public class ConventionDto {

	private Integer convetionid;

	private String titleconvention;

	private String description;
	private String phoneresponsible;

	private Short type;
	private String detailconv;
	private Date startdate;
	private Date enddate;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation

	private Double totalprice;

	private Double advanceamount;

	private Double minamountmonths;

	private Integer maxmonthes;
	private Double amountconvention;
	private Date createdate;

	private Integer duration;

	private Integer nbrperson;

	private Integer nbrfamily;

	private Short isdeleted;
	private Short valid;

	private Short withcommitment;

	private Short paySlip;

	private Boolean cessiondocument;

	private Integer providerid;

	private Integer needconventionid;

	private Integer createdby;

	private Short viewlevel;

	private Integer amicaleid;

	private Integer deletedby;
	private Date deleteddate;
	private Short withoutcommand;
	private String conventionfile;
	private String poster;
	private String communication;

	private Boolean listing;
	private Boolean providerlisting;

	private Integer validateBtnParticipate;

	private Integer validateBtnPayment;

	private int available;

	private Integer validatebtnPaymentWithoutPreservation;

	private String endDateNull;

	private int withOffer;
	private String logo;

	private Boolean hided;

	private Short avecvalidation;

	public Integer getConvetionid() {
		return convetionid;
	}

	public void setConvetionid(Integer convetionid) {
		this.convetionid = convetionid;
	}

	public String getTitleconvention() {
		return titleconvention;
	}

	public void setTitleconvention(String titleconvention) {
		this.titleconvention = titleconvention;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneresponsible() {
		return phoneresponsible;
	}

	public void setPhoneresponsible(String phoneresponsible) {
		this.phoneresponsible = phoneresponsible;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getDetailconv() {
		return detailconv;
	}

	public void setDetailconv(String detailconv) {
		this.detailconv = detailconv;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public Double getAdvanceamount() {
		return advanceamount;
	}

	public void setAdvanceamount(Double advanceamount) {
		this.advanceamount = advanceamount;
	}

	public Double getMinamountmonths() {
		return minamountmonths;
	}

	public void setMinamountmonths(Double minamountmonths) {
		this.minamountmonths = minamountmonths;
	}

	public Integer getMaxmonthes() {
		return maxmonthes;
	}

	public void setMaxmonthes(Integer maxmonthes) {
		this.maxmonthes = maxmonthes;
	}

	public Double getAmountconvention() {
		return amountconvention;
	}

	public void setAmountconvention(Double amountconvention) {
		this.amountconvention = amountconvention;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getNbrperson() {
		return nbrperson;
	}

	public void setNbrperson(Integer nbrperson) {
		this.nbrperson = nbrperson;
	}

	public Integer getNbrfamily() {
		return nbrfamily;
	}

	public void setNbrfamily(Integer nbrfamily) {
		this.nbrfamily = nbrfamily;
	}

	public Short getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(Short isdeleted) {
		this.isdeleted = isdeleted;
	}

	public Short getValid() {
		return valid;
	}

	public void setValid(Short valid) {
		this.valid = valid;
	}

	public Short getWithcommitment() {
		return withcommitment;
	}

	public void setWithcommitment(Short withcommitment) {
		this.withcommitment = withcommitment;
	}

	public Short getPaySlip() {
		return paySlip;
	}

	public void setPaySlip(Short paySlip) {
		this.paySlip = paySlip;
	}

	public Boolean getCessiondocument() {
		return cessiondocument;
	}

	public void setCessiondocument(Boolean cessiondocument) {
		this.cessiondocument = cessiondocument;
	}

	public Integer getProviderid() {
		return providerid;
	}

	public void setProviderid(Integer providerid) {
		this.providerid = providerid;
	}

	public Integer getNeedconventionid() {
		return needconventionid;
	}

	public void setNeedconventionid(Integer needconventionid) {
		this.needconventionid = needconventionid;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public Short getViewlevel() {
		return viewlevel;
	}

	public void setViewlevel(Short viewlevel) {
		this.viewlevel = viewlevel;
	}

	public Integer getAmicaleid() {
		return amicaleid;
	}

	public void setAmicaleid(Integer amicaleid) {
		this.amicaleid = amicaleid;
	}

	public Integer getDeletedby() {
		return deletedby;
	}

	public void setDeletedby(Integer deletedby) {
		this.deletedby = deletedby;
	}

	public Date getDeleteddate() {
		return deleteddate;
	}

	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}

	public Short getWithoutcommand() {
		return withoutcommand;
	}

	public void setWithoutcommand(Short withoutcommand) {
		this.withoutcommand = withoutcommand;
	}

	public String getConventionfile() {
		return conventionfile;
	}

	public void setConventionfile(String conventionfile) {
		this.conventionfile = conventionfile;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
	}

	public Boolean getListing() {
		return listing;
	}

	public void setListing(Boolean listing) {
		this.listing = listing;
	}

	public Boolean getProviderlisting() {
		return providerlisting;
	}

	public void setProviderlisting(Boolean providerlisting) {
		this.providerlisting = providerlisting;
	}

	public Integer getValidateBtnParticipate() {
		return validateBtnParticipate;
	}

	public void setValidateBtnParticipate(Integer validateBtnParticipate) {
		this.validateBtnParticipate = validateBtnParticipate;
	}

	public Integer getValidateBtnPayment() {
		return validateBtnPayment;
	}

	public void setValidateBtnPayment(Integer validateBtnPayment) {
		this.validateBtnPayment = validateBtnPayment;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Integer getValidatebtnPaymentWithoutPreservation() {
		return validatebtnPaymentWithoutPreservation;
	}

	public void setValidatebtnPaymentWithoutPreservation(Integer validatebtnPaymentWithoutPreservation) {
		this.validatebtnPaymentWithoutPreservation = validatebtnPaymentWithoutPreservation;
	}

	public String getEndDateNull() {
		return endDateNull;
	}

	public void setEndDateNull(String endDateNull) {
		this.endDateNull = endDateNull;
	}

	public int getWithOffer() {
		return withOffer;
	}

	public void setWithOffer(int withOffer) {
		this.withOffer = withOffer;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Boolean getHided() {
		return hided;
	}

	public void setHided(Boolean hided) {
		this.hided = hided;
	}

	public Short getAvecvalidation() {
		return avecvalidation;
	}

	public void setAvecvalidation(Short avecvalidation) {
		this.avecvalidation = avecvalidation;
	}

	public ConventionDto(Integer convetionid, String titleconvention, String description, String phoneresponsible,
			Short type, String detailconv, Date startdate, Date enddate, Double totalprice, Double advanceamount,
			Double minamountmonths, Integer maxmonthes, Double amountconvention, Date createdate, Integer duration,
			Integer nbrperson, Integer nbrfamily, Short isdeleted, Short valid, Short withcommitment, Short paySlip,
			Boolean cessiondocument, Integer providerid, Integer needconventionid, Integer createdby, Short viewlevel,
			Integer amicaleid, Integer deletedby, Date deleteddate, Short withoutcommand, String conventionfile,
			String poster, String communication, Boolean listing, Boolean providerlisting,
			Integer validateBtnParticipate, Integer validateBtnPayment, int available,
			Integer validatebtnPaymentWithoutPreservation, String endDateNull, int withOffer, String logo,
			Boolean hided, Short avecvalidation) {
		super();
		this.convetionid = convetionid;
		this.titleconvention = titleconvention;
		this.description = description;
		this.phoneresponsible = phoneresponsible;
		this.type = type;
		this.detailconv = detailconv;
		this.startdate = startdate;
		this.enddate = enddate;
		this.totalprice = totalprice;
		this.advanceamount = advanceamount;
		this.minamountmonths = minamountmonths;
		this.maxmonthes = maxmonthes;
		this.amountconvention = amountconvention;
		this.createdate = createdate;
		this.duration = duration;
		this.nbrperson = nbrperson;
		this.nbrfamily = nbrfamily;
		this.isdeleted = isdeleted;
		this.valid = valid;
		this.withcommitment = withcommitment;
		this.paySlip = paySlip;
		this.cessiondocument = cessiondocument;
		this.providerid = providerid;
		this.needconventionid = needconventionid;
		this.createdby = createdby;
		this.viewlevel = viewlevel;
		this.amicaleid = amicaleid;
		this.deletedby = deletedby;
		this.deleteddate = deleteddate;
		this.withoutcommand = withoutcommand;
		this.conventionfile = conventionfile;
		this.poster = poster;
		this.communication = communication;
		this.listing = listing;
		this.providerlisting = providerlisting;
		this.validateBtnParticipate = validateBtnParticipate;
		this.validateBtnPayment = validateBtnPayment;
		this.available = available;
		this.validatebtnPaymentWithoutPreservation = validatebtnPaymentWithoutPreservation;
		this.endDateNull = endDateNull;
		this.withOffer = withOffer;
		this.logo = logo;
		this.hided = hided;
		this.avecvalidation = avecvalidation;
	}

}
