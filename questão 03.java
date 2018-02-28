classe  pública Questao03 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		int tabuada =  0 ;
		
		enquanto ( verdadeiro ) {
			Sistema . para fora . printf ( " Qual tabuada exposition (-1 para parar)? " );
			tabuada = input . nextInt ();
			
			se (tabuada ==  - 1 ) {
				quebrar ;
			}
			
			para ( int i =  1 ; i <=  10 ; i ++ ) {
				Sistema . para fora . printf ( " % dx% d =% d% n " , tabuada, i, tabuada * i);
			}
			
			Sistema . para fora . println ();
		}
		
		Sistema . para fora . printf ( " % nEncerrado pelo Usuário.% n " );
		
		entrada . fechar();
	}
}