class angulo
{
	public static void main(String[] args) throws Exception
	{
		double a;
		
		System.out.println("digite o angulo: ");
		a=JUtil.readDouble();
		while (a!=0)
		{
			System.out.println("seno: "+Math.sin(a));
			System.out.println("cosseno: "+Math.cos(a));
			System.out.println("tangente: "+Math.tan(a));
					System.out.println("digite o angulo: ");
		a=JUtil.readDouble();

		}
		
	}
}
