package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sectors")
public class Sector {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="sector_id")
	 private int sectorId;
	 
	 @Column(name="sector_name")
	 private String sectorName;
	 
	 @Column(name="brief")
	 private String brief;
	 
	public int getSectorId() {
		return sectorId;
	}
	
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	@Override
	public String toString() {
		return "Sector [id=" + sectorId + ", name=" + sectorName + ", brief=" + brief + "]";
	}
	public Sector(int sectorId, String sectorName, String brief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.brief = brief;
	}
	public Sector(){
		
	}
 
}
