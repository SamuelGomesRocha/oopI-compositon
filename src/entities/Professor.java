package entities;


//Implementação da casse Professor
public class Professor {

	public static int totalProfessores = 0;
	
	//Atributos
	private String name;
	private char sex;
	private String matricula;
	private Contact contato;
	
	//Construtor 
	public Professor(String name, char sex, String matricula, Contact contato) {
		this.name = name;
		this.sex = sex;
		this.matricula = matricula;
		this.contato = contato;
		totalProfessores+=1;
	}
	
	//Métodos Acessores 
	public String getName() {
		return name;
	}
	public char getSex() {
		return sex;
	}
	public String getMatricula() {
		return matricula;
	}
	
	//@override
	public String toString() {
		return "Name: "+name
			  +"\nSex: "+sex
			  +"\nMatricula: "+matricula
			  +"\nType of contact: "+ contato.getTipo()
			  +"   ||   Description of contact: "+ contato.getDescricao()
			  +"\nNumber of teachers: "+ totalProfessores;
	}
	

}
