package com.cms.eplan.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.eplan.web.model.EngineType;
import com.cms.eplan.web.model.Product;
import com.cms.eplan.web.model.TransmissionType;;

/**
 * 
 * @author Babu 
 * Date : 20-01-2019
 *
 */
@Repository
@Transactional
public class TransmissionTypeDaoImpls implements TransmissionTypeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addTransmission(TransmissionType TransmissionType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TransmissionType> getId(int id) {
		Session session =sessionFactory.getCurrentSession();
		
		List<String> listQry= session.createQuery(" SELECT C.id FROM Rule D,TransmissionType C,Option B,Product A "+
										  " WHERE B.id=D.optionAId AND D.optionBId=C.id AND D.id=A.id AND B.id=:ids").setParameter("ids", id).getResultList();
		System.out.println("list of values in transmission ==>"+listQry.size());
		if(listQry.size() > 0){
			return (List<TransmissionType>)session.createQuery("from TransmissionType where id in (:ids)").setParameterList("ids",listQry).getResultList();
		}
		
		return null;
	}

}
