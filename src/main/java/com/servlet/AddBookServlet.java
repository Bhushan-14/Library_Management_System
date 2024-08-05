package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.entity.Book;

public class AddBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    

    public AddBookServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));
        
        Book b1 = new Book(title, author, price);
        boolean result = BookDao.save(b1);
        if(result) {
        	System.out.println("Book Added Successfully");
        	response.sendRedirect("ListBooksServlet");
        } else {
        	System.out.println("Fail to Add Book");
            response.sendRedirect("AddBook.jsp");
        }
    }
}
