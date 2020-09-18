package entities;
//Implementação da classe "Contato"
public class Contact {
	
	private String tipo;
	private String descricao;
	
	public Contact() {
		
	}
	
	public Contact(String tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
