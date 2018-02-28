classe  pública Questao04 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		Questao04Funcionario [] funcionários =  novo  Questao04Funcionário [ 5 ];
		String nome_verificador =  " " ;
		flutuante percentual_aumento =  0.2f ;
		índice int =  0 ;
		int quantity_funcionarios =  3 ;
		
		enquanto (índice < quantidade_funcionários) {
			funcionários [índice] =  novo  Questao04Funcionario ();
			
			Sistema . para fora . printf ( " Informe o nome do funcionário ou 'fim' para parar: " , índice +  1 );
			nome_verificador = entrada . nextLine ();
			
			se (nome_verificador . igual ( " fim " )) {
				Sistema . para fora . printf ( " % nEncerrado pelo Usuário.% n " );
				quebrar ;
			}
			
			funcionários [índice] . setNome (nome_verificador);
			
			Sistema . para fora . printf ( " Informe o salario do (a)% s: R $ " , funcionários [índice] . getNome ());
			funcionários [índice] . setSalario ( Float . parseFloat (entrada . nextLine ())); // recebe como String e converte para Float. Evita problema c / buffer
			
			se (funcionários [índice] . getSalario () <  500 ) {
				funcionários [índice] . setSalario (funcionários [índice] . getSalario () + (funcionários [índice] . getSalario () * percentual_aumento));
				
				Sistema . para fora . printf ( " % n # Novo salário do (a)% s: R $% .2f #% n% n " , funcionários [índice] . getNome (), funcionários [índice] . getSalario ());
			} else {
				Sistema . para fora . printf ( " % n->% s não tem direito ao aumento. <-% n% n " , funcionários [índice] . getNome ());
			}
			
			índice ++ ;
		}
		
		índice =  0 ;
		
		Sistema . para fora . println ( " ################ RELATÓRIO ############### " );
		enquanto (índice < quantidade_funcionários) {
			funcionários [índice] . relatorioFuncionário (índice);
			índice ++ ;
		}
		
		Sistema . para fora . printf ( " % nFim da execução.% n " );
		
		entrada . fechar();
	}	
	
}
	}
}
