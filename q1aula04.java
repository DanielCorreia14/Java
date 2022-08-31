class q1aula04 
{
	public static void main(String[] args) throws Exception
	{
		float p,r,a=0,b=0;
		int i,n;
		System.out.println("informe o valor do investimento: ");
		p=JUtil.readFloat();
		System.out.println("informe os juros anual em %: ");
		r=JUtil.readFloat();
		System.out.println("informe os anos:" );
		n=JUtil.readInt();
		for(i=1;i<=n;i++){		
		a=(float)(p*Math.pow(1+r/100f,i));
		System.out.println(" ano :"+i+ " valor: "+a);
							}
		
		JUtil.pause();
		
		

	}
}
