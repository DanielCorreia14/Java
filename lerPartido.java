class lerPartido 
{
	public static void main(String[] args) throws Exception
	{	float soma=0;
		int imaior=0,imenor=999;
		String nomem="";
		String nomema="";
		System.out.println("Leitura de Partidos");
		System.out.println("Quantos partidos? ");
		Partido n [] = new Partido[JUtil.readInt()];//declaracao e instancia
		float assinaturasminima;
		System.out.println("\ncadastro de "+n.length +" partidos\n");
		System.out.println("informa a quantidade de assinaturas minima: ");
		assinaturasminima = JUtil.readFloat();
		for (int i=0;i<n.length ;i++ )
		{	
			n[i] = new Partido();
			System.out.println("Qual a descricao/nome do "+(i+1)+" partido?");
			n[i].descricao = JUtil.readString();
			System.out.println("Qual o nome do presidente do "+(i+1)+" partido?");
			n[i].presidente = JUtil.readString();
			System.out.println("Quantos filiados do "+(i+1)+" partido?");
			n[i].filiados = JUtil.readInt();
			System.out.println("Quantas assinaturas do "+(i+1)+" partido?");
			n[i].assinaturas = JUtil.readFloat();
			n[i].codigo=i+1;
			//System.out.println((n[i].aprovado())? "aprovado":"desclassificado");
			//System.out.println((n[i].aprovado(assinaturasminima))? "aprovado":"desclassificado");

		}//for
		 
		 System.out.println("Dados dos partidos");
		 
		 System.out.println("\tItem Codigo Descricao Presidente   Filiados  Assinaturas     Aprovado    Classificacao");
		 
		 for (int i=0;i<n.length ;i++ )
		 {
			//n[i].mostrarDados();
			System.out.println("\t"+(i+1)+ "\t" +n[i].codigo + "\t"+n[i].descricao+ "\t" +
			n[i].presidente+"    \t" +n[i].filiados+" \t"+n[i].assinaturas+"     \t"+
				((n[i].aprovado(assinaturasminima))?"Sim":"Nao")+//((n[i].aprovado()?"Sim":""))+
				"   \t"+n[i].classificacao(assinaturasminima));
			if (n[i].aprovado(assinaturasminima))
			{
				soma+= n[i].filiados;
			}
			if (n[i].filiados>imaior)
			{
				imaior =n[i].filiados;
				nomema=n[i].descricao;
			}
			if (n[i].filiados<imenor &&n[i].aprovado(assinaturasminima))
			{
				imenor =n[i].filiados;
				nomem=n[i].descricao;

			}
		


			
		JUtil.pause();

	}
	 System.out.println("\n Soma dos filiados dos partidos\nAprovados : "+soma+"\nPartido com maior numero de filiacao\n "+nomema+" com " +imaior+" \nPartido Aprovado com Menor numero de filiacao foi o: "+nomem+" com "+imenor);

	

	





	}//main
}//class
