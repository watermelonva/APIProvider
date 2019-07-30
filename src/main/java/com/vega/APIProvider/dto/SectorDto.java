package com.vega.APIProvider.dto;



public class SectorDto {
	

    private Integer sectorid;
    private String frenchname;
    private String arabicname;
	public Integer getSectorid() {
		return sectorid;
	}
	public void setSectorid(Integer sectorid) {
		this.sectorid = sectorid;
	}
	public String getFrenchname() {
		return frenchname;
	}
	public void setFrenchname(String frenchname) {
		this.frenchname = frenchname;
	}
	public String getArabicname() {
		return arabicname;
	}
	public void setArabicname(String arabicname) {
		this.arabicname = arabicname;
	}
	public SectorDto(Integer sectorid, String frenchname, String arabicname) {
		super();
		this.sectorid = sectorid;
		this.frenchname = frenchname;
		this.arabicname = arabicname;
	}
    

}
