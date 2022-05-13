package com.spring.mymvcdemo.dao;

import com.spring.mymvcdemo.entity.Uye;

import java.util.List;

public interface UyeDAO {

    public List<Uye> uyeler();

    public void kaydet(Uye uye);

    public void sil(int id);

    public Uye uyeGetir(int id);

    public void guncelle(Uye uye);

    public boolean kontrol(Uye uye);

    List<Uye> ara(String deger);
}
