class meses 
{
	public static int conta(int x){
		if(x%12==0){
		x=0;
		}else{
		x=x%12;
		}
			
			return(x);
	}	
	public static int conta1(int x){
	if (x>=12||x%12==0)
	{ 
			x=x/12;
	}	
	return(x);

	}
	public static void main(String[] args) throws Exception
	{
		int ano=0,mes;
		System.out.println("Contagem de anos!");
		System.out.println("digite a quantidade de meses: ");
		mes=JUtil.readInt();
		while (mes!=0)
		{
		

		System.out.println("equivale a "+conta(mes)+"meses e "+ conta1(ano)) ;



		System.out.println("digite a quantidade de meses: ");
		mes=JUtil.readInt();
		}
	}
}
