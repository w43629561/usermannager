package com.wy.controller;

import com.wy.javabean.User;
import com.wy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("utf-8");


                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String name = req.getParameter("name");
                String phone = req.getParameter("phone");
                String birthday = req.getParameter("birthday");

                User user = new User(0, username, password, name, phone, birthday);

                UserService us = new UserService();
                boolean b = us.saveUser(user);

        if (b == true) {
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().println("success");
        }else{
            req.getRequestDispatcher("register.html").forward(req,resp);
        }





    }
}
