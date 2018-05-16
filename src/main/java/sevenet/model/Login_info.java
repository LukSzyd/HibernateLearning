/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevenet.model;

/**
 *
 * @author lszydlow
 */
public class Login_info implements java.io.Serializable{
    private int id;
    private String thr_id; 
    private String old_login;   
    private String temp_login;   

    public Login_info(String thr_id, String old_login, String temp_login) {
        this.thr_id = thr_id;
        this.old_login = old_login;
        this.temp_login = temp_login;
    }

    public Login_info() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThr_id() {
        return thr_id;
    }

    public void setThr_id(String thr_id) {
        this.thr_id = thr_id;
    }

    public String getOld_login() {
        return old_login;
    }

    public void setOld_login(String old_login) {
        this.old_login = old_login;
    }

    public String getTemp_login() {
        return temp_login;
    }

    public void setTemp_login(String temp_login) {
        this.temp_login = temp_login;
    }

    @Override
    public String toString() {
        return "Login_info{" + "id=" + id + ", thr_id=" + thr_id + ", old_login=" + old_login + ", temp_login=" + temp_login + '}';
    }
    
    
}
