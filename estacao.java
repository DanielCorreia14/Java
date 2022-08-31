class estacao
{

	public static void main(String[] args)throws Exception{
		short mes;
		String r ;
		System.out.println("estacao do ano");
		System.out.println("informe o mes: ");
		mes=JUtil.readShort();

switch (mes)
{
case 1: case 2: case 12: r ="verao";
break;
case 3:case 4:case 5: r="outono";
break;
case 6: case 7: case 8: r="inverno";
break;
case 9: case 10: case 11: r="primavera";
break;
default:r="invalido";
}
System.out.println("resultado = "+ r);


		}

	}
