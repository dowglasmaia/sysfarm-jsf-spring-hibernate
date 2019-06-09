package jsf_spring.dao.interfac;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface GenereciDAOInterface<E> extends Serializable {
	
	E save(E obj) throws Exception;

	E update(E obj) throws Exception;

	void delete(Long id) throws Exception;

	E findById(Long id) throws Exception;

	List<E> FindAll() throws Exception;

	List<E> findByName(String nome) throws Exception;

	List<E> findByDate(LocalDate entrada, LocalDate saida) throws Exception;

}
