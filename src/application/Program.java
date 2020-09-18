package application;

import entities.Contact;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
		
		//Instanciação dos objetos: professor1, professor2 e professor3
		Professor professor1 = new Professor("Fulano", 'm', "111", new Contact("Phone", "92 9999 9999"));
		Professor professor2 = new Professor("Ciclano", 'm', "222", new Contact("E-mail", "ciclano@mail.com"));
		Professor professor3 = new Professor("Beltrano", 'f', "333", new Contact());
		
	//print dos dados contidos no objeto professor3, formatado pelo método "toString" sobrescrito
	 System.out.println(professor2.toString());
	}
	
	
}
