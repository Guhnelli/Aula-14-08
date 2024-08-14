package Aula_14_08;

public class Dados {

	String id;        
	String nome;      
	String telefone;  // declaração das variaveis
	String cpf;
	String rg;

	public String getId() {  //  public String= receber valor get= exibir/retornar valor
		return id;           // encerra a execução de uma função
	}
	public void setId(String id) {  //usada para indicar que o método "main"
		this.id = id;        // aponta para o objeto para o qual a função de membro é chamada
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String pagar() {
		return "pagar";
	}
	public String devolver() {
		return "devolver";
	}
	public String assinarCartao() {
		return "assinar o cartão da loja";
	}
	public String reclemar() {
		return "reclamar";
	}
	public String entrarEmContato() {
		return "Entrar em contato com a loja";
	}
	public String testar() {
		return "testar";
	}

}
