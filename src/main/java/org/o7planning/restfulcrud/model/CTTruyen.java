package org.o7planning.restfulcrud.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "cttruyen")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "CTTruyen")
public class CTTruyen {
	private	String		MACT, MACHUONG;
	private String	TENCHUONG, NOIDUNG, DeleteFlag;
	private DSTruyen dstruyen;

	public CTTruyen() {
		
	}

	

	public CTTruyen(String mACT, String mATRUYEN, String mACHUONG, String tENCHUONG, String nOIDUNG, String deleteFlag,
			DSTruyen dstruyen) {
		super();
		MACT = mACT;
		
		MACHUONG = mACHUONG;
		TENCHUONG = tENCHUONG;
		NOIDUNG = nOIDUNG;
		DeleteFlag = deleteFlag;
		this.dstruyen = dstruyen;
	}



	@Id
	@Column(name = "MACT")
	public String getMACT() {
		return MACT;
	}

	public void setMACT(String mACT) {
		MACT = mACT;
	}


	@Column(name = "MACHUONG")
	public String getMACHUONG() {
		return MACHUONG;
	}

	public void setMACHUONG(String mACHUONG) {
		MACHUONG = mACHUONG;
	}

	@Column(name = "TENCHUONG")
	public String getTENCHUONG() {
		return TENCHUONG;
	}

	public void setTENCHUONG(String tENCHUONG) {
		TENCHUONG = tENCHUONG;
	}

	@Column(name = "NOIDUNG")
	public String getNOIDUNG() {
		return NOIDUNG;
	}

	public void setNOIDUNG(String nOIDUNG) {
		NOIDUNG = nOIDUNG;
	}

	@Column(name = "DeleteFlag")
	public String getDeleteFlag() {
		return DeleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATRUYEN", nullable = false)
	public DSTruyen getDstruyen() {
		return dstruyen;
	}



	public void setDstruyen(DSTruyen dstruyen) {
		this.dstruyen = dstruyen;
	}
	

	

}
