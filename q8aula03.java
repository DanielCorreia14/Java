class q8aula03 
{
	public static void main(String[] args) throws Exception
	{
		int x;
		x=JUtil.readInt();
		if(x>0){
			System.out.println(x+" eh positivo");
		}if(x<0){
			System.out.println(x+" eh negativo");
		}if(x == 0){
			System.out.println(x+" eh nulo");
		}


	}
}
