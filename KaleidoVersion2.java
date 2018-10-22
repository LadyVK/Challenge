package practise;

import java.util.Hashtable;

public class KaleidoVersion2 {
	final int firstpart =Integer.MAX_VALUE/3;
	final int secondpart=firstpart*2;
	String ans="";
	Hashtable<Integer,Character> firstChar=new Hashtable<>();
	static int inputnumber=1500000000;
	String intnumber=Integer.toString(inputnumber);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KaleidoVersion2 kv=new KaleidoVersion2();
		
		String result=kv.generateID(inputnumber);
		System.out.print("the result is "+result);

	}

	private String generateID(int inputnumber) {
		// TODO Auto-generated method stub
		
		if(inputnumber==0 || inputnumber < 0 ||inputnumber>Integer.MAX_VALUE ||inputnumber<Integer.MIN_VALUE)
			return String.valueOf(inputnumber);
		  
	//	Hashtable<Character,Integer> firstChar=new Hashtable<>();
        int count=0;
		
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='A'||ch=='E' || ch=='I'|| ch=='O' ||ch=='U')
			{
				continue;
			}
			else
			{
				firstChar.put( count++,ch);
			}
				
		}
		
		if(inputnumber<=firstpart)
		{
			 ans=fournumbergenerator(inputnumber);
		}
		
		else if(inputnumber >firstpart && inputnumber <=secondpart)
		{
			 ans=fivenumbergenerator(inputnumber);
			
		}
		else
		{
			 ans=sixnumbergenerator(inputnumber);
		}
		
		return ans;
}

	

	private String sixnumbergenerator(int inputnumber) {
	
	
		if(inputnumber>secondpart && inputnumber<Integer.MAX_VALUE)
		{
		char ansch=firstChar.get(inputnumber%10);
		String ansint= Integer.toString(inputnumber%10)+Integer.toString(inputnumber%100);
		ans=ansch+Integer.toString((ansint.hashCode())%10)+Integer.toString(inputnumber).length()+(Integer.toString((Math.abs(intnumber.hashCode())%10)))+firstChar.get(Math.abs(intnumber.hashCode())%10);
		  
		}
		return ans;
	}

	private String fivenumbergenerator(int inputnumber) {
		
		
		if(inputnumber>firstpart && inputnumber<=secondpart)
		{
			char ansch=firstChar.get(inputnumber%10);
			 String ansint= Integer.toString(inputnumber%10)+Integer.toString(inputnumber%100);
			   ans=ansch+Integer.toString((ansint.hashCode())%10)+Integer.toString(inputnumber).length()+(Integer.toString((Math.abs(intnumber.hashCode())%10)));
			   
			
		}
		return ans;
	}

	private String fournumbergenerator(int inputnumber) {
		// TODO Auto-generated method stub
	
	   if(inputnumber>=1 && inputnumber <=firstpart)
	   {
		   char ansch=firstChar.get(inputnumber%10);
		    String ansint= Integer.toString(inputnumber%10)+Integer.toString(inputnumber%10);
		   ans=ansch+Integer.toString((ansint.hashCode())%10)+Integer.toString(inputnumber).length()+(Integer.toString((Math.abs(intnumber.hashCode())%10)));
		   
	   }
	   return ans;
	}
	
	
	
}
