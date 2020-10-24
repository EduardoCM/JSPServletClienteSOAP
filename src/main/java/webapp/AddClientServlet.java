package webapp;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bancomaya.clientes.TarjetaDigital;
import com.bancomaya.clientes.TarjetaDigitalService;
import com.bancomaya.clientes.TarjetaDigitalServiceImplService;

/**
 * Servlet Add Client
 * 
 * @author Diego Sousa - www.diegosousa.com
 * @version 1.0 Copyright (C) 2012 Diego Sousa de Azevedo
 */

@WebServlet(urlPatterns = { "/addclientform" })
public class AddClientServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String cliente = request.getParameter("cliente");
		String banco = request.getParameter("banco");
		String fechaNacimiento = request.getParameter("fecha");
		String numero = request.getParameter("numero");
		String numeroSeguridad = request.getParameter("numeroSeguridad");
		TarjetaDigital tarjeta = new TarjetaDigital();
		tarjeta.setCliente(cliente);
		tarjeta.setBanco(banco);
		tarjeta.setFechaVencimiento(fechaNacimiento);
		tarjeta.setNumero(numero);
		tarjeta.setNumeroSeguridad(numeroSeguridad);
		
		
	     TarjetaDigitalService tarjetaService = new TarjetaDigitalServiceImplService().getTarjetaDigitalServiceImplPort();
	     
	     tarjetaService.crearTarjetaDigital(tarjeta);
		
		request.getRequestDispatcher("/printmessage.jsp").forward(request, response);
	}
}