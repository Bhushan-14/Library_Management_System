package com.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.entity.Book;

public class HibernateConfiguration {
	private static SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		Properties setting = new Properties();
		setting.put(Environment.DRIVER,"com.mysql.cj,jdbc.Driver");
		setting.put(Environment.URL,	"jdbc.mysql://localhost://3308/LibraryManagementSystem");
		setting.put(Environment.USER,"root");
		setting.put(Environment.PASS,"potato");
		setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		setting.put(Environment.HBM2DDL_AUTO, "update");
		setting.put(Environment.SHOW_SQL, true);
		configuration.setProperties(setting);
		configuration.addAnnotatedClass(Book.class);
		return null;
	}
}
