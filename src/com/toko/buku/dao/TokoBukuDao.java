/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.dao;

import com.toko.buku.model.TokoBuku;
import java.util.List;

/**
 *
 * @author Fadhlurrahman
 */
public interface TokoBukuDao {
    public String save(TokoBuku tokobuku);
    public void update(TokoBuku tokobuku);
    public void delete(TokoBuku tokobuku);
    //public TokoBuku get(String kd_buku);
    public List<TokoBuku> getList();
}
