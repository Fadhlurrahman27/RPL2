/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fadhlurrahman
 */
@Entity
@Table(name = "toko_buku")
public class TokoBuku implements Serializable{
    @Id
    @Column(name = "kd_buku", length = 15)
    private String kd_buku;
    @Column(name = "nama", length = 20)
    private String nama;
    @Column(name = "jenis", length = 20)
    private String jenis;
    @Column(name = "harga", length = 15)
    private String harga;

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
