package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateConfiguration;
import com.entity.Book;

public class BookDao {

    public static boolean save(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

    public static List<Book> getAllBooks() {
        Transaction transaction = null;
        List<Book> books = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Query<Book> query = session.createQuery("FROM Book", Book.class);
            books = query.list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return books;
    }

    public boolean update(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(book); 
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }


    public Book getBookById(int bookId) {
        Transaction transaction = null;
        Book book = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            book = session.get(Book.class, bookId);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return book;
    }
    public boolean delete(int bookId) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Book book = session.get(Book.class, bookId);
            if (book != null) {
                session.delete(book);
                transaction.commit();
                return true;
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

}