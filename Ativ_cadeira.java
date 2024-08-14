package Aula_14_08;

public class Ativ_cadeira {

	public static void main(String[] args) {
		 
		cadeira cadeita1 = new cadeira();
		cadeira cadeita2 = new cadeira();
		
		cadeita1.setModelo("gamer");
		cadeita1.setCor("roxo");
		cadeita1.setCod("99999-8888");
		cadeita1.setTecido("tecido");
		
		System.out.println("----- OBEJETO -----");	
		System.out.println(" + modelo: " + cadeita1.getModelo ());		
		System.out.println(" + cor: " + cadeita1.getCor ());
		System.out.println(" + codigo: " + cadeita1.getCod ());
		System.out.println(" + tecido: " + cadeita1.getTecido ());
		
		cadeita2.setModelo("escritorio");
		cadeita2.setCor("preta");
		cadeita2.setCod("12122-8989");
		cadeita2.setTecido("couro");
		
		System.out.println("----- OBEJETO -----");	
		System.out.println(" + modelo: " + cadeita2.getModelo ());		
		System.out.println(" + cor: " + cadeita2.getCor ());
		System.out.println(" + codigo: " + cadeita2.getCod ());
		System.out.println(" + tecido: " + cadeita2.getTecido ());
	}

}
