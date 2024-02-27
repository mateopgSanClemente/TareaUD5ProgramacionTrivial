package tareaTrivial;

public class Pregunta {
	//Atributos de clase
	/**
	 * Cadea de caracteres que conten o enunciado da pregunta
	 */
	private String enunciado;
	
	/**
	 * Array de Strings que cont�n todas as opci�ns dispo�ibles para responder a pregunta
	 */
	private String [] opcion;
	
	/**
	 * N�mero enteiro que indica o �ncide da opci�n correcta
	 */
	private int resposta;
	
	/**
	 * Constructor da clase Pregunta. Inicializa os atributos
	 * @param enunciado enunciado da pregunta.
	 * @param opcion Array de opci�ns dispo�ibles para responder a pregunta.
	 * @param resposta n�mero enteiro que indica o �ndice da opci�n correcta.
	 */
	public Pregunta (String enunciado, String [] opcion, int resposta) {
		this.enunciado = enunciado;
		this.opcion = opcion;
		this.resposta = resposta;
	}
	
	//GETTERS
	/**
	 * 
	 * @return String pregunta
	 */
	public String getEnunciado () {
		return this.enunciado;
	}
	
	/**
	 * Permite obter as opci�ns dunha pregunta pas�ndolle o �ndice como argumento
	 * @param indice
	 * @return opci�n seleccionada
	 */
	public String getOpcions (int indice) {
		//Validar o �ndice
		if (indice >= 0 && indice < this.opcion.length) {
			return this.opcion[indice];
		} else {
			throw new IndexOutOfBoundsException ("Erro: O �ndice " + indice + " non � v�lido.");
		}
	}
	
	/**
	 * Obt�n o conxunto de opci�ns dunha pregunta.
	 * @return total de opci�ns dispo�ibles.
	 */
	public String getOpcions () {
		String opcionesTotales = "";
		int indice = 1;
		for (String opcion : this.opcion) {
			opcionesTotales = opcionesTotales + "Opci�n " + indice + ": " + opcion + "\n";
			indice ++;
		}
		return opcionesTotales;
	}
	
	/**
	 * Retorna un n�mero entero que se corresponde coa resposta correcta
	 * @return resposta correcta
	 */
	public int getResposta () {
		return this.resposta;
	}
	
	//SETTERS	
	public void setEnunciado (String enunciado) {
		this.enunciado = enunciado;
	}
	
	public void setOpcion (String [] opcion) {
		this.opcion = opcion;
	}
	
	public void setResposta (int resposta) {
		this.resposta = resposta;
	}
	
	/**
	 * Determina se a resposta � ou non � correcta
	 * @param resposta
	 * @return true se a resposta � correcta ou false se non o �
	 */
	public boolean respostaCorrecta (int resposta) {
		if (resposta == this.resposta) {
			return true;
		} else {
			return false;
		}
	}
}
