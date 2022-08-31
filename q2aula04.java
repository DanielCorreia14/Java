class q2aula04
{
   

	public static void main(String[] args) throws Exception
	{
		for(int x = 2, soma = 0; x<=100; soma +=x, x+=2){
		System.out.println("x: "+x);
		System.out.println("soma: \n"+soma);
		//a validade eh que a variavel soma armazena (soma+x=soma) até o fim do for(testado 100 vezes)
		}
	}
}
