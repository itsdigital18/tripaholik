package com.konchapp.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.webflow.core.collection.MutableAttributeMap;
import org.springframework.webflow.execution.RequestContextHolder;

import com.konchapp.domain.AddFormRequest;
import com.konchapp.domain.SearchRequest;
import com.konchapp.exception.KonchException;
import com.konchapp.model.ProductionRun;

public class ProductionRunDAOImpl implements ProductionRunDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	/**
	 * Add ProductionRun
	 * 
	 * @param  ProductionRun prodRun
	 */	
	@Override
	public ProductionRun saveProductionRun(ProductionRun prodRun) throws KonchException{
		Session session1= getSessionFactory().getCurrentSession();
		session1.beginTransaction();
		session1.saveOrUpdate(prodRun);
		session1.getTransaction().commit();		
		return prodRun;
	}	
	
	/**
	 * Delete ProductionRun
	 * 
	 * @param  ProductionRun prodRun
	 */
	@Override
	public void deleteProductionRun(ProductionRun prodRun) throws KonchException{
		getSessionFactory().getCurrentSession().delete(prodRun);
	}	
	
	/**
	 * Get ProductionRun
	 * 
	 * @param  int prodRunId
	 * @return ProductionRun 
	 */
	@Override
	public ProductionRun getProdRunById(int prodRunId) throws KonchException{
		System.out.println("Prod Run  Id >>> " + prodRunId);		
		Session session = getSessionFactory().getCurrentSession();		
		session.beginTransaction();
		Query query = session.createQuery("from ProductionRun where prodRunId=?");
		query.setParameter(0, prodRunId);
		List list = query.list();
		session.getTransaction().commit();
		return (ProductionRun)list.get(0);
		
	}	
	
	/**
	 * Get ProductionRun List
	 * 
	 * @return List - ProductionRun list
	 */	
	@Override
	public List<ProductionRun> getProdRuns(SearchRequest searchRequest) throws KonchException{		
		
		int diameter=searchRequest.getDiameter();
		String party=searchRequest.getSearch_partyName();
		Date date=searchRequest.getSearch_date();			
		String sql = "from ProductionRun where 1=1";
		if(diameter > 0){
			sql += "and diameter=?";
		}		
		if(date != null){
			sql += "and dateofProduction=?";
		}		
		if(party != null && !party.isEmpty()){
			sql += "and partyName like :partyId";
		}		
		Session session = getSessionFactory().getCurrentSession();		
		session.beginTransaction();
		Query query = session.createQuery(sql);		
		if(diameter > 0){
			query.setParameter(0, diameter);
			if(date != null){
				query.setParameter(1, date);
				if(party!=null && !party.isEmpty()){
					query.setParameter("partyId", "%"+party+"%");
				}
			}else if(party!=null && !party.isEmpty()){
				query.setParameter("partyId", "%"+party+"%");
			}
		}else if(date != null){
			query.setParameter(0, date);
			if(party!=null && !party.isEmpty()){
				query.setParameter("partyId", "%"+party+"%");
			}
		}else if(party!=null && !party.isEmpty()){
			query.setParameter("partyId", "%"+party+"%");
		}		
		List prodRuns=query.list();		
		session.getTransaction().commit();
		return prodRuns;
		
	}

	public static String resetSearchValue() {
		System.out.println("Resetting Beans");
		MutableAttributeMap flowScope = RequestContextHolder
				.getRequestContext().getFlowScope();
		flowScope.put("searchRequest",
				new SearchRequest());
		return "success";
	}
}
