package tareaTrivial;

public class CoresConsola {
	public enum CoresANSI {
		VERMELLO("\u001B[31m"),
		VERDE("\u001B[32m"),
		AMARELO("\u001B[33m"),
		AZUL("\u001b[34m"),
		RESET("\u001B[0m");
		
		private String cor;
		
		private CoresANSI (String cor) {
			this.cor = cor;
		}
		
		public String getCor () {
			return this.cor;
		}
	}
}
