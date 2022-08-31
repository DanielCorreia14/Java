class repeticao
{
	public static void main(String[] args) throws Exception
	{
		int n,num,teste = 1;
		System.out.println("digite um numero: ");
		n=JUtil.readInt();
		num=1;
		while(num<=n && teste == 1){	
		System.out.print(num+(num % 5 == 0 ? "\n" : ","));
		
		if(num %10==0&& num<n){
		System.out.println("quer continuar? ainda tem mais...digite 1 pra continuar e 0 para interromper: ");
		teste=JUtil.readInt();
		
		}if(n==num){
		System.out.println("\nfim da lista. ");
		
		}
		num++;}
		
	}
}
