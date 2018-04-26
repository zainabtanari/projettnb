/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author admin
 */
@Entity
public class TaxeTnb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Terrain terain;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datePresentation;
    private int annee;
    private Double mtBase;
    private double mtRetardPremierMois;
    private double mtRetardAutrMois;
    private double mtTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Terrain getTerain() {
        if(terain==null){
            terain=new Terrain();
        }
        return terain;
    }

    public void setTerain(Terrain terain) {
        this.terain = terain;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Double getMtBase() {
        return mtBase;
    }

    public void setMtBase(Double mtBase) {
        this.mtBase = mtBase;
    }

    public double getMtRetardPremierMois() {
        return mtRetardPremierMois;
    }

    public void setMtRetardPremierMois(double mtRetardPremierMois) {
        this.mtRetardPremierMois = mtRetardPremierMois;
    }

    public double getMtRetardAutrMois() {
        return mtRetardAutrMois;
    }

    public void setMtRetardAutrMois(double mtRetardAutrMois) {
        this.mtRetardAutrMois = mtRetardAutrMois;
    }

    public double getMtTotal() {
        return mtTotal;
    }

    public void setMtTotal(double mtTotal) {
        this.mtTotal = mtTotal;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxeTnb)) {
            return false;
        }
        TaxeTnb other = (TaxeTnb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.TaxeTnb[ id=" + id + " ]";
    }
    
}
