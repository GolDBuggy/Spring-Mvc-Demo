package com.spring.mymvcdemo.dao;

import com.spring.mymvcdemo.entity.Yazi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class YaziDAOimpl implements YaziDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void kaydet(Yazi yazi) {
        Session session=sessionFactory.getCurrentSession();
        session.save(yazi);
    }
}
