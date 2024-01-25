package ec.edu.ups.ppw63.demo63.business;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw63.demo63.dao.ClienteDAO;
import ec.edu.ups.ppw63.demo63.dao.FacturaDAO;
import ec.edu.ups.ppw63.demo63.model.Cliente;
import ec.edu.ups.ppw63.demo63.model.DetalleFactura;
import ec.edu.ups.ppw63.demo63.model.Factura;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private FacturaDAO daoFactura;
	
	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		
		Cliente cliente = new Cliente();
		
		cliente.setCodigo(0);
		cliente.setDireccion("Barrial Blanco");
		cliente.setDni("0106785678");
		cliente.setNombre("Esteban Cordova");
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		
		cliente.setCodigo(0);
		cliente.setDireccion("NOSE");
		cliente.setDni("0102030405");
		cliente.setNombre("Eduardo Arce");
		daoCliente.insert(cliente);
		
		System.out.println("****************************************************************************");
		System.out.println(cliente.toString());
	}
}