/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sti.bootcamp.dao.impl;

import com.sti.bootcamp.dao.MahasiswaDao;
import com.sti.bootcamp.dao.repository.MahasiswaRepository;
import com.sti.bootcamp.model.Mahasiswa;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author techinasia888
 */
public class MahasiswaDaoImpl extends BaseImpl implements MahasiswaDao {
    
    @Autowired
	private MahasiswaRepository repository;

    @Override
    public Mahasiswa save(Mahasiswa mahasiswa) throws Exception {
        return repository.save(mahasiswa);
    }

    @Override
    public void delete(Mahasiswa mahasiswa) throws Exception {
       	repository.delete(mahasiswa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mahasiswa> getList() throws Exception {
     CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Mahasiswa> query = critB.createQuery(Mahasiswa.class);
		Root<Mahasiswa> root = query.from(Mahasiswa.class);
		
		TypedQuery<Mahasiswa> q = em.createQuery(query);
		return q.getResultList();
	}

    @Override
    public Mahasiswa getById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
