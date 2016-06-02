/*package negocio;

import persistencia.ClienteDAO;
import beans.Cliente;

public class CtrlCliente {

	Cliente cliente = new Cliente();

	public String actionGravar() {
		if (cliente.getId() == 0) {
			ClienteDAO.inserir(cliente);
			return actionInserir();
		} else {
			ClienteDAO.alterar(cliente);
			return "form_cliente";
		}
	}

	public String actionInserir() {
		cliente = new Cliente();
		return "form_cliente";
	}
}
*/