class q4aula03 
{
	public static void main(String[] args) throws Exception
	{
		double r,d,c,a;
		r=JUtil.readFloat();
		d=2*r;
		c=2*Math.PI*r;
		a=Math.PI*(r*r);
		System.out.println("diametro ="+d+"circunferencia = "+c+"area = "+a);
		JUtil.pause();



	}
}
