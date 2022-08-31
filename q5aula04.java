class q5aula04 
{
	public static void main(String[] args) throws Exception
	{ 

		int x,soma=0,c=0,media;
		do{
			
		System.out.println("digite um numero: ");
		x=JUtil.readInt();
		soma+=x;
		System.out.println("soma parcial: "+soma);
		if (x!=0)
		{ c++;
		}
		System.out.println("numeros digitados ate agora: "+c);
		
		
		}while(x!=0);
		System.out.println("a soma dos x numeros eh : "+soma);
		System.out.println("a media eh: "+ (soma/(c)));
		


	}
}
