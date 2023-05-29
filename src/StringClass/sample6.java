package StringClass;

public class sample6
{
	public static void main(String[] args) 
	{
			String s1="amol";
			String s2="abcd";
			String s3="ABCD";
			String s4="i love my india";
			System.out.println(s4.replace("india", "mother"));//i love my mother
			System.out.println(s1.concat("+"+s3));   //amol+ABCD
			System.out.println(s4.startsWith("b"));  //false
			System.out.println(s3.endsWith("D"));    //true
			System.out.println(s3.substring(1, 3));  //BC
			System.out.println(s4.lastIndexOf("d"));  //12
			System.out.println(s3.charAt(2));         //
			System.out.println(s1.trim());
		
	}

}
