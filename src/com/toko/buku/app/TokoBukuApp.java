/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.app;

import com.toko.buku.service.TokoBukuService;
import com.toko.buku.view.TokoBukuView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Fadhlurrahman
 */
public class TokoBukuApp {
    private static ApplicationContext appContext;
    
    public static void main(String[] args) {
        appContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        new TokoBukuView().setVisible(true);
    }
    
    public static TokoBukuService getTokoBukuService(){
        return (TokoBukuService)appContext.getBean("TokoBukuService");
    }
}
