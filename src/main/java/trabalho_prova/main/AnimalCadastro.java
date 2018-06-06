package trabalho_prova.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trabalho_prova.main.model.Animal;

@WebServlet(name = "AnimalCadastro", urlPatterns = { "/animal" })
public class AnimalCadastro extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome").toString();
		String raca = req.getParameter("raca").toString();
		String tipo = req.getParameter("tipo").toString();
		
		Animal animal = new Animal();

		animal.setNome(nome);
		animal.setRaca(raca);
		animal.setTipo(tipo);
		
		AnimalBanco.getInstance().addAnimal(animal);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/animal-lista");
		dispatcher.forward(req, resp);
	}

}
