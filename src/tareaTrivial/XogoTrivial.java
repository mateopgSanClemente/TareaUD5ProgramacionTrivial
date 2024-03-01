package tareaTrivial;

import java.util.Scanner;

import tareaTrivial.CoresConsola.CoresANSI;

import java.util.Random;

public class XogoTrivial {
	//Atributos de clase
	/**
	 * Array de obxetos de tipo pregunta
	 */
	private Pregunta [] preguntas;
	
	/**
	 * Número enteiro que indica a puntuación do xogador
	 */
	private int puntuacion;
	
	
	private Scanner dato = new Scanner(System.in);
	/**
	 * Constructor da clase XogoTrivial
	 * @param preguntas Array de obxetos da clase Pregunta
	 */
	


	
	public XogoTrivial (Pregunta [] preguntas) {
		try {
			if (preguntas.length > 4 ) {
				this.preguntas = preguntas;
				this.puntuacion = 0;				
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e + "\nO argumento non é válido. Este debe ser un Array de obxetos de tipo Pregunta de mínimo 5 elementos.");
		}
	}
	
	//Getters
	public Pregunta[] getPreguntas () {
		return this.preguntas;
	}
	
	public int getPuntuacion () {
		return this.puntuacion;
	}
	
	//Setters
	public void setPreguntas (Pregunta [] preguntas) {
		this.preguntas = preguntas;
	}
	
	public void setPuntuacion (int puntuacion) {
		this.puntuacion = puntuacion;
	}

	/**
	 * Método pra xogar o trivial
	 */
	public void xogarTrivial () {
		//Mostrar preguntas e opcións ó usuario	
		int resposta;
		Random random = new Random ();
		boolean [] preguntasUtilizadas = new boolean [this.preguntas.length];
		for (int i = 0; i < this.preguntas.length; i++) {
			//Seleccionar la pregunta
			int indice;
			Pregunta pregunta;		
			do {
				indice = random.nextInt(this.preguntas.length);
				pregunta = this.preguntas[indice];

				if (!pregunta.getPreguntaRespondida()) {
					System.out.println(CoresANSI.AZUL.getCor() + pregunta.getEnunciado() + CoresANSI.RESET.getCor() + pregunta.getOpcions());
					System.out.println("Seleciona unha opción introducindo o número desta e pulsando ENTER:");
					resposta = dato.nextInt() - 1;
					if(pregunta.respostaCorrecta(resposta)) {
						this.puntuacion++;
						System.out.println(CoresANSI.VERDE.getCor()+"Resposta Correcta!\n");
					} else {
						System.out.println(CoresANSI.VERMELLO.getCor()+"Resposta Incorrecta!\n");
					}
					pregunta.setPreguntaRespondida(true);
				}

			} while (preguntasUtilizadas[indice]);
			preguntasUtilizadas[indice] = true;
		}
		System.out.println(CoresANSI.RESET.getCor()+"PUNTUACIÓN FINAL:\n" + CoresANSI.AMARELO.getCor()+puntuacion+"/"+this.preguntas.length);
		dato.close();
	}
	
	
	/**
	 * Imprime por consola un enunciado do array de instancias de tipo Pregunta, xunto co seu xogo de preguntas. Dalle o valor true a propiedade prguntaContestada.
	 */
	public void preguntaAzar () {
		//Generar entero aleatorio de máximo la longitud del Array de preguntas
		int numero = (int) (Math.random() * this.preguntas.length);
		Pregunta pregunta = this.preguntas[numero];
		System.out.println(CoresANSI.AZUL.getCor() + pregunta.getEnunciado() + CoresANSI.RESET.getCor() + pregunta.getOpcions());
		pregunta.setPreguntaRespondida(true);	
	}
}
