package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO -> dATA aCESS object
 * Classes que contem os metodos que irão manipular os dados
 * manipular os dados = CRUD
 * Classe CrudRepository<1ºClasseBeans,2ºTipodeDadoPK>
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
/*
 * ja tem os metodos dentro dessa classe. não precisa criar
 * save() -> alterar/gravar
 * find() -> consultar
 * deleteAll() -> apagar
 */
	
	public Usuario findByEmailAndSenha(String email,String senha);
	
}
