package jsf_spring.service.util;

import org.apache.commons.codec.digest.DigestUtils;

/**@author Dowglas
 * Reposaven por fazer a Cripitografia da Senha.
 * */

public class HashEncryption {

	public static String getSecuryteHash(String texto) {
		String hash = DigestUtils.sha256Hex(texto);
		return hash;
	}

}
