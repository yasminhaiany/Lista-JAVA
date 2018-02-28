classe  pública Questao01 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		float salario =  0 , percentual_aumento =  0 ;
		
		Sistema . para fora . print ( " Informe seu salario (R $): " );
		salario = entrada . nextFloat ();
		
		Sistema . para fora . print ( " Informe o percentual de aumento (%): " );
		percentual_aumento = input . nextFloat ();
		
		salario = salario * ( 1.0f  + (percentual_aumento /  100.00f ));
		
		Sistema . para fora . printf ( " Novo salario: R $% .2% n " , salario);
		
		Sistema . para fora . printf ( " % nFim da execução.% n " );
		
		entrada . fechar();
	}
}
