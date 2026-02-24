package com.elmakaoui.pres;

import com.elmakaoui.ext.DaoImplV2;
import com.elmakaoui.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); // Injection de dependence via le setter
        System.out.println("Res= " + metier.calcul());
    }
}
