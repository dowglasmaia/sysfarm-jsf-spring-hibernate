package jsf_spring.util;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public class HibernateUtil implements Serializable {
	private static final long serialVersionUID = 1L;

	// Criando a fabrica de Sessão de pega os Dados do hibernate.cfg.xml
	protected static SessionFactory criandoSessionFactory() {
		try {
			Configuration configuration = new Configuration().configure();

			SessionFactory factory = configuration.buildSessionFactory();

			return factory;
		} catch (Throwable erro) {
			System.out.println("A Fabrica de Sessão não Pode ser Criada! " + erro);
			throw new ExceptionInInitializerError(erro);
		}
	}

	// metodo statico que recebi os dados do metodo que cria a Fabrica de Sessões
	private static SessionFactory sessionFactory = criandoSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/* abre uma nova sessão no SessionFactory e retorna uma Session */
	public static Session openSession() {
		if (sessionFactory == null) {
			criandoSessionFactory();
		}
		return sessionFactory.openSession();
	}

}
