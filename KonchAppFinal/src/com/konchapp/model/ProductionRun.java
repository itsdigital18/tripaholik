package com.konchapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_prod_run")
public class ProductionRun implements Serializable{
	
	@Id
	@Column(name="prod_run_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prodRunId;
	
	@Column(name="diameter", unique = true, nullable = false)
	private Integer diameter;
	
	@Column(name="partyName", unique = true, nullable = false)
	private String partyName;
	
	@Column(name="millAndCounts", unique = true, nullable = false)
	private Double millAndCounts;
	
	@Column(name="fabric", unique = true, nullable = false)
	private String fabric;
	
	@Column(name="lengthAndLoop", unique = true, nullable = false)
	private Double lengthAndLoop;
	
	@Column(name="rate", unique = true, nullable = false)
	private Double rate;
	
	@Column(name="programming", unique = true, nullable = false)
	private Double programming;
	
	@Column(name="dayRun", unique = true, nullable = true)
	private Double dayRun;
	
	@Column(name="nightRun", unique = true, nullable = true)
	private Double nightRun;

	@Column(name="totalProduction", unique = true, nullable = true)
	private Double totalRun;
	
	@Column(name="todayRun", unique = true, nullable = true)
	private Double todayRun;
	
	@Column(name="yesterdayRun", unique = true, nullable = true)
	private Double yesterdayRun;
	
	@Column(name="dateOfProduction", unique = true, nullable = false)
	private Date dateOfProduction;
	
	@Column(name="balance", unique = true, nullable = true)
	private Double balance;
	
	@Column(name="flag", unique = true, nullable = false)
	private String flag;
	
	
	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public Double getMillAndCounts() {
		return millAndCounts;
	}

	public void setMillAndCounts(Double millAndCounts) {
		this.millAndCounts = millAndCounts;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public Double getLengthAndLoop() {
		return lengthAndLoop;
	}

	public void setLengthAndLoop(Double lengthAndLoop) {
		this.lengthAndLoop = lengthAndLoop;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getProgramming() {
		return programming;
	}

	public void setProgramming(Double programming) {
		this.programming = programming;
	}

	public Double getDayRun() {
		return dayRun;
	}

	public void setDayRun(Double dayRun) {
		this.dayRun = dayRun;
	}

	public Double getNightRun() {
		return nightRun;
	}

	public void setNightRun(Double nightRun) {
		this.nightRun = nightRun;
	}

	public Integer getProdRunId() {
		return prodRunId;
	}

	public void setProdRunId(Integer prodRunId) {
		this.prodRunId = prodRunId;
	}

	public Double getTotalRun() {
		return totalRun;
	}

	public void setTotalRun(Double totalRun) {
		this.totalRun = totalRun;
	}

	public Double getTodayRun() {
		return todayRun;
	}

	public void setTodayRun(Double todayRun) {
		this.todayRun = todayRun;
	}

	public Double getYesterdayRun() {
		return yesterdayRun;
	}

	public void setYesterdayRun(Double yesterdayRun) {
		this.yesterdayRun = yesterdayRun;
	}

	public Date getDateOfProduction() {
		return dateOfProduction;
	}

	public void setDateOfProduction(Date dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}	

}
