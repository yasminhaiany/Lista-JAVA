classe  p�blica Questao04 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		Questao04Funcionario [] funcion�rios =  novo  Questao04Funcion�rio [ 5 ];
		String nome_verificador =  " " ;
		flutuante percentual_aumento =  0.2f ;
		�ndice int =  0 ;
		int quantity_funcionarios =  3 ;
		
		enquanto (�ndice < quantidade_funcion�rios) {
			funcion�rios [�ndice] =  novo  Questao04Funcionario ();
			
			Sistema . para fora . printf ( " Informe o nome do funcion�rio ou 'fim' para parar: " , �ndice +  1 );
			nome_verificador = entrada . nextLine ();
			
			se (nome_verificador . igual ( " fim " )) {
				Sistema . para fora . printf ( " % nEncerrado pelo Usu�rio.% n " );
				quebrar ;
			}
			
			funcion�rios [�ndice] . setNome (nome_verificador);
			
			Sistema . para fora . printf ( " Informe o salario do (a)% s: R $ " , funcion�rios [�ndice] . getNome ());
			funcion�rios [�ndice] . setSalario ( Float . parseFloat (entrada . nextLine ())); // recebe como String e converte para Float. Evita problema c / buffer
			
			se (funcion�rios [�ndice] . getSalario () <  500 ) {
				funcion�rios [�ndice] . setSalario (funcion�rios [�ndice] . getSalario () + (funcion�rios [�ndice] . getSalario () * percentual_aumento));
				
				Sistema . para fora . printf ( " % n # Novo sal�rio do (a)% s: R $% .2f #% n% n " , funcion�rios [�ndice] . getNome (), funcion�rios [�ndice] . getSalario ());
			} else {
				Sistema . para fora . printf ( " % n->% s n�o tem direito ao aumento. <-% n% n " , funcion�rios [�ndice] . getNome ());
			}
			
			�ndice ++ ;
		}
		
		�ndice =  0 ;
		
		Sistema . para fora . println ( " ################ RELAT�RIO ############### " );
		enquanto (�ndice < quantidade_funcion�rios) {
			funcion�rios [�ndice] . relatorioFuncion�rio (�ndice);
			�ndice ++ ;
		}
		
		Sistema . para fora . printf ( " % nFim da execu��o.% n " );
		
		entrada . fechar();
	}	
	
}
	}
}
