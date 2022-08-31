class hipotenusa 
{
	public static void main(String[] args) throws Exception 
	{
		int y;
		float x;
		System.out.println("**calculo da media ->**");
		System.out.println("informe o primeiro valor: ");
		x=JUtil.readFloat();
		System.out.println("Informe o 2 valor:  ");
		y=JUtil.readInt();
		//System.out.println("o valor do cateto um: " + x + "e do 2 cateto eh: " + y + " e a hipotenusa eh: "+ Math.sqrt((x*x) + (y*y)) );
		System.out.println("o valor da media eh: "+ (x+y)/2);
		JUtil.pause ();
	}
}
