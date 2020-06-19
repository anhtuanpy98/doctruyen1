package org.o7planning.restfulcrud.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "cttruyens")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "CTTruyen")
public class CTTruyen {
	@Id
	@GeneratedValue
	@Column(name = "MACT")
	private	int		MACT;
	
	@GeneratedValue
	@Column(name = "MACHUONG")
	private	int		MACHUONG;
	
	@Column(name = "TENCHUONG")
	private String	TENCHUONG;
	
	@Column(name = "NOIDUNG")
	private String	NOIDUNG;
	
	@Column(name = "DeleteFlag")
	private String	DeleteFlag;
	
	@ManyToOne
	@JoinColumn(name = "MATRUYEN")
	private DSTruyen dstruyen;
	
	public CTTruyen() {
		
	}
	
	
	

	public CTTruyen(int mACT, int mACHUONG, String tENCHUONG, String nOIDUNG, String deleteFlag, DSTruyen dstruyen) {
		super();
		MACT = mACT;
		MACHUONG = mACHUONG;
		TENCHUONG = tENCHUONG;
		NOIDUNG = nOIDUNG;
		DeleteFlag = deleteFlag;
		this.dstruyen = dstruyen;
	}




	public int getMACT() {
		return MACT;
	}

	public void setMACT(int mACT) {
		MACT = mACT;
	}


	public int getMACHUONG() {
		return MACHUONG;
	}

	public void setMACHUONG(int mACHUONG) {
		MACHUONG = mACHUONG;
	}
	

	public String getTENCHUONG() {
		return TENCHUONG;
	}

	
	public void setTENCHUONG(String tENCHUONG) {
		TENCHUONG = tENCHUONG;
	}

	public String getNOIDUNG() {
		return NOIDUNG;
	}

	public void setNOIDUNG(String nOIDUNG) {
		NOIDUNG = nOIDUNG;
	}

	
	public String getDeleteFlag() {
		return DeleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}




	public DSTruyen getDstruyen() {
		return dstruyen;
	}




	public void setDstruyen(DSTruyen dstruyen) {
		this.dstruyen = dstruyen;
	}
	
	

}
