
public class exercicioJ {

	public static void main(String[] args) {
int [] idades = new int[10];

        

        for (int i = 0; i < idades.length; i++) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do paciente: "));

            idades[i] = idade;

        }

        int idadeMax = 0;

        int idadeMin = idades[0];

        

        for (int idade : idades) {

            if(idade > idadeMax){

                idadeMax = idade;

            }

            if(idade < idadeMin){

                idadeMin = idade;

            }

        }

        System.out.println("O paciente mais velho tem: " + idadeMax);

        System.out.println("O paciente mais novo tem: " + idadeMin);

	}

}
