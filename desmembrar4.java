class desmembrar4 
{
	public static int d(int x, int y,int z,int w){
	
	return(y%z+z%w+w%x+x%y);
	}
	public static void main(String[] args) throws Exception
	{
		float y,z,w,x;
		System.out.println("desmembrar");
		System.out.println("digite um numero: ");
		y=JUtil.readInt();
		while(y!=0){
		System.out.println(d(y));
		
		
		}
		
		


	}
}
