package l4;

public class RangeOfNumbers {
	    float a = 0;
		float b = 0;
		float c = 0;
		int x = 0;
			
			public int Numbers(float a, float b, float c)
			{
			if ((c>=-5f)&&(c<=5f)) x++;
			if ((b>=-5f)&&(b<=5f)) x++;
			if ((a>=-5f)&&(a<=5f)) x++;
			return x;
			}
			
			public void output(int x)
			{
			if (x>1 || x==0)
			{
				System.out.println(x + " numbers are belong to the range [-5,5].");
			} else {
				System.out.println(x + " number is belong to the range [-5,5].");
			}
		}	
}
			
		
		
		
		
		
