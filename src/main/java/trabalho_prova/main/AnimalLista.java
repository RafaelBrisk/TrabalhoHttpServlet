package trabalho_prova.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trabalho_prova.main.model.Animal;

@WebServlet(name = "AnimalLista", urlPatterns = { "/animal-lista" })
public class AnimalLista extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		writer.print("<h1>Animais</h1>");
		writer.print("<a href='/trabalho_prova/cadastro_animal.jsp'>Cadastrar novo animal</a>");
		
		StringBuilder sb = new StringBuilder();
		
		Collection<Animal> values = AnimalBanco.getInstance().getAll();
		
		for (Animal animal : values) {
			sb.append("<tr>")
				.append("<td>" + animal.getNome() + "</td>")
				.append("<td>" + animal.getRaca() + "</td>")
				.append("<td>" + animal.getTipo() + "</td>")
			.append("</tr>");
		}
		
		writer.println("<html>");
		
			writer.println("<head>");
			writer.println("</head>");
			
			writer.println("<body>");
			
				writer.println("<table>");
				
					writer.println("<thead>");
						writer.println("<tr>");
							writer.println("<th>Nome</th>");
							writer.println("<th>Raça</th>");
							writer.println("<th>Tipo</th>");
						writer.println("</tr>");
					writer.println("</thead>");
					
					writer.println("<tbody>");
						writer.println(sb.toString());
					writer.println("</tbody>");
				
				writer.println("</table>");
			
			writer.println("</body>");
		
		writer.println("</html>");
		writer.close();
		
	}
	
}
