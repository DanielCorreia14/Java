class LerPessoas   //public funçãoA(String parametro)
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Cadastrar Pessoas ");
		System.out.println("Quantas pessoas? ");
		Humano pessoas [] = new Humano [JUtil.readInt()];//declaracao e instancia
		int imaior,imenor,inumero;
		String cnome;
		float fsoma;
		System.out.println("Cadastra "+pessoas.length+"pessoas !\n");
		fsoma = 0;
		imaior = 0;
		imenor = 999;
		for (int i=0;i<pessoas.length ;i++ )
		{

			pessoas[i] = new Humano();
			System.out.print("\n Qual o nome " +(i+1) +"? ");
			pessoas[i].nome = JUtil.readString();
			System.out.print("\n Qual a idade "+(i+1) +"?");
			pessoas[i].idade= JUtil.readInt();
			System.out.print("\n Qual o fone " +(i+1) +"? ");
			pessoas[i].fone = JUtil.readString();
			fsoma+=pessoas[i].idade;
			imaior = (pessoas[i].idade>imaior)? pessoas[i].idade : imaior;
			imenor = (pessoas[i].idade <imenor) ?pessoas[i].idade : imenor;

		}
		
		System.out.println ("\n Dados em Ordem crescente \n");
		for (int i= 0;i<pessoas.length  ;i++ )
		{
		System.out.println("\n"+(i+1)+ "nome - " +pessoas[i].nome + ", idade - " +pessoas[i].idade+ "fone - " +pessoas[i].fone+"ano nascimento " +pessoas[i].anoNascimento() );}
		JUtil.pause();
		System.out.println("\n\n Dados matematicos \n");
		System.out.println("\n A soma das idades eh "+fsoma);
		if (pessoas.length>0)
		{
			System.out.println("\n A media das idades eh "+(fsoma/(float)pessoas.length ));
		}
		
		System.out.println("\n A maior idade eh "+imaior);
		System.out.println("\n A menor idade eh "+imenor);
		JUtil.pause();
		/*System.out.println("dados em ordem decrescente: ");
		for (int i= acnome.length-1;i>=0 ;i-- )
		{
		System.out.println("\n"+(i+1)+ "nome - " +acnome[i] + ", idade - " +aiidade[i]);}
		JUtil.pause();
		System.out.println("\n \n os cadastrados com idades entre 10 e 40 anos");
		for (int i =0;i<MAXIMO ;i++ )
		{
			if ((aiidade[i] >=10)&& (aiidade[i]<=40))
			{
				System.out.println("\n "+(i+1) + ":nome - " +acnome[i]+", idade - "+aiidade[i]);}}
				JUtil.pause();
			System.out.println("\n \n Pesquisa por codigo \n ");
			System.out.println("\n Qual o numero ?");
			inumero = JUtil.readInt();
			while (inumero!=0)
			{if ((1<=inumero)&&(inumero<=MAXIMO))
			{System.out.println("\n O correspondente ao numero " +inumero +" e "+acnome[inumero-1]);
			}else{
				System.out.println("\n Numero invalido. Digite outro. \n");}
				System.out.println("Qual o numero ?");
				inumero = JUtil.readInt();
				System.out.println("\nPesquisa por nome(digite 'fim' para sair) \n");
				System.out.println("\n Qual o nome ?");
				cnome = JUtil.readString();
				while (!cnome.equals("fim"))
				{inumero = 0;
				while ((inumero<MAXIMO)&&(!acnome[inumero].equals(cnome)))
				{
					inumero++;
				}
				if (inumero == MAXIMO)
				{System.out.println("\n Nao achei !");
				}else{
				System.out.println("\n "+cnome+ " e o elemento "+ (inumero+1));}

				System.out.println ("\n Qual o nome? ");
				cnome=JUtil.readString();
				}
			}
*/
	}
}
