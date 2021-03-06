/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.entidade;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "item_ncm")
public class ItemNcm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn
    private AjusteNcm ajusteNcm;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Produto plantio;

    public AjusteNcm getAjusteNcm() {
        return ajusteNcm;
    }

    public void setAjusteNcm(AjusteNcm ajusteNcm) {
        this.ajusteNcm = ajusteNcm;
    }

    public Produto getPlantio() {
        return plantio;
    }

    public void setPlantio(Produto plantio) {
        this.plantio = plantio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plantio != null ? plantio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemNcm)) {
            return false;
        }
        ItemNcm other = (ItemNcm) object;
        if ((this.plantio == null && other.plantio != null)
                || (this.plantio != null && !this.plantio.equals(other.plantio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
