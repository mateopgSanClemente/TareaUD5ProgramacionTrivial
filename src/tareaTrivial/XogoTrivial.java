package tareaTrivial;

import tareaTrivial.CoresConsola.CoresANSI;

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
	
	/**
	 * Constructor da clase XogoTrivial
	 * @param preguntas Array de obxetos da clase Pregunta
	 */
	public XogoTrivial (Pregunta [] preguntas, CoresConsola cor) {
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
	public void xogarTrivial () {
		//Mostrar pregunta e opcións ó usuario
		for (Pregunta p : getPreguntas()) {
		System.out.println(CoresANSI.AZUL.getCor()+ p.getEnunciado() + "\n" + p.getOpcions());
		}
	}
	
	
	
	
	
	
	
}
