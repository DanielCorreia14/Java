class  nnumeros
{
	public static void main(String[] args) throws Exception
	{
		int n,c=0;
		System.out.println("digite um valor");
		n=JUtil.readInt();
		
		while (n!=0) 
		{
			System.out.println("digite um valor: \n");
			n=JUtil.readInt();
			
			System.out.println("n = "+n+"c= "+c+"\n"+" maior eh: "+Math.max(n,c)+" menor eh:"+Math.min(n,c));
			c=n;	

		}
	}
}
