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
        preguntas[0] = new Pregunta("�C�l � a capital de Espa�a?", opciones1, 0);
        preguntas[1] = new Pregunta("�C�l � a cor do ceo?", opciones2, 1);
        preguntas[2] = new Pregunta("�C�ntos lados ten un tri�ngulo?", opciones3, 1);
        preguntas[3] = new Pregunta("�C�l � a cor dun sem�foro vermello?", opciones4, 0);
        preguntas[4] = new Pregunta("�C�ntos d�as ten a semana?", opciones5, 2);
        
        //Instancia de XogoTrivial
        XogoTrivial xogo = new XogoTrivial(preguntas);
        
        //PROBA DO XOGO
        //xogo.xogarTrivial();
        xogo.xogarTrivial();
    
	}
}


