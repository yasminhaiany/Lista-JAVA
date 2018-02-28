public class RespostaQ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabu = 0;
		
		while(true){
			System.out.println("Qual tabuada você quer? (Digite -1 para parar)?");
			tabu = input.nextInt();
			
			if(tabu == -1){
				break;
				
			}
			
			for (int i = 1; i<=10; i++){
				System.out.printf("%d x %d = %d%n", tabu, i, tabu * i);
				
			}
			
			System.out.println();
		}
		
		System.out.println("%ntUsuário terminou.%n");
		
		input.close();
	}
}