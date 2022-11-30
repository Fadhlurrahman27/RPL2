/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.service;

import com.toko.buku.dao.TokoBukuDao;
import com.toko.buku.model.TokoBuku;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fadhlurrahman
 */
@Service("TokoBukuService")
@Transactional
public class TokoBukuServiceImpl implements TokoBukuService {
    @Autowired
    private TokoBukuDao tokoBukuDao;

    @Override
    public void save(TokoBuku tokobuku) {
        tokoBukuDao.save(tokobuku);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TokoBuku tokobuku) {
         tokoBukuDao.update(tokobuku);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(TokoBuku tokobuku) {
         tokoBukuDao.delete(tokobuku);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TokoBuku> getList() {
        return  tokoBukuDao.getList();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
