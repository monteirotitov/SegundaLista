
public class exS {

	public static void main(String[] args) {

        double [] notas = new double[5];

        

        for (int i = 0; i < notas.length; i++) {

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota: "));

            notas[i] = nota;

        }

            double maiorNota = 0;

        

        for (double nota : notas) {

            if(nota > maiorNota){

                maiorNota = nota;

            }

        }

        

        System.out.println("A maior nota é: " + maiorNota);

    }
	
	
}
