package com.servlet;

import java.io.IOException;
import java.util.List;
import com.dao.BookDao;
import com.entity.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListBooksServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = BookDao.getAllBooks();

        if (books != null) {
            System.out.println("Books retrieved: " + books.size());
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books retrieved from the database.");
        }

        request.setAttribute("books", books);
        request.getRequestDispatcher("BookList.jsp").forward(request, response);
    }
}
