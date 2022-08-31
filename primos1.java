class primos1 
{
	public static boolean primo(int x){
	return(x%2==1);
	}
	
	public static void main(String[] args) throws Exception
	{
		int n,i;
		System.out.println("Primos entre 1 e n");
		System.out.println("Digite um valor: ");
		n=JUtil.readInt();
		for(i=1;i<=n;i++){
			System.out.println("numero: "+ (primo(i) ? +i+" eh primo":+i+" n eh primo"));
		
		}


	}
}
