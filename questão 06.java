classe  p�blica Questao06 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		flutuar salario_funcionario =  0.0f ;
		float valor_prestacao =  0.0f ;
		
		Sistema . para fora . print ( " Informe seu sal�rio: R $ " );
		salario_funcionario = input . nextFloat ();
		
		Sistema . para fora . print ( " Informe o valor da prestacao: R $ " );
		valor_prestacao = entrada . nextFloat ();
		
		se (valor_prestacao / salario_funcionario <  0.3 ) {
			Sistema . para fora . println ( " Empr�stimo concedio!: o) " );
		} else {
			Sistema . para fora . println ( " Empr�stimo N�O concedido; o ( " );
		}
		
		Sistema . para fora . printf ( " % nFim da execu��o% n " );
		
		entrada . fechar();
	}
}
