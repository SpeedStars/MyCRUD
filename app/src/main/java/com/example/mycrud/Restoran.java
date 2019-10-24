package com.example.mycrud;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
@SuppressWarnings("unused")
public class Restoran implements Serializable{

    private String nama;
    private String alamat;
    private String notelp;
    private String email;
    private String key;

    public Restoran(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+alamat+"\n" +
                " "+notelp+"\n" +
                " "+email;
    }

    public Restoran(String nm, String alm, String tlp, String mail){
        nama = nm;
        alamat = alm;
        notelp = tlp;
        email = mail;
    }
}