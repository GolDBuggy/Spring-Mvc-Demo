package com.spring.mymvcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "paragraphtable")
public class Yazi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Override
    public String toString() {
        return "Yazi{" +
                "id=" + id +
                ", paragraf='" + paragraf + '\'' +
                ", uye=" + uye +
                '}';
    }

    @Column(name = "yazi")
    private String paragraf;

    public Yazi() {
    }

    public Yazi(String paragraf, Uye uye) {
        this.paragraf = paragraf;
        this.uye = uye;
    }

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "yazar_id")
    private Uye uye;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParagraf() {
        return paragraf;
    }

    public void setParagraf(String paragraf) {
        this.paragraf = paragraf;
    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }



}
