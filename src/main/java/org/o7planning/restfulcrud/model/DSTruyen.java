package org.o7planning.restfulcrud.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "dstruyen")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "DSTruyen")
public class DSTruyen {
	private String		TENTRUYEN, TENTACGIA, HINH, DeleteFlag;
	private int			MATRUYEN;
	private Set<CTTruyen> cttruyens = new HashSet<CTTruyen>(0);
 
	
	public DSTruyen() {
		
	}
	

	
	public DSTruyen(String tENTRUYEN, String tENTACGIA, String hINH, String deleteFlag, int mATRUYEN,
			Set<CTTruyen> cttruyens) {
		super();
		TENTRUYEN = tENTRUYEN;
		TENTACGIA = tENTACGIA;
		HINH = hINH;
		DeleteFlag = deleteFlag;
		MATRUYEN = mATRUYEN;
		this.cttruyens = cttruyens;
	}





	@Column(name = "TENTRUYEN")
	public String getTENTRUYEN() {
		return TENTRUYEN;
	}


	public void setTENTRUYEN(String tENTRUYEN) {
		TENTRUYEN = tENTRUYEN;
	}

	
	@Column(name = "TENTACGIA")
	public String getTENTACGIA() {
		return TENTACGIA;
	}


	public void setTENTACGIA(String tENTACGIA) {
		TENTACGIA = tENTACGIA;
	}

	
	@Column(name = "HINH")
	public String getHINH() {
		return HINH;
	}


	public void setHINH(String hINH) {
		HINH = hINH;
	}

	
	@Column(name = "DeleteFlag")
	public String getDeleteFlag() {
		return DeleteFlag;
	}


	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}

	@Id
	@Column(name = "MATRUYEN")
	public int getMATRUYEN() {
		return MATRUYEN;
	}



	public void setMATRUYEN(int mATRUYEN) {
		MATRUYEN = mATRUYEN;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dstruyen")
	public Set<CTTruyen> getCttruyens() {
		return cttruyens;
	}


	public void setCttruyens(Set<CTTruyen> cttruyens) {
		this.cttruyens = cttruyens;
	}
	
	
	

}
