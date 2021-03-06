package conecta2.servicioAplicacion;

import conecta2.modelo.Empresa;
import conecta2.modelo.Particular;
import conecta2.transfer.TransferParticular;

/**
 * Interfaz que define los casos de uso
 * Interfaz que define los métodos o funciones que puede realizar el particular
 */
public interface SAParticular {
	
	public void crearParticular(TransferParticular dtoUsuario);
	
	public Particular buscarPorEmail(String email);
	
	public Particular buscarPorDni(String dni);
	
	public Particular buscarPorId(int id);
	
	public Particular save(Particular particular);
	
	public Particular cifraPass(Particular particular);
	
	public boolean addValoracion(Empresa empresa, Particular contratado, double valoracion);
	
}
