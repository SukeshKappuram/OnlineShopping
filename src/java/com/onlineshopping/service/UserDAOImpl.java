/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlineshopping.service;

import com.onlineshopping.DAO.UserDAO;
import com.onlineshopping.db.DataSource;
import com.onlineshopping.model.User;
import java.sql.ResultSet;

/**
 *
 * @author iamsu
 */
public class UserDAOImpl implements UserDAO{

    DataSource ds=new DataSource();
    
    @Override
    public int create(User u) {
        int i=0;
        try{
        ds.setCon();
        ds.setSt("insert into Users(firstName,lastName,mailId,phoneNumber,password) values(?,?,?,?,?)");
        ds.getSt().setString(1,u.getFirstName());
        ds.getSt().setString(2,u.getLastName());
        ds.getSt().setString(3,u.getMailId());
        ds.getSt().setString(4,u.getPhoneNumber());
        ds.getSt().setString(5,u.getPassword());
        i=ds.getSt().executeUpdate();
        ds.getCon().commit();
        ds.getCon().close();
        }catch(Exception e){
            System.err.println(e);
        }
        return i; 
    }

    @Override
    public User read(User u) {
        try{
            ds.setCon();
            ds.setSt("select * from Users where mailId=?");
            ds.getSt().setString(1, u.getMailId());
            ResultSet rs = ds.getSt().executeQuery();
            if(rs.next()){
                if(rs.getString("password").equals(u.getPassword())){
                    u.setFirstName(rs.getString("firstName"));
                    u.setLastName(rs.getString("lastName"));
                    u.setPhoneNumber(rs.getString("phoneNumber"));
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
        return u;
    }

    @Override
    public int update(User u) {
        return 0;
    }

    @Override
    public int delete(User u) {
        return 0;
    }
    
    public static void main(String[] arg){
        UserDAO ud=new UserDAOImpl();
        User u=new User("imvirat@mymail.com", "1234567");
        System.out.println(ud.read(u).getFirstName());
    }
}
