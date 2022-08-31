class investimentop 
{
	public static float conta(float x,float y,int z){
		
	return(float)(x*Math.pow(1+y/100f,z) );
	
	}
	public static void main(String[] args)throws Exception 
	{
		
		float p,r;
		int n;
		System.out.println("investimento");
		System.out.println("digite um valor investido: ");
		p=JUtil.readInt();
		
		while (p!=0)
		{
		System.out.println("informe a taxa de juros (em %):");
		r=JUtil.readInt();
		System.out.println("digite a quantidade de meses:");
		n=JUtil.readInt();
		
		System.out.println("montante: " + conta(p,r,n));

		System.out.println("digite um valor investido: ");
		p=JUtil.readInt();
		}

	
	
	}
}
