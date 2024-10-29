package lab;

public class lab4 {
	public static void main(String[] args) {
		try {
			System.out.println("Ms paint çalışacak ve notepad çalışacak");
			System.out.println("1. mas paint çalışacak");
			Process p1=Runtime.getRuntime().exec("mspaint.exe");
			Process p2=Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();
			System.out.println("Ms-paint uygulamasından çıktınız");
			p2.waitFor();	
			System.out.println("Notepad uygulamasından çıktnız");
			
		}catch(Exception ex) {
			System.out.println("Oops! bir hata oluştu");
		}
	}

}