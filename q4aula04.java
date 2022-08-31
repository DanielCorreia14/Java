class q4aula04
{
	public static void main(String[] args) throws Exception
	{
		int n,num,b=0;
		for(n=0;n<=3;n++){
		System.out.println("informe um numero entre 0 e 9: ");
		num=JUtil.readInt();
		if(num>=0 && num<=9){
		System.out.println("\n"+num);
		
		}else{
		System.out.println("numero invalido");
		}
		
		
		}

		
	}
}
