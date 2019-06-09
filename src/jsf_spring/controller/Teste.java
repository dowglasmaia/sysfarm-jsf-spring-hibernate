package jsf_spring.controller;

import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

import jsf_spring.util.HibernateUtil;

public class Teste {

	@Test
	@Ignore
	public void sessao() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Criou");
	}

}
