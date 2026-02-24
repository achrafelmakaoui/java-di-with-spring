package com.elmakaoui.ext;

import com.elmakaoui.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs...");
        double t = 12;
        return t;
    }
}
