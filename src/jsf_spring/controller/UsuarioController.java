package jsf_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import jsf_spring.entity.Usuario;
import jsf_spring.service.UsuarioService;

@Controller
@Scope("request")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	private Usuario usuario;

	private String confirmaSenha;

	private List<Usuario> usuarios = new ArrayList<>();

	public UsuarioController() {
		this.usuario = new Usuario();
	}

	/* == salvar == */
	public void salvar() {
		try {
			service.save(usuario);
			Messages.addFlashGlobalInfo("Usuario Salvo com Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			Messages.addFlashGlobalError("Erro ao tentar salvar Usuario!", e);
		}
	}

	/* ==Listar Todos == */
	public List<Usuario> findAll() {
		try {
			this.usuarios = service.findAll();
			return usuarios;
		} catch (Exception e) {
			e.printStackTrace();
			Messages.addFlashGlobalError("Erro ao tentar listar Usuarios!", e);
			return null;
		}
	}

	/* ===Getters e Setters ==== */
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

}
