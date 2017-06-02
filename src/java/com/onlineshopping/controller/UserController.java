/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlineshopping.controller;

import com.onlineshopping.DAO.UserDAO;
import com.onlineshopping.model.User;
import com.onlineshopping.service.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author iamsu
 */
@WebServlet(name = "UserController", urlPatterns = {"/User"})
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mailId=request.getParameter("mailId");
        String password=request.getParameter("password");
        UserDAO ud=new UserDAOImpl();
         RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
        String reqPage=request.getHeader("referer");
        if(reqPage.contains("Login")){
            User u=new User(mailId, password);
            HttpSession session=request.getSession();
            u=ud.read(u);
            session.setAttribute("user", u);
            if(u.getFirstName()!=null){
                Cookie c1=new Cookie("phone", u.getPhoneNumber());
                Cookie c2=new Cookie("pass", u.getPassword());
                response.addCookie(c1);
                response.addCookie(c2);
                rd=request.getRequestDispatcher("Welcome.jsp?name="+u.getFirstName()+" "+u.getLastName());
                rd.forward(request, response);
            }else{
                rd=request.getRequestDispatcher("Login.jsp");
                out.print("Login Failed!!");
                rd.include(request, response);
            }
        }else{
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String phoneNumber=request.getParameter("phoneNumber");
        String gender=request.getParameter("gender");
        String confirmpassword=request.getParameter("confirmpassword");
        
       
        
        if(password.equals(confirmpassword)){
            User u=new User(firstName, lastName, mailId, phoneNumber, password);
            
                if(ud.create(u)>0){
                    out.println("User Registered Successfully!!");
                }
        }
        else{
             out.println("Password Mismatch!!");
        }
        rd.include(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
