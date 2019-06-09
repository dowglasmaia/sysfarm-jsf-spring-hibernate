package jsf_spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import jsf_spring.dao.interfac.GenereciDAOInterface;
import jsf_spring.util.HibernateUtil;

public class GenericDAO<E> implements GenereciDAOInterface<E> {
	private static final long serialVersionUID = 1L;
	

	/* Metodo auxilar para Consultas Genericas, Recuperando a Class de Instancia */
	@SuppressWarnings({ "unused", "unchecked" })
	private final Class<E> entidadeClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];
		

	/*== salvar ==*/
	@Override
	public E save(E obj) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(obj);
			session.flush();
			tx.commit();
			return obj;
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}

	@Override
	public E update(E obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public E findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> FindAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> findByName(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> findByDate(LocalDate entrada, LocalDate saida) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
