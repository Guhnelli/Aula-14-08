package Aula_14_08;

import Aula_07_08.Carros;

public class obj_Aviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();

		aviao1.setModelo("1010");
		aviao1.setCor("PRETO");
		aviao1.setAgencia("3030");
		aviao1.setMarca("4040");

		System.out.println("----- OBEJETO -----");	
		System.out.println("modelo: " + aviao1.getModelo ());		
		System.out.println("cor: " + aviao1.getCor ());
		System.out.println("agencia: " + aviao1.getAgencia ());
		System.out.println("marca: " + aviao1.getMarca ());

		


	}

}
