/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.Facades;

import com.orfi.entity.AuditoriaJoya;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sergio
 */
@Stateless
public class AuditoriaJoyaFacade extends AbstractFacade<AuditoriaJoya> {

    @PersistenceContext(unitName = "RepairedOrfiPlusPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditoriaJoyaFacade() {
        super(AuditoriaJoya.class);
    }
    
}
