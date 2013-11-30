package com.konchapp.domain;

import java.io.Serializable;
import java.util.Date;

public class SearchRequest implements Serializable{
	
	/*private String diameter;
	private String search_partyName;
	private String search_MillsCounts;
	private String search_fabric;
	private String search_rate;
	private String search_production;
	private String search_LengthLoop;
	private String search_programming;
	private String search_totalRun;*/
	//private String search_partyName;
	//private String search_partyName;
	
	private Integer diameter;
	private String search_partyName;
	private Double search_MillsCounts;
	private String search_fabric;
	private Double search_rate;
	private Double search_production;
	private Double search_LengthLoop;
	private Double search_programming;
	private Double search_totalRun;
	private Date search_date;
	private Double nightRun;
	private Double dayRun;
	
	
	public Integer getDiameter() {
		return diameter;
	}
	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}
	public String getSearch_partyName() {
		return search_partyName;
	}
	public void setSearch_partyName(String search_partyName) {
		this.search_partyName = search_partyName;
	}
	public Double getSearch_MillsCounts() {
		return search_MillsCounts;
	}
	public void setSearch_MillsCounts(Double search_MillsCounts) {
		this.search_MillsCounts = search_MillsCounts;
	}
	public String getSearch_fabric() {
		return search_fabric;
	}
	public void setSearch_fabric(String search_fabric) {
		this.search_fabric = search_fabric;
	}
	public Double getSearch_rate() {
		return search_rate;
	}
	public void setSearch_rate(Double search_rate) {
		this.search_rate = search_rate;
	}
	public Double getSearch_production() {
		return search_production;
	}
	public void setSearch_production(Double search_production) {
		this.search_production = search_production;
	}
	public Double getSearch_LengthLoop() {
		return search_LengthLoop;
	}
	public void setSearch_LengthLoop(Double search_LengthLoop) {
		this.search_LengthLoop = search_LengthLoop;
	}
	public Double getSearch_programming() {
		return search_programming;
	}
	public void setSearch_programming(Double search_programming) {
		this.search_programming = search_programming;
	}
	public Double getSearch_totalRun() {
		return search_totalRun;
	}
	public void setSearch_totalRun(Double search_totalRun) {
		this.search_totalRun = search_totalRun;
	}
	public Double getNightRun() {
		return nightRun;
	}
	public void setNightRun(Double nightRun) {
		this.nightRun = nightRun;
	}
	public Double getDayRun() {
		return dayRun;
	}
	public void setDayRun(Double dayRun) {
		this.dayRun = dayRun;
	}
	public Date getSearch_date() {
		return search_date;
	}
	public void setSearch_date(Date search_date) {
		this.search_date = search_date;
	}
	
	/*public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getSearch_partyName() {
		return search_partyName;
	}

	public void setSearch_partyName(String search_partyName) {
		this.search_partyName = search_partyName;
	}

	public String getSearch_MillsCounts() {
		return search_MillsCounts;
	}

	public void setSearch_MillsCounts(String search_MillsCounts) {
		this.search_MillsCounts = search_MillsCounts;
	}

	public String getSearch_fabric() {
		return search_fabric;
	}

	public void setSearch_fabric(String search_fabric) {
		this.search_fabric = search_fabric;
	}

	public String getSearch_rate() {
		return search_rate;
	}

	public void setSearch_rate(String search_rate) {
		this.search_rate = search_rate;
	}

	public String getSearch_production() {
		return search_production;
	}

	public void setSearch_production(String search_production) {
		this.search_production = search_production;
	}

	public String getSearch_LengthLoop() {
		return search_LengthLoop;
	}

	public void setSearch_LengthLoop(String search_LengthLoop) {
		this.search_LengthLoop = search_LengthLoop;
	}

	public String getSearch_programming() {
		return search_programming;
	}

	public void setSearch_programming(String search_programming) {
		this.search_programming = search_programming;
	}

	public String getSearch_totalRun() {
		return search_totalRun;
	}

	public void setSearch_totalRun(String search_totalRun) {
		this.search_totalRun = search_totalRun;
	}
	
	*/

}
