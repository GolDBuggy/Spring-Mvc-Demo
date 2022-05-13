package com.spring.mymvcdemo.dao;

import com.spring.mymvcdemo.entity.Uye;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Repository
public class UyeDAOimpl implements UyeDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Uye> uyeler() {
        Session session=sessionFactory.getCurrentSession();

        Query<Uye> query=session.createQuery("from Uye",Uye.class);

        List<Uye> uyeler=query.getResultList();

        return uyeler;
    }

    @Override
    public void kaydet(Uye uye) {
        Session session=sessionFactory.getCurrentSession();
        session.save(uye);
    }

    @Override
    public void sil(int id) {
        Session session=sessionFactory.getCurrentSession();

        Uye uye=session.get(Uye.class,id);

        session.delete(uye);

    }

    @Override
    public Uye uyeGetir(int id) {
        Session session=sessionFactory.getCurrentSession();

        Uye uye=session.get(Uye.class,id);


        return uye;
    }

    @Override
    public void guncelle(Uye uye) {
        Session session=sessionFactory.getCurrentSession();

        session.update(uye);
    }

    @Override
    public boolean kontrol(Uye uye) {
        Session session=sessionFactory.getCurrentSession();
        Query<Uye> query=session.createQuery("from Uye where isim=:uyeIsim and telefon=:uyeTelefon",Uye.class);
        query.setParameter("uyeIsim",uye.getIsim());
        query.setParameter("uyeTelefon",uye.getTelefon());
        List<Uye> uyeList=query.getResultList();

        if(uyeList.size() != 0){
            return true;
        }
        else
            return false;

    }

    @Override
    public List<Uye> ara(String deger) {
        Session session=sessionFactory.getCurrentSession();

        Query<Uye> query=session.createQuery("from Uye where isim like :Arama or soyisim like :Arama or dogumgunu like :Arama",Uye.class);
        query.setParameter("Arama","%"+deger+"%");
        List<Uye> uyeGetir=query.getResultList();
        return uyeGetir;
    }


}
