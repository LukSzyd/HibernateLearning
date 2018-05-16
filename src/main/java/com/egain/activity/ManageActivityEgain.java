/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egain.activity;

import com.metadata.hibernatetest.HibernateUtil;
import com.metadata.hibernatetest.ManageLoginInfo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author lszydlow
 */
public class ManageActivityEgain {
      static Session session;
       public static void main(String[] args) {
            try {
            System.out.println("Maven + Hibernate + Oracle");
            selectActivity();
            
            } catch (HibernateException ex) {
                Logger.getLogger(ManageLoginInfo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
               HibernateUtilMSSQL.shutdown();
            }

        
   }
       
       static void selectActivity(){
            session = HibernateUtilMSSQL.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "FROM EgplCasemgmtActivity";
            TypedQuery query = session.createQuery(hql);
            List results = query.getResultList();
            for(Object element : results){
                System.out.println(element.toString());
            }
            session.close();
       }
}
