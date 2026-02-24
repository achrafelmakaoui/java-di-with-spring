package com.elmakaoui.metier;

import com.elmakaoui.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    private IDao dao; // Couplage faible

    /*
     * Injection dans l'attribut dao
     * Un objet d'une classe qui implémente l'interface IDO
     * Au moment de l'instanciation
     */

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }



    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }

    /*
    * Injection dans l'attribut dao
    * Un objet d'une classe qui implémente l'interface IDO
    * Aprés instanciation
    */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
