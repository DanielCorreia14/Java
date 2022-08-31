class atv01
{
	public static void main(String[] args) throws Exception
	{
		int num,soma,somai;
		//num=JUtil.readInt();
		soma=0;
		do{
		System.out.println("informe um numero: ");
		num=JUtil.readInt();
		if(num %2 == 0){
		soma+=num;
		}		
		}while(num!=0);
		System.out.print(soma);
		}
}
