class triangulo 
{
	public static boolean equilatero(int x,int y,int z){	
	return(x==y&&y==z&&z==x);
	}public static boolean isoceles(int x,int y,int z){	
	return(x==y&&y!=z&&z!=x);
	}public static boolean escaleno(int x,int y,int z){	
	return(x!=y&&y!=z&&z!=x);
	}

	public static void main(String[] args) throws Exception
	{
		int l1,l2,l3;
		System.out.println("triangulos!");
		System.out.println("informe um lado do triangulo: ");
		l1=JUtil.readInt();
		while(l1!=0){
		System.out.println("informe outro lado: ");
		l2=JUtil.readInt();
		System.out.println("informe o ultimo lado: ");
		l3=JUtil.readInt();
		System.out.println("o triangulo : "+ (equilatero(l1,l2,l3) ? " eh equilatero":"\n"));
		System.out.println("o triangulo : "+ (isoceles(l1,l2,l3) ? " eh isoceles" : "\n"));
		System.out.println("o triangulo : "+ (escaleno(l1,l2,l3) ? " eh escaleno" : "\n"));
		System.out.println("informe um lado do triangulo: ");
		l1=JUtil.readInt();
		}



	}
}
