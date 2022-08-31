class inverso
{
	public static String inverso(int x){
	return(1+"/"+x);
	}
	
	public static void main(String[] args) throws Exception 
	{
		 int n;
		System.out.println("Inverso");
		System.out.println("digite um valor: ");
		n=JUtil.readInt();
		while (n!=0)
		{
			System.out.println("inverso: "+inverso(n));
			System.out.println("digite um valor: ");
		n=JUtil.readInt();
		}
		JUtil.pause();
	}
}
