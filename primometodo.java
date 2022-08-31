class primometodo
{
	public static boolean ehPrimo(int n){
	 return(n%2==1);
	}public static boolean ehPrimoo(int n){
	 return(n%1==0);
	}
	public static void main(String[] args) throws Exception
	{
		int x;
		System.out.println("primo!");
		System.out.println("Digite um valor: ");
		x=JUtil.readInt();
		while (x!=0)
		{
			System.out.println("numero "+ (ehPrimo(x) && ehPrimoo(x)? "eh primo":"n eh primo"));
			
			System.out.println("Digite um valor: ");
		x=JUtil.readInt();

		}

	}
}
