public class Questao02 {
	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		Scanner leitor = new Scanner(System.in);
		
		for(i = 1; i <= 10; i++){
			System.out.println("Digite um n�mero: ");
			num = leitor.nextInt();
			parOuImpar(num);
		}
		System.out.println("Fim da execu��o.");
		
		
		leitor.close();
	}
	
	public static void parOuImpar(int numero) {
		if(numero % 2 == 0)
			System.out.println("� par.");
		else
			System.out.println("� �mpar.");
	}
}