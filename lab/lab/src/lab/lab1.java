package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class lab1 {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process dirProc = rt.exec("cmd /c dir");
        InputStream in = dirProc.getInputStream();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
