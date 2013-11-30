package com.konchapp.service;

import java.util.List;

import com.konchapp.domain.AddFormRequest;
import com.konchapp.domain.SearchRequest;
import com.konchapp.exception.KonchException;
import com.konchapp.model.ProductionRun;

public interface ProductionRunService {
	
	public ProductionRun createProductionRun();
	
	/**
	 * Add ProductionRun
	 * 
	 * @param  ProductionRun prodRun
	 */
	public ProductionRun saveProductionRun(ProductionRun prodRun) throws KonchException;
		
	/**
	 * Delete ProductionRun
	 * 
	 * @param  ProductionRun prodRun
	 */
	public void deleteProductionRun(ProductionRun prodRun) throws KonchException;
	
	/**
	 * Get ProductionRun
	 * 
	 * @param  int ProductionRun Id
	 */
	public ProductionRun getProdRunById(int id) throws KonchException;
	
	/**
	 * Get ProductionRun List
	 * 
	 * @return List - ProductionRun list
	 */
	public List<ProductionRun> getProdRuns(SearchRequest searchRequest) throws KonchException;
	
	/**
	 * Get User Verification 
	 * 
	 * @return List - String
	 */
	public String getUserVerify();
	
	
	

}
