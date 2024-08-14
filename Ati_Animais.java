package Aula_14_08;

public class Ati_Animais {

	public static void main(String[] args) {

		Animais animal1 = new Animais();
		Animais animal2 = new Animais();
		Animais animal3 = new Animais();
		Animais animal4 = new Animais();
		Animais animal5 = new Animais();
		Animais animal6 = new Animais();
		Animais animal7 = new Animais();

		animal1.setNome("Petisquinho");
		animal1.setRaca("Puh");
		animal1.setSexo("Macho");
		
		System.out.println("----- OBEJETO cachorro -----");	
		System.out.println(" + Nome: " + animal1.getNome ());		
		System.out.println(" + Raça: " + animal1.getRaca ());
		System.out.println(" + Sexo: " + animal1.getSexo ());
		System.out.println(" - " +animal1.andar() );
		System.out.println(" - " +animal1.dormir());
		System.out.println(" - " +animal1.sons());
		
		animal2.setNome("betina");
		animal2.setRaca("Red poll");
		animal2.setSexo("femea");
		
		System.out.println("----- OBEJETO vaca -----");	
		System.out.println(" + Nome: " + animal2.getNome ());		
		System.out.println(" + Raça: " + animal2.getRaca ());
		System.out.println(" + Sexo: " + animal2.getSexo ());
		System.out.println(" - " +animal2.andar() );
		System.out.println(" - " +animal2.comer());
		System.out.println(" - " +animal2.sons1());
		
		animal3.setNome("Valente");
		animal3.setRaca("Red poll");
		animal3.setSexo("macho");
		
		System.out.println("----- OBEJETO bazero -----");	
		System.out.println(" + Nome: " + animal2.getNome ());		
		System.out.println(" + Raça: " + animal2.getRaca ());
		System.out.println(" + Sexo: " + animal2.getSexo ());
		System.out.println(" - " +animal2.andar() );
		System.out.println(" - " +animal2.comer());
		System.out.println(" - " +animal2.sons1());
		
		animal4.setNome("Beto");
		animal4.setRaca("cabra pigmeu");
		animal4.setSexo("macho");
		
		System.out.println("----- OBEJETO cabra -----");	
		System.out.println(" + Nome: " + animal4.getNome ());		
		System.out.println(" + Raça: " + animal4.getRaca ());
		System.out.println(" + Sexo: " + animal4.getSexo ());
		System.out.println(" - " +animal4.saltitar() );
		System.out.println(" - " +animal4.comer());
		System.out.println(" - " +animal4.sons2());
		
		animal5.setNome("PIP");
		animal5.setRaca("angora");
		animal5.setSexo("macho");
		
		System.out.println("----- OBEJETO coelho -----");	
		System.out.println(" + Nome: " + animal5.getNome ());		
		System.out.println(" + Raça: " + animal5.getRaca ());
		System.out.println(" + Sexo: " + animal5.getSexo ());
		System.out.println(" - " +animal5.pular() );
		System.out.println(" - " +animal5.comer());
		System.out.println(" - " +animal5.sons3());
		
		animal6.setNome("Claudia");
		animal6.setRaca("Legorne");
		animal6.setSexo("femea");
		
		System.out.println("----- OBEJETO galinha -----");	
		System.out.println(" + Nome: " + animal6.getNome ());		
		System.out.println(" + Raça: " + animal6.getRaca ());
		System.out.println(" + Sexo: " + animal6.getSexo ());
		System.out.println(" - " +animal6.ciscar() );
		System.out.println(" - " +animal6.comer());
		System.out.println(" - " +animal6.sons4());
		
		animal7.setNome("bicudo");
		animal7.setRaca("Legorne");
		animal7.setSexo("macho");
		
		System.out.println("----- OBEJETO  pintinh -----");	
		System.out.println(" + Nome: " + animal7.getNome ());		
		System.out.println(" + Raça: " + animal7.getRaca ());
		System.out.println(" + Sexo: " + animal7.getSexo ());
		System.out.println(" - " +animal7.ciscar() );
		System.out.println(" - " +animal7.comer());
		System.out.println(" - " +animal7.sons4());
	}

}
