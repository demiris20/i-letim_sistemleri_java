package lab;

public class lab3 {
	public static void main(String[] args) {
		try {
			System.out.println("Ms paint çalışacak");
			Process p1=Runtime.getRuntime().exec("mspaint.exe");
			p1.waitFor();
			System.out.println("Ms-paint uygulamasından çıktınız");
			System.out.println("Notepad calışacak");
			Process p2=Runtime.getRuntime().exec("notepad.exe");
			p2.waitFor();	
			System.out.println("Notepad uygulamasından çıktnız");
			
		}catch(Exception ex) {
			System.out.println("Oops! bir hata oluştu");
		}
	}

}