package trabalho_prova.main.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GravarBotaoTag extends SimpleTagSupport {
	
	private String texto = "Gravar";
	
	@Override
	public void doTag() throws JspException, IOException {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<input type='submit' value='" + getTexto() + "' />");
		
		getJspContext().getOut().write(sb.toString());
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
