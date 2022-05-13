package com.spring.mymvcdemo.entity;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "demotable")
public class Uye {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "isim")
    @NotNull
    @Size(min = 3,max = 20,message = "isim alanini bos birakmayiniz!")
    private String isim;

    @Column(name = "soyisim")
    @NotNull(message = "Lutfen soyisim alanini bos bırakmayın!")
    private String soyisim;

    @Column(name = "dogumgunu")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dogumgunu;



    public Uye() {
    }

    public Uye(String isim, String soyisim, Date dogumgunu, String telefon) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumgunu = dogumgunu;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Uye{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", dogumgunu=" + dogumgunu +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    @Column(name = "telefon")
    @NotNull
    @Size(max = 11,min = 10,message = "Lutfen telefon alanini bos birakmayin!")
    private String telefon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Date getDogumgunu() {
        return dogumgunu;
    }

    public void setDogumgunu(Date dogumgunu) {
        this.dogumgunu = dogumgunu;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
