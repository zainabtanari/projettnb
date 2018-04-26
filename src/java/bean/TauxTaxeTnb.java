/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author admin
 */
@Entity
public class TauxTaxeTnb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Categorie categorie;
    private int metrreCarre;
    private Double mtTaxe;
    private Double pourcentageRetardPremierMois;
    private Double pourcentageRetardAutreMois;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        if(categorie==null){
            categorie=new Categorie();
        }
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public int getMetrreCarre() {
        return metrreCarre;
    }

    public void setMetrreCarre(int metrreCarre) {
        this.metrreCarre = metrreCarre;
    }

    public Double getMtTaxe() {
        return mtTaxe;
    }

    public void setMtTaxe(Double mtTaxe) {
        this.mtTaxe = mtTaxe;
    }

    public Double getPourcentageRetardPremierMois() {
        return pourcentageRetardPremierMois;
    }

    public void setPourcentageRetardPremierMois(Double pourcentageRetardPremierMois) {
        this.pourcentageRetardPremierMois = pourcentageRetardPremierMois;
    }

    public Double getPourcentageRetardAutreMois() {
        return pourcentageRetardAutreMois;
    }

    public void setPourcentageRetardAutreMois(Double pourcentageRetardAutreMois) {
        this.pourcentageRetardAutreMois = pourcentageRetardAutreMois;
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
        if (!(object instanceof TauxTaxeTnb)) {
            return false;
        }
        TauxTaxeTnb other = (TauxTaxeTnb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.TauxTaxeTnb[ id=" + id + " ]";
    }
    
}
