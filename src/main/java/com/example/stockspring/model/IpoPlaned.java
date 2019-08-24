package com.example.stockspring.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="ipo_planned")
	public class IpoPlaned {

		@Id
		@Column(name="id")
		private int id;
		
		@Column(name="Company_code")
		private int companyCode;
		
		@Column(name="Stock_exchange")
		private int stockExchange;
		
		@Column(name="price_per_share")
		private double pricePerShare;
		
		@Column(name="total_no_of_shares")
		private int totalShare;
		
		@Column(name="open_date_time")
		private Date openDateTime;
		
		@Column(name="remarks")
		private String remarks;

		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCompanyCode() {
			return companyCode;
		}
		public void setCompanyCode(int companyCode) {
			this.companyCode = companyCode;
		}
		public int getStockExchange() {
			return stockExchange;
		}
		public void setStockExchange(int stockExchange) {
			this.stockExchange = stockExchange;
		}
		public double getPricePerShare() {
			return pricePerShare;
		}
		public void setPricePerShare(double pricePerShare) {
			this.pricePerShare = pricePerShare;
		}
		public int getTotalShare() {
			return totalShare;
		}
		public void setTotalShare(int totalShare) {
			this.totalShare = totalShare;
		}
		public Date getOpenDateTime() {
			return openDateTime;
		}
		public void setOpenDateTime(Date openDateTime) {
			this.openDateTime = openDateTime;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public IpoPlaned(int id, int companyCode, int stockExchange, double pricePerShare, int totalShare,
				Date openDateTime, String remarks) {
			super();
			this.id = id;
			this.companyCode = companyCode;
			this.stockExchange = stockExchange;
			this.pricePerShare = pricePerShare;
			this.totalShare = totalShare;
			this.openDateTime = openDateTime;
			this.remarks = remarks;
		}

	}
