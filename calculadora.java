class calculadora 
{
	public static void main(String[] args)throws Exception 
	{
		int adicao,subtracao,multiplicacao,divisao;
		short c;
		double v1,v2,r;
		
		System.out.println("calculadora");
		System.out.println("informe um valor: ");
		v1=JUtil.readInt();
		System.out.println("informe outro valor: ");
		v2=JUtil.readInt();
		System.out.println("informe qual operacao deseja fazer");
		c=JUtil.readShort();
switch (c)
{
case 1: 
	r=v1+v2;
System.out.println("soma eh: "+r);	
; break;
case 2: r=v1*v2;System.out.println("multiplicacao eh: "+r);
break;
case 3: r=v1-v2; System.out.println("subtracao d v1 - v2 eh: "+r);
break;
case 4: r=v1/v2; System.out.println("divisao eh: "+r);
break;
default: System.out.println("numero invalido");

}




	}
}
