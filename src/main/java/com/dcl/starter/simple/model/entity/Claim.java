package com.dcl.starter.simple.model.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Claim [dcn=" + dcn + ", corpId=" + corpId + ", taxId=" + taxId + ", pFin=" + pFin + "]";
	}

	String dcn;
	String corpId;
	String taxId;
	String pFin;

	public Claim() {
		super();
	}

	public Claim(String dcn, String corpId, String taxId, String pFin) {
		super();
		this.dcn = dcn;
		this.corpId = corpId;
		this.taxId = taxId;
		this.pFin = pFin;
	}

	public String getDcn() {
		return dcn;
	}

	public void setDcn(String dcn) {
		this.dcn = dcn;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getpFin() {
		return pFin;
	}

	public void setpFin(String pFin) {
		this.pFin = pFin;
	}

}
