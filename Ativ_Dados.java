package Aula_14_08;

public class Ativ_Dados {
	
	public static void main(String[] args) {
	
	Dados cliente1 = new Dados();
	Dados cliente2 = new Dados();
	
	cliente1.setNome("Gustavo h.");
	cliente1.setId("123-321");
	cliente1.setTelefone("(15) 99999-8888");
	cliente1.setCpf("845.645.654-10");
	cliente1.setRg("456456456-5");
	
	System.out.println("----- OBEJETO -----");	
	System.out.println(" + Nome: " + cliente1.getNome ());		
	System.out.println(" + id: " + cliente1.getId ());
	System.out.println(" + telefone: " + cliente1.getTelefone ());
	System.out.println(" + Cpf: " + cliente1.getCpf ());
	System.out.println(" + Rg: " + cliente1.getRg ());
	System.out.println(" - " + cliente1.devolver());
	
	
	cliente2.setNome("Maria clara");
	cliente2.setId("741-147");
	cliente2.setTelefone("(15) 56566-2332");
	cliente2.setCpf("878.545.212-99");
	cliente2.setRg("147852963-0");
	
	System.out.println("----- OBEJETO -----");	
	System.out.println(" + Nome: " + cliente2.getNome ());		
	System.out.println(" + Id: " + cliente2.getId ());
	System.out.println(" + Telefone: " + cliente2.getTelefone ());
	System.out.println(" + Cpf: " + cliente2.getCpf ());
	System.out.println(" + Rg: " + cliente2.getRg ());
	System.out.println(" - " + cliente2.pagar());
	

}
}
