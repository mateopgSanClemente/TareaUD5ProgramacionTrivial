package tareaTrivial;

public class Pregunta {
	//Atributos de clase
	/**
	 * Cadea de caracteres que conten o enunciado da pregunta
	 */
	private String enunciado;
	
	/**
	 * Array de Strings que contén todas as opcións dispoñibles para responder a pregunta
	 */
	private String [] opcion;
	
	/**
	 * Número enteiro que indica o íncide da opción correcta
	 */
	private int resposta;
	
	/**
	 * Constructor da clase Pregunta. Inicializa os atributos
	 * @param enunciado enunciado da pregunta.
	 * @param opcion Array de opcións dispoñibles para responder a pregunta.
	 * @param resposta número enteiro que indica o índice da opción correcta.
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
	 * Permite obter as opcións dunha pregunta pasándolle o índice como argumento
	 * @param indice
	 * @return opción seleccionada
	 */
	public String getOpcions (int indice) {
		//Validar o índice
		if (indice >= 0 && indice < this.opcion.length) {
			return this.opcion[indice];
		} else {
			throw new IndexOutOfBoundsException ("Erro: O índice " + indice + " non é válido.");
		}
	}
	
	/**
	 * Obtén o conxunto de opcións dunha pregunta.
	 * @return total de opcións dispoñibles.
	 */
	public String getOpcions () {
		String opcionesTotales = "";
		int indice = 1;
		for (String opcion : this.opcion) {
			opcionesTotales = opcionesTotales + "Opción " + indice + ": " + opcion + "\n";
			indice ++;
		}
		return opcionesTotales;
	}
	
	/**
	 * Retorna un número entero que se corresponde coa resposta correcta
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
	 * Determina se a resposta é ou non é correcta
	 * @param resposta
	 * @return true se a resposta é correcta ou false se non o é
	 */
	public boolean respostaCorrecta (int resposta) {
		if (resposta == this.resposta) {
			return true;
		} else {
			return false;
		}
	}
}
