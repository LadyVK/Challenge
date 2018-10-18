package practise;

import java.util.*;

public class KaleidoBioscience implements java.io.Serializable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		KaleidoBioscience kb =new KaleidoBioscience();
		int q =5;
		 HashMap<Integer,String> hp=new HashMap<>();
		String result=kb.uniqueIdgenerator(q,hp);
	
	//	System.out.print("The Output is "+result);
		

	}

	private String uniqueIdgenerator(int q,Map<Integer,String> hp) {
		
		
		//=new HashMap<>();
		
		if(q==0 || q < 0)
			return "";
		 
		if(hp.containsKey(q))
		{
			return hp.get(q);
		}
		
		else
		{
			//Random r=new Random();
			String randgen="";
			int randnumber=randomNumberinRanger(65,90);
		    String alphaString = Character.toString((char) randnumber);
	        char ch=alphaString.charAt(0);
	        if(checkAlpha(ch))
	        {
	        	StringBuilder sb=new StringBuilder();
	        	int randomnumber=randomNumberinRanger(100,999);
	        //	String randans=Character.toString((char) randomnumber);
	        	String randans=Integer.toString(randomnumber);
	        	String answer=ch+randans;
	        //	System.out.print(answer);
	        	hp.put(q, answer);
	        	System.out.print(hp);
	        }
		  
			
			
			
			
		}
		
		
		
		
		return "";
	}

	private boolean checkAlpha(char ch) {
		// TODO Auto-generated method stub
		if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'|| ch=='U')
		{
		return false;
		}
		return true;
	}

	private int randomNumberinRanger(int i, int j) {
		Random randno=new Random();
		return randno.nextInt((j - i) + 1) + i;
		
	}

}
