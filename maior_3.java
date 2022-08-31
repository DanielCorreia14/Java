class maior_3
{
	public static void main(String[] args) throws Exception
	{
		int x, y, z;
		System.out.println("digite um valor:");
		x=JUtil.readInt();
		System.out.println("digite um valor:");
		y=JUtil.readInt();
		System.out.println("digite um valor:");
		z=JUtil.readInt();
		while (x!=0)
		{
			System.out.println("maior eh: "+Math.max(x,Math.max(y,z)));
			System.out.println("digite um valor:");
			x=JUtil.readInt();
			System.out.println("digite um valor:");
			y=JUtil.readInt();
			System.out.println("digite um valor:");
			z=JUtil.readInt();
		}

		
		JUtil.pause();
	}
}
