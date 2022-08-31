class NumeroPar 
{
	

	public static void mostre(String mensagem){
		System.out.print(mensagem);}
	public static void mostreln(String mensagem){
		System.out.println(mensagem);}
	
	public static boolean ehPar(int n){
	return (n%2==0);
	}
	public static void main(String[] args)throws Exception
		{
			int x;
			System.out.println("determina par ou impar ");
			System.out.println("digite um valor: ");
			x=JUtil.readInt();

			while (x!=0){

				System.out.println("numero "+ (ehPar(x)? "":"im")+"par");
					System.out.println("digite um valor: ");
			x=JUtil.readInt();
			}
			JUtil.pause();
	}
}
