/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metadata.hibernatetest;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session; 
import sevenet.model.Login_info;

/**
 *
 * @author lszydlow
 */

/*Ważna informacja, Login_info to zwykłe POJO wymagające mapowania XML; 
Zaś Messages to klasa z adnotacjami, która nie wymaga takiego mapowania tylko dodania to hibernate.cfg.xml
<mapping class="sevenet.model.Messages"/>
*/
public class ManageLoginInfo {
       static Session session;
       public static void main(String[] args) {
            try {
            System.out.println("Maven + Hibernate + Oracle");
            addLogin();                     //dodanie nowego loginu
            selectMessages();               //odczyt z tablicy messages
            selectLogin();                  //odczyt z tablicy login_info
            
            } catch (HibernateException ex) {
                Logger.getLogger(ManageLoginInfo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
               HibernateUtil.shutdown();
            }

        
   }
       static void selectLogin(){
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "FROM Login_info";
            Query query = session.createQuery(hql);
            List results = query.list();
            for(Object element : results){
                System.out.println(element.toString());
            }
            session.close();
       }
       static void selectMessages(){
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "FROM Messages";
            Query query = session.createQuery(hql);
            List messages = query.list(); 
            for(Object element : messages){
                System.out.println(element.toString());
            }
            session.close();
            
       }
       static void addLogin(){
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Login_info login = new Login_info();

            login.setThr_id("10400");
            login.setOld_login("Stary login2");
            login.setTemp_login("Temp Login2");

            session.save(login);
            session.getTransaction().commit();  
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManageLoginInfo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                session.close(); 
            }
       }
}
