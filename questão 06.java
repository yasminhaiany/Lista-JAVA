classe  pública Questao06 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		flutuar salario_funcionario =  0.0f ;
		float valor_prestacao =  0.0f ;
		
		Sistema . para fora . print ( " Informe seu salário: R $ " );
		salario_funcionario = input . nextFloat ();
		
		Sistema . para fora . print ( " Informe o valor da prestacao: R $ " );
		valor_prestacao = entrada . nextFloat ();
		
		se (valor_prestacao / salario_funcionario <  0.3 ) {
			Sistema . para fora . println ( " Empréstimo concedio!: o) " );
		} else {
			Sistema . para fora . println ( " Empréstimo NÃO concedido; o ( " );
		}
		
		Sistema . para fora . printf ( " % nFim da execução% n " );
		
		entrada . fechar();
	}
}
