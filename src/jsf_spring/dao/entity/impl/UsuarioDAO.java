package jsf_spring.dao.entity.impl;

import org.springframework.stereotype.Component;

import jsf_spring.dao.impl.GenericDAO;
import jsf_spring.entity.Usuario;

@Component
public class UsuarioDAO extends GenericDAO<Usuario> {
	private static final long serialVersionUID = 1L;

	public UsuarioDAO() {
		super();
		classPersistente = Usuario.class;
	}

}
