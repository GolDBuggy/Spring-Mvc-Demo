package com.spring.mymvcdemo.controller;

import com.spring.mymvcdemo.dao.UyeDAO;
import com.spring.mymvcdemo.entity.Uye;
import com.spring.mymvcdemo.services.UyeService;

import org.hibernate.validator.cdi.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class UyeController {

    @Autowired
    private UyeService uyeService;

    @GetMapping("/uyeler")
    public String getirUyeler(Model model){
        List<Uye> uyeListesi=uyeService.uyeler();

        model.addAttribute("uyeler",uyeListesi);

        return "uye-listesi";
    }

    @GetMapping("/uyeEkle")
    public String uyeEkle(Model model){
        Uye uye=new Uye();

        model.addAttribute("uye",uye);
        return "uye-ekle";
    }

    @PostMapping("/uyeKaydet")
    public String uyeKaydet(@ModelAttribute("uye") Uye uye){
        uyeService.kaydet(uye);

        return "redirect:/menu/uyeler";
    }

    @GetMapping("/sil")
    public String silme(@RequestParam("uyeId") int id){
        uyeService.sil(id);
        return "redirect:/menu/uyeler";
    }

    @GetMapping("/guncelle")
    public String guncellemeSayfası(@RequestParam("uyeId") int id,Model model){
        Uye uye=uyeService.uyeGetir(id);

        model.addAttribute("uye",uye);

        return "uye-guncelle";
    }

    @PostMapping("/uyeGuncelle")
    public String guncelle(@ModelAttribute("uye") Uye uye){

        uyeService.guncelle(uye);

        return "redirect:/menu/uyeler";
    }

    @GetMapping("/kullanicigiris")
    public String kullaniciGiris(Model model){
        Uye uye=new Uye();
        model.addAttribute("uyeGiris",uye);

        return "ana-ekran";
    }

    @PostMapping("/girisEkrani")
    public String girisValid(@Valid @ModelAttribute("uyeGiris") Uye uye,BindingResult result){
        boolean kontrolEt=uyeService.kontrol(uye);

        if(kontrolEt)
            return "redirect:/menu/uyeler";

        else {
           return "ana-ekran";
        }
    }

    @GetMapping("/uyeAra")
    public String uyeGetir(@RequestParam("aramaMetni") String deger,Model model){
        List<Uye> uyeGetir=uyeService.ara(deger);
        model.addAttribute("uyeler",uyeGetir);
        return "uye-listesi";
    }

}
