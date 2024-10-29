package lab;

public class lab2 {
	public static void main(String[] args) {
		try {
			System.out.println("MS Paint programı çalıştır.");
			Process p=Runtime.getRuntime().exec("mspaint.exe");
			p.waitFor();
			System.out.println("Ms paint programından ciktiniz.");
		}
		catch(Exception ex){
			System.out.println("exception is:"+ex);
			
		}
	}

}