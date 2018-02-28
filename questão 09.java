classe  pública Questao09 {
	public  static  void  main ( String [] args ) {
		Scanner entrada =  novo  Scanner ( Sistema . Na);
		String nome_paciente =  " vazio " ;
		String sexo_paciente =  " vazio " ;
		flutuar peso_paciente =  0.0f ;
		flutuador altura_paciente =  0.0f ;
		int idade_paciente =  0 ;
		int cantidad_pacientes =  0 ;
		float media_idade_homens =  0.0f ;
		int soma_idade_homens =  0 ;
		int quantidade_homens =  0 ;
		int cantidad_mulheres_faixa =  0 ;
		int cantidad_faixa_idade =  0 ;
		int idade_paciente_mais_velho =  0 ;
		String nome_paciente_mais_velho =  " vazio " ;
		flutuador altura_menor_mulher =  3.0f ;
		String nome_mulher_mais_baixa =  " vazio " ;
		
		enquanto ( ! nome_paciente . equals ( " fim " )) {
			Sistema . para fora . imprimir ( " Nome do paciente ou 'fim' para parar: " );
			nome_paciente = entrada . nextLine ();
			
			se (nome_paciente . igual ( " fim " )) {
				Sistema . para fora . printf ( " % n-> Encerrado pelo Usuário <-% n " );
				quebrar ;
			} 
			else {
				Sistema . para fora . imprimir ( " Sexo do paciente (m ou f): " );
				sexo_paciente = entrada . nextLine ();
				
				Sistema . para fora . impressão ( " Peso do paciente" (kg): " );
				peso_paciente =  flutuador . parseFloat (entrada . nextLine ());
				
				Sistema . para fora . impressão ( " Altura do paciente (m): " );
				altura_paciente =  Float . parseFloat (entrada . nextLine ());
				
				Sistema . para fora . print ( " Idade do paciente: " );
				idade_paciente =  Inteiro . parseInt (input . nextLine ());
				
				++ quantity_pacientes;
			}
			
			se (sexo_paciente . for igual ( " m " )) {
				++ quantidade_homens;
				
				soma_idade_homens = soma_idade_homens + idade_paciente;
				
				media_idade_homens = soma_idade_homens / quantidade_homens;
				
			} else { // mulheres:
				
				se (altura_paciente < altura_menor_mulher) {
					altura_menor_mulher = altura_paciente;
					
					nome_mulher_mais_baixa = nome_paciente;
				}
				
				se (altura_paciente >  1.6  && altura_paciente <  1.7  && peso_paciente >  70.0 ) {
					++ quantity_mulheres_faixa;
				}
				
			}
			
			se (idade_paciente >  18  && idade_paciente <  25 ) {
				++ quantity_faixa_idade;
			}
			
			se (idade_paciente > idade_paciente_mais_velho) {
				idade_paciente_mais_velho = idade_paciente;
				
				Nome_paciente_mais_velho = nome_paciente;
			
			}
			
			Sistema . para fora . println ();
		}
		
		Sistema . para fora . printf ( " % n ################# RELATÓRIO #################% n " );
		Sistema . para fora . printf ( " Quantidade de pacientes:% d% n " , quantidade_pacientes);
		Sistema . para fora . printf ( " Média de idade dos homens:% .1f% n " , media_idade_homens);
		Sistema . para fora . printf ( " Quantidade de mulheres entre 1,60 e 1,70 de altura e mais de 70 kg:% d% n " , quantidade_mulheres_faixa);
		Sistema . para fora . printf ( " Quantidade de pessoas entre 18 e 25 anos de idade:% d% n " , quantidade_faixa_idade);
		Sistema . para fora . printf ( " Nome do paciente mais velho:% s% n " , nome_paciente_mais_velho);
		Sistema . para fora . printf ( " Nome da mulher mais baixa:% s% n " , nome_mulher_mais_baixa);
				
		entrada . fechar();
	}	
}