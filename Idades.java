class LerPessoas 
{
	public static void main(String[] args) throws Exception
	{
		final int MAXIMO = 5;
		String acnome [] = new String [MAXIMO];
		int aiidade[] = new int [MAXIMO];
		int imaior,imenor,inumero;
		String cnome;
		float fsoma;
		System.out.println("Cadastra "+MAXIMO+"pessoas !\n");
		fsoma = 0;
		imaior = 0;
		imenor = 999;
		for (int i=0;i<MAXIMO ;i++ )
		{
			System.out.print("\n Qual o nome " +(i+1) +"? ");
			acnome[i] = JUtil.readString();
			System.out.print("\n Qual a idade "+(i+1) +"?");
			aiidade[i] = JUtil.readInt();
			fsoma+=aiidade[i];
			imaior = (aiidade[i]>imaior)? aiidade[i] : imaior;
			imenor = (aiidade[i] <imenor ) ?aiidade [i] : imenor;

		}
		System.out.println ("\n Dados em Ordem crescente \n");
		for (int i= 0;i<MAXIMO ;i++ )
		{
		System.out.println("\n"+(i+1)+ "nome - " +acnome[i] + ", idade - " +aiidade[i]);}
		JUtil.pause();
		System.out.println("\n\n Dados matematicos \n");
		System.out.println("\n A soma das idades eh "+fsoma);
		System.out.println("\n A media das idades eh "+(fsoma/(float)MAXIMO));
		System.out.println("\n A maior idade eh "+imaior);
		System.out.println("\n A menor idade eh "+imenor);
		JUtil.pause();
		System.out.println("dados em ordem decrescente: ");
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

	}
}
