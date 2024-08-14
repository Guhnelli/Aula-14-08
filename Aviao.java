package Aula_14_08;

public class Aviao {

	
		String modelo;
		String cor;
		String agencia;
		String marca;
		
		
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
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String voar() {
			return "voando";
		}
		public String pousar() {
			return "pousar";
		}
		public String planar() {
			return "plando";
		}

	}


