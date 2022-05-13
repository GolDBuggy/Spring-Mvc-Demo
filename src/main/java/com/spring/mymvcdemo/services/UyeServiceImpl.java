package com.spring.mymvcdemo.services;

import com.spring.mymvcdemo.dao.UyeDAO;
import com.spring.mymvcdemo.dao.YaziDAO;
import com.spring.mymvcdemo.entity.Uye;
import com.spring.mymvcdemo.entity.Yazi;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UyeServiceImpl implements UyeService {

    @Autowired
    private UyeDAO uyeDAO;

    @Autowired
    private YaziDAO yaziDAO;

    @Override
    @Transactional
    public List<Uye> uyeler() {
        return uyeDAO.uyeler();
    }

    @Override
    @Transactional
    public void kaydet(Uye uye) {
        uyeDAO.kaydet(uye);
    }

    @Override
    @Transactional
    public void sil(int id) {
        uyeDAO.sil(id);
    }

    @Override
    @Transactional
    public Uye uyeGetir(int id) {
        return uyeDAO.uyeGetir(id);
    }

    @Override
    @Transactional
    public void guncelle(Uye uye) {
        uyeDAO.guncelle(uye);
    }

    @Override
    @Transactional
    public boolean kontrol(Uye uye) {
        return uyeDAO.kontrol(uye);
    }

    @Override
    @Transactional
    public List<Uye> ara(String deger) {
        return uyeDAO.ara(deger);
    }

    @Override
    @Transactional
    public void kaydet(Yazi yazi) {
         yaziDAO.kaydet(yazi);
    }
}
