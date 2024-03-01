package tareaTrivial;

import tareaTrivial.CoresConsola.CoresANSI;

public class Xogar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear las opciones para cada pregunta
        String[] opciones1 = {"Madrid", "Barcelona", "Yugoslavia"};
        String[] opciones2 = {"Blanco", "Azul", "Negro"};
        String[] opciones3 = {"40", "3", "1"};
        String[] opciones4 = {"Rojo", "Verde", "Cuadrado"};
        String[] opciones5 = {"0", "Infinitos", "7"};

        // Crear un array de 5 objetos de tipo Pregunta
        Pregunta[] preguntas = new Pregunta[5];

        // Inicializar cada objeto con el constructor de la clase Pregunta
        preguntas[0] = new Pregunta("¿Cuál es la capital de España?", opciones1, 0);
        preguntas[1] = new Pregunta("¿Cuál es el color del cielo?", opciones2, 1);
        preguntas[2] = new Pregunta("¿Cuántos lados tiene un triángulo?", opciones3, 1);
        preguntas[3] = new Pregunta("¿Cuál es el color de un semáforo en rojo?", opciones4, 0);
        preguntas[4] = new Pregunta("¿Cuántos días tiene la semana?", opciones5, 2);
        
        //Cores
        CoresConsola cores = new CoresConsola ();
        //Instancia de XogoTrivial
        XogoTrivial xogo = new XogoTrivial(preguntas, cores);
        
        System.out.println(CoresANSI.VERDE.getCor() + "Hola como están muchachos!");
        System.out.println(preguntas[0].getOpcions());
        System.out.println(xogo.getPreguntas());
        //PROBA DO XOGO
        xogo.xogarTrivial();
        
    
	}
}


