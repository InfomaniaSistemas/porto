/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.ejb;

import br.com.curso.entidade.UnidadeMedida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class UnidadeMedidaFacade extends AbstractFacade<UnidadeMedida> {
    @PersistenceContext(unitName = "novadelliPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadeMedidaFacade() {
        super(UnidadeMedida.class);
    }
    
}
