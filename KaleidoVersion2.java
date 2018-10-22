package practise;

import java.util.Hashtable;

public class KaleidoVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KaleidoVersion2 kv=new KaleidoVersion2();
		kv.generateID(25);

	}

	private String generateID(int number) {
		// TODO Auto-generated method stub
		
		if(number==0 || number < 0 ||number>Integer.MAX_VALUE ||number<Integer.MIN_VALUE)
			return String.valueOf(number);
		  
		Hashtable<Character,Integer> firstChar=new Hashtable<>();
        int count=1;
		
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='A'||ch=='E' || ch=='I'|| ch=='O' ||ch=='U')
			{
				continue;
			}
			else
			{
				firstChar.put(ch, count++);
			}
				
		}
		
		System.out.print(firstChar);
		return "";
}
	
}
