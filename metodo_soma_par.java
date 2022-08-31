class metodo_soma_par 
{
	public static int desmembrar(int x,int y){
	while (x!=0)
	{	
		if (x%2==0)
		{y=y+(x%10);};
		x=(x/10);
		
	}
	return(x+y);
	}
	
	
	public static void main(String[] args)throws Exception 
	{
		int x,y=0;
		System.out.println("soma dos digitos");
		System.out.println("digite um valor");
		x=JUtil.readInt();
		while (x!=0)
		{  
			
			System.out.println("soma dos numeros pares desmembrado: "+desmembrar(x,y));
			
		System.out.println("digite um valor");
		x=JUtil.readInt();
		}
		JUtil.pause();
	}
}
