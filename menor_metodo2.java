class  menor_metodo2
{
	public static void main(String[] args) throws Exception
	{
		int x,y;
		System.out.println("digite um valor: ");
		x=JUtil.readInt();
		System.out.println("digite um valor: ");
		y=JUtil.readInt();
		while (x!=0)
		{
			System.out.println("menor: "+Math.min(x,y));
			System.out.println("digite um valor: ");
			x=JUtil.readInt();
			System.out.println("digite um valor: ");
			y=JUtil.readInt();

		}
		
	}
}
