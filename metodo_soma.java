class metodo_soma 
{
	public static int desmembrar(int x,int y){
	while (x!=0)
	{	y=y+(x%10);
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
			System.out.println("soma do numero desmembrado: "+desmembrar(x,y)+" os numeros foram: \n" +x);
			
		System.out.println("digite um valor");
		x=JUtil.readInt();
		}
		JUtil.pause();
	}
}
