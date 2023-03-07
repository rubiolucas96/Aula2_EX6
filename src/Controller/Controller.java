package Controller;

public class Controller {

	public Controller() {
 super();
 }
	public double somas (int n) {
		if (n == 1) {
			return 1;
			//condição de parada foi definida caso o n for igual a  1//
		}
		else {
			double x = 1 / fat(n);
			n = n - 1;
			//A relação da chamado, é quando o "n" não é igual a 1.  O método chama a si mesmo no "n-1". Depois é chamado o fat(n) para calcular o fatorial de "n" e armazena o resultado em fat.
			return  somas(n) + x   ;


}}
	public double fat(double n) {
		if (n == 1) {
			return 1;}
		else
			
		return n * fat(n - 1);
	}
}
