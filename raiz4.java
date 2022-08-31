class raiz4 
{
	public static void main(String[] args) throws Exception
	{
		int x;
		 System.out.println("digite um valor: ");
		 x=JUtil.readInt();
		 while (x!=0)
		 {
			System.out.println("raiz quarta: "+Math.pow(x,4));

			 System.out.println("digite um valor: ");
			 x=JUtil.readInt();
		 }


	}
}
