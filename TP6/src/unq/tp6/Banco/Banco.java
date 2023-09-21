package unq.tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<SolicitudDeCredito> solicitudesCreadas = new ArrayList<SolicitudDeCredito>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
		cliente.serRegistrado(this);
	}
	
	public List<SolicitudDeCredito> getSolicitudesCreadas() {
		return solicitudesCreadas;
	}
	public void crearSolicitud(Cliente cliente, int monto, int meses) {
		SolicitudDeCredito nuevaSolicitud = new SolicitudDeCreditoPersonal(cliente, monto, meses);
		solicitudesCreadas.add(nuevaSolicitud);
	}
	
	public void crearSolicitud(Cliente cliente, int monto, int meses, Propiedad propiedad) {
		SolicitudDeCredito nuevaSolicitud = new SolicitudDeCreditoHipotecario(cliente, monto, meses, propiedad);
		solicitudesCreadas.add(nuevaSolicitud);
	}
	
	public int montoADesembolsarMensual() {
		return solicitudesCreadas.stream().filter(s -> s.aprobada()).mapToInt(s -> s.montoMensual()).sum();
	}
}
