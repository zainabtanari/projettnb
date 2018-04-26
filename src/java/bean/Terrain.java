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
public class Terrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double metreCarre; 
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Rue rue;
    @ManyToOne
    private Categorie categorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMetreCarre() {
        return metreCarre;
    }

    public void setMetreCarre(Double metreCarre) {
        this.metreCarre = metreCarre;
    }

    public Redevable getRedevable() {
        if(redevable==null){
            redevable=new Redevable();
        }
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Rue getRue() {
        if(rue ==null){
            rue=new Rue();
                    
        }
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
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
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terrain)) {
            return false;
        }
        Terrain other = (Terrain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Terrain[ id=" + id + " ]";
    }
    
}
