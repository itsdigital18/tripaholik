package com.konchapp.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.webflow.core.collection.MutableAttributeMap;
import org.springframework.webflow.execution.RequestContextHolder;

import com.konchapp.dao.ProductionRunDAO;
import com.konchapp.domain.AddFormRequest;
import com.konchapp.domain.SearchRequest;
import com.konchapp.exception.KonchException;
import com.konchapp.model.ProductionRun;

@Service("prodRunService")
@Repository
@Transactional(readOnly = true)
public class ProductionRunServiceImpl implements ProductionRunService {
	
	ProductionRunDAO prodRunDAO;	
	
	public ProductionRun createProductionRun() {
        return new ProductionRun();
    }
	
	@Transactional(readOnly = false)
	@Override
	public ProductionRun saveProductionRun(ProductionRun prodRun) throws KonchException {
		prodRun = getProdRunDAO().saveProductionRun(prodRun);
		System.out.println("ID in Server >> " + prodRun.getProdRunId());
		return prodRun;
	}	
	
	@Transactional(readOnly = false)
	@Override
	public void deleteProductionRun(ProductionRun prodRun) throws KonchException{
		getProdRunDAO().deleteProductionRun(prodRun);
	}
	
	@Override
	public ProductionRun getProdRunById(int id) throws KonchException{		
		return getProdRunDAO().getProdRunById(id);
	}
	
	@Override
	public List<ProductionRun> getProdRuns(SearchRequest searchRequest) throws KonchException{
		System.out.println("searchRequest:"+searchRequest.getDiameter());
		try{//getProdRunDAO().getProdRuns(searchRequest);
			List<ProductionRun> prodList= getProdRunDAO().getProdRuns(searchRequest);
			if(prodList!=null && !prodList.isEmpty()){
				return getProdRunDAO().getProdRuns(searchRequest);
			}else{
				//throw new KonchException("Empty List");
				addContextMessage("", "Empty List");
			}
		}catch(KonchException exe){
			System.out.println("trowing");
			throw new KonchException("Empty List",exe);
		}
		return null;
	}

	/**
	 * @return the prodRunDAO
	 */
	public ProductionRunDAO getProdRunDAO() {
		return prodRunDAO;
	}

	/**
	 * @param prodRunDAO the prodRunDAO to set
	 */
	public void setProdRunDAO(ProductionRunDAO prodRunDAO) {
		this.prodRunDAO = prodRunDAO;
	}
	
	protected void setObjectInScope(String objectName, Object obj) {
		MutableAttributeMap flowScope = RequestContextHolder
				.getRequestContext().getFlowScope();
		flowScope.put(objectName, obj);
	}

	@Override
	public String getUserVerify() {
		// TODO Auto-generated method stub
		System.out.println("User Verified");
		return "success";
	}

	public String resetSearchValue() {
		System.out.println("Resetting Beans");
		MutableAttributeMap flowScope = RequestContextHolder
				.getRequestContext().getFlowScope();
		flowScope.put("searchRequest",
				new SearchRequest());
		return "success";
	}
	
	/*public boolean formvalidation (AddFormRequest addform){
		System.out.println("validate");
        if(addform.getDiameter() ==null && (addform.getSearch_partyName()==null || addform.getSearch_partyName().isEmpty())&& addform.getSearch_date()==null ){
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please Enter Any One InputField", "Validation Error"));
        return false;
        }

        else{


        }
        return false;

 }*/
	
	public static void addContextMessage(String fieldName, String errorProperty) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(errorProperty);
		context.addMessage(fieldName, message);
		return;
	}
}
