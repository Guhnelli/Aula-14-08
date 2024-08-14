package Aula_14_08;

public class cadeira {

	String modelo;
	String cor;
	String cod;
	String tecido;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String andar() {
		return "andar";
	}
	public String girar() {
		return "girar";
	}
}
