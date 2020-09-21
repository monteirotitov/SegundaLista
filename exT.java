
public class exT {
	
	public static void main(String[] args) {

        double alturaM = 0.01;

        double alturaF = 0.01;

        int flag = 1;

        

        while (flag == 1) {            

            String sexo = JOptionPane.showInputDialog("Informe o sexo:");

            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura (Digite 0 para sair): ")); 

            if(altura == 0 ) {

                JOptionPane.showMessageDialog(null, "Encerrando programa.");

                flag = 0;

            }else {

                if("M".equals(sexo)) {

                if(altura > alturaM){

                    alturaM = altura;

                }

            }else {

                if(altura > alturaF){

                    alturaF = altura;

                }

            }

            }

        }

        

        System.out.println("O homem com maior altura possui: " + alturaM + " metros" );

        System.out.println("A mulher com maior altura possui: " + alturaF + " metros" );



    }

}
