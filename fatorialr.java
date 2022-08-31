class fatorialr
{	public static fator(int x){
	if(x==0){
	return 1;
	
	}	
return (x*fator(x-1));
}


	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello World!");
	}
}

