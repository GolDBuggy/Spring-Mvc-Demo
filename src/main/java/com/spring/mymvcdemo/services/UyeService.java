package com.spring.mymvcdemo.services;

import com.spring.mymvcdemo.entity.Uye;
import com.spring.mymvcdemo.entity.Yazi;

import java.util.List;

public interface UyeService {

    public List<Uye> uyeler();

    public void kaydet(Uye uye);

    public void sil(int id);

    public Uye uyeGetir(int id);

    public void guncelle(Uye uye);

    public boolean kontrol(Uye uye);

    List<Uye> ara(String deger);

    public void kaydet(Yazi yazi);
}
