import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:/Mentoria/Exercícios/java.io/teste.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        try (BufferedReader br = new BufferedReader(isr)) {
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        }

    }
}
