package homework10;

public class MyThread extends Thread{
		private String str;


		public MyThread(String str) {
			this.str = str;
		}

		public void run() {
		int i = 0;
			while(i<5){
				try { sleep(500); 
		         } catch (InterruptedException e) {}
		         System.out.println(str);
		         i++;
		      }
			}
	}