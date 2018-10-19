package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;

public class KaleidoBioscience {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		KaleidoBioscience kb =new KaleidoBioscience();
		int q =989759;
		Hashtable<Integer,String> hp=new Hashtable<>();
		String result=kb.uniqueIdgenerator(q,hp);
	    System.out.println("The Id is :"+q+"The Value is :"+result);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private String uniqueIdgenerator(int q,Hashtable<Integer,String> hp) {
		
		 
		 String valans="";

		if(q==0 || q < 0 ||q>Integer.MAX_VALUE ||q<Integer.MIN_VALUE)
			return String.valueOf(q);
		
			Hashtable<Integer,String> hpans=new Hashtable<>();
			
			//Source referred-https://beginnersbook.com/2013/12/how-to-serialize-hashmap-in-java/
			 try
		      {
		         FileInputStream fis = new FileInputStream("C:/Users/Vidya/Desktop/Challenge1/test1.ser");
		         ObjectInputStream ois = new ObjectInputStream(fis);
		        hpans  = (Hashtable<Integer, String>) ois.readObject();
		         ois.close();
		         fis.close();
		      }catch(IOException e)
		      {
		         e.printStackTrace();
		       
		      }catch(ClassNotFoundException c)
		      {
		        
		         c.printStackTrace();
		        
		      }
		    
		   
		      if( hpans.containsKey(q))
		         {
		           System.out.println("The ID is already in records");
		           valans= hpans.get(q);
		          
		         }
		      else
		         {
		        	  firsttimeentry(q,hpans);
		         }
		          
		      
		         
		      return valans; 
		       
		        
		
	}
	       
	    public void firsttimeentry(int q,Hashtable<Integer,String> hpans)
	    {
	    
	    	int randnumber=randomNumberinRanger(65,90);
		    String alphaString = Character.toString((char) randnumber);
	        char ch=alphaString.charAt(0);
	        if(checkAlpha(ch))
	        {
	       
	        	int randomnumber=randomNumberinRanger(100,99999);
	        
	        	String randans=Integer.toString(randomnumber);
	        	String answer=ch+randans;
	        	int anslength=answer.length();
	        	if(anslength>=3 || anslength<7)
	        	{
	        	hpans.put(q, answer);
	        	}
	        	else
	        	{
	        		firsttimeentry(q,hpans);	
	        	}
	        	//Source referred-https://beginnersbook.com/2013/12/how-to-serialize-hashmap-in-java/
	        	try 
	        	{
	        		OutputStream fileans = new FileOutputStream("C:/Users/Vidya/Desktop/Challenge1/test1.ser");
	                ObjectOutputStream outans = new ObjectOutputStream(fileans);
	                outans.writeObject(hpans);
	                outans.close();
	                fileans.close();
	        		
	        	}
	        	catch(IOException e){
	       
	        		e.printStackTrace();
	        	}
	        
	        }
	        
	        else
	        {
	        	firsttimeentry(q,hpans);
	        }
		
}

	private boolean checkAlpha(char ch) {
		// TODO Auto-generated method stub
		if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'|| ch=='U')
		{
		return false;
		}
		return true;
	}

	//referred on StackOverflow to generate a number  between certain number.
	private int randomNumberinRanger(int i, int j) {
		Random randno=new Random();
		return randno.nextInt((j - i) + 1) + i;
		
	}

}
