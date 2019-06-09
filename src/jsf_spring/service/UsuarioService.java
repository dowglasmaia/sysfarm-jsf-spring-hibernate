package jsf_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jsf_spring.dao.entity.impl.UsuarioDAO;
import jsf_spring.entity.Usuario;
import jsf_spring.service.util.HashEncryption;

@Component
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;

	/* Salvar */
	public Usuario save(Usuario obj) throws Exception {
		String hash = HashEncryption.getSecuryteHash(obj.getSenha());
		obj.setSenha(hash);
		obj.setAtivo(true);
		return dao.save(obj);
	}

}
