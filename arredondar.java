class arredondar
{
	public static void main(String[] args) throws Exception
	{
		float x;
		System.out.println("digite um valor: ");
		x=JUtil.readFloat();
		while (x!=0)
		{
			
			System.out.println(Math.round(x));
		System.out.println("digite um valor: ");
		x=JUtil.readFloat();

		}
	}
}
