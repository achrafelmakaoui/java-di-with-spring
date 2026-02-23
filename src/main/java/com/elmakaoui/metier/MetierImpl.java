package com.elmakaoui.metier;

import com.elmakaoui.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // Couplage faible

    /*
     * Injection dans l'attribut dao
     * Un objet d'une classe qui implémente l'interface IDO
     * Au moment de l'instanciation
     */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
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
