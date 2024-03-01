package tareaTrivial;

public class Xogar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear las opciones para cada pregunta
        String[] opciones1 = {"Madrid", "Barcelona", "Yugoslavia"};
        String[] opciones2 = {"Blanco", "Azul", "Negro"};
        String[] opciones3 = {"40", "3", "1"};
        String[] opciones4 = {"Vermello", "Verde", "Cadrado"};
        String[] opciones5 = {"0", "Infinitos", "7"};

        // Crear un array de 5 objetos de tipo Pregunta
        Pregunta[] preguntas = new Pregunta[5];

        // Inicializar cada objeto con el constructor de la clase Pregunta
        preguntas[0] = new Pregunta("¿Cál é a capital de España?", opciones1, 0);
        preguntas[1] = new Pregunta("¿Cál é a cor do ceo?", opciones2, 1);
        preguntas[2] = new Pregunta("¿Cántos lados ten un triángulo?", opciones3, 1);
        preguntas[3] = new Pregunta("¿Cál é a cor dun semáforo vermello?", opciones4, 0);
        preguntas[4] = new Pregunta("¿Cántos días ten a semana?", opciones5, 2);
        
        //Instancia de XogoTrivial
        XogoTrivial xogo = new XogoTrivial(preguntas);
        
        //PROBA DO XOGO
        //xogo.xogarTrivial();
        xogo.xogarTrivial();
    
	}
}


