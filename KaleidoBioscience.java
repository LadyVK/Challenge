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
		int q =9;
		Hashtable<Integer,String> hp=new Hashtable<>();
		String result=kb.uniqueIdgenerator(q,hp);
	    System.out.println(result);
	
		

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private String uniqueIdgenerator(int q,Hashtable<Integer,String> hp) {
		
		 
		 String valans="";
		if(q==0 || q < 0)
			return "";
		 
		if(!hp.containsKey(q))
		{
			Hashtable<Integer,String> hpans=null;
			 try
		      {
		         FileInputStream fis = new FileInputStream("C:/Users/Vidya/Desktop/Challenge1/test1.ser");
		         ObjectInputStream ois = new ObjectInputStream(fis);
		        hpans  = (Hashtable<Integer, String>) ois.readObject();
		         ois.close();
		         fis.close();
		      }catch(IOException ioe)
		      {
		         ioe.printStackTrace();
		       
		      }catch(ClassNotFoundException c)
		      {
		         System.out.println("Class not found");
		         c.printStackTrace();
		        
		      }
		     // System.out.println("Deserialized HashMap..");
		    
		         if(hpans.containsKey(q))
		         {
		           System.out.println("The ID is already in records");
		          valans=  hpans.get(q);
		    //    System.out.println("ID is"+q+"Output id is"+valans);
		         }
		         
		         else
		         {
		        	 firsttimeentry(q,hp);
		         }
		       
		        }
		
		return valans;
	}
	       
	    public void firsttimeentry(int q,Hashtable<Integer,String> hp)
	    {
	    
	    	int randnumber=randomNumberinRanger(65,90);
		    String alphaString = Character.toString((char) randnumber);
	        char ch=alphaString.charAt(0);
	        if(checkAlpha(ch))
	        {
	       
	        	int randomnumber=randomNumberinRanger(100,999);
	        	String randans=Integer.toString(randomnumber);
	        	String answer=ch+randans;
	        	hp.put(q, answer);
	        	
	        	
	        	try 
	        	{
	        		OutputStream fileans = new FileOutputStream("C:/Users/Vidya/Desktop/Challenge1/test1.ser");
	                ObjectOutputStream outans = new ObjectOutputStream(fileans);
	                 outans.writeObject(hp);
	                outans.close();
	                fileans.close();
	        		
	        	}
	        	catch(IOException e){
	        		
	        		e.printStackTrace();
	        	}
	        
	        }
		System.out.print("Value entered in records");  	
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
