class fatorialn{
		public static int facto(int numero){
		int fact =1,i;
		for(i=1;i<=numero;i++){
		fact*=i;
		
		}
		return (fact);
		}


	public static void main(String[] args) throws Exception
	{
		int numero;
		System.out.println("fatorial!");
		System.out.println("digite um numero para calculo da fatorial: ");
		numero=JUtil.readInt();
		while(numero!=0){
		System.out.println("fatorial desse numero eh: "+facto(numero));
		System.out.println("digite um numero para calculo da fatorial: ");
		numero=JUtil.readInt();
		
		}


	}
}
