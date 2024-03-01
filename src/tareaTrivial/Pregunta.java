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
	
	private boolean preguntaRespondida;
	
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
		this.preguntaRespondida = false;
	}
	
	//GETTERS
	/**
	 * 
	 * @return String pregunta
	 */
	public String getEnunciado () {
		return this.enunciado + "\n";
	}
	
	/**
	 * Permite obter as opcións dunha pregunta pasándolle o índice como argumento
	 * @param indice
	 * @return opción seleccionada
	 */
	public String getOpcions (int indice) {
		//Validar o índice
		try {
			if (indice >= 0 && indice < this.opcion.length)
				return this.opcion[indice];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage() + "\nO índice " + indice + " está fora do rango do array. O índice introducido como argumento debe atoparse entre 0 e " + opcion.length + ".");
		}
		return "O índice introducido non é válido";
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
	/**
	 * Retorna un valor booleano que indica se a pregunta foi respondida ou non
	 * @return true se a pregunta foi respondida, false se non o foi
	 */
	public boolean getPreguntaRespondida () {
		return this.preguntaRespondida;
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
	
	public void setPreguntaRespondida (boolean preguntaRespondida) {
		this.preguntaRespondida = preguntaRespondida;
	}
	//MÉTODOS DA CLASE
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
