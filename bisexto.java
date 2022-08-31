class bisexto
{
	public static boolean bisexto(int x){  
	return(x%4==0 && x%100==0 &&x%400==0);
	
	}
	public static void main(String[] args)throws Exception
	{
		int ano;
		System.out.println("Ano bisexto!");
		System.out.println("informe um ano: ");
		ano=JUtil.readInt();
		while (ano!=0)
		{
			System.out.println("o ano: "+ (bisexto(ano) ? "eh bisexto":"n eh bisexto"));
			
			System.out.println("informe um ano: ");
			ano=JUtil.readInt();
		}
	}
}
