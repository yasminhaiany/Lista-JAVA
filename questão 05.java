classe  pública Questao05 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		int litros_gasolina =  0 ;
		int quantidade_refrigerantes =  2 ;
		float valor_total_gasolina =  0.0f ;
		float valor_total_refri =  0.0f ;
		float total_conta =  0.0f ;
		
		Sistema . para fora . print ( " Informe a quantity litros de gasolina: " );
		litros_gasolina = entrada . nextInt ();
		
		valor_total_gasolina = ( float ) (litros_gasolina *  2.50 );
		
		valor_total_refri = ( flutuante ) (quantidade_refrigerantes *  3.00 );
		
		total_conta = valor_total_gasolina + valor_total_refri;
		
		Sistema . para fora . printf ( " % n ### Detalhamento da conta ###% n " );
		Sistema . para fora . printf ( " + Gasolina:% d litros * R $ 2,50 = R $% .2f% n " , litros_gasolina, valor_total_gasolina);
		Sistema . para fora . printf ( " + Refrigerante:% d und * R $ 3,00 = R $% .2f% n " , quantidade_refrigerantes, valor_total_refri);
		Sistema . para fora . printf ( " = Total da conta: R $% .2f% n " , total_conta);
		
		entrada . fechar();
	}
}