/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.ejb;

import br.com.curso.entidade.Servico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class ServicoFacade extends AbstractFacade<Servico> {
    @PersistenceContext(unitName = "novadelliPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicoFacade() {
        super(Servico.class);
    }
    
}
