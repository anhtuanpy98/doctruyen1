package org.o7planning.restfulcrud.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "dstruyen1")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "DSTruyen")
public class DSTruyen {
	@Column(name = "TENTRUYEN")
	private String		TENTRUYEN;
	
	@Column(name = "TENTACGIA")
	private String TENTACGIA;
	
	@Column(name = "HINH")
	private String HINH;
	
	@Column(name = "DeleteFlag")
	private String DeleteFlag;
	
	@Id
	@GeneratedValue
	@Column(name = "MATRUYEN")
	private Integer		MATRUYEN;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "dstruyen")
	//private Collection<CTTruyen> cttruyens;
 

	public DSTruyen() {
		
	}
	
	



	public DSTruyen(String tENTRUYEN, String tENTACGIA, String hINH, String deleteFlag, Integer mATRUYEN) {//,
			//Collection<CTTruyen> cttruyens) {
		super();
		TENTRUYEN = tENTRUYEN;
		TENTACGIA = tENTACGIA;
		HINH = hINH;
		DeleteFlag = deleteFlag;
		MATRUYEN = mATRUYEN;
		//this.cttruyens = cttruyens;
	}





	public Integer getMATRUYEN() {
		return MATRUYEN;
	}


	public void setMATRUYEN(Integer mATRUYEN) {
		MATRUYEN = mATRUYEN;
	}


	public String getTENTRUYEN() {
		return TENTRUYEN;
	}


	public void setTENTRUYEN(String tENTRUYEN) {
		TENTRUYEN = tENTRUYEN;
	}

	
	
	public String getTENTACGIA() {
		return TENTACGIA;
	}


	public void setTENTACGIA(String tENTACGIA) {
		TENTACGIA = tENTACGIA;
	}

	
	
	public String getHINH() {
		return HINH;
	}


	public void setHINH(String hINH) {
		HINH = hINH;
	}

	

	public String getDeleteFlag() {
		return DeleteFlag;
	}


	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}


}
