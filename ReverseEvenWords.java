package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

  		String text = "I am a software tester"; 
		String[] newtext=text.split(" ");

  		for(int i=0;i<=newtext.length-1;i++)
  		
  		{
			if(i%2==0)
			{
				System.out.print(" "+newtext[i]);
				System.out.print(" ");
			}
			
			else
			{
				char[] ch=newtext[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					System.out.print(""+ch[j]);
				}
				
			}
		}
	}

}
