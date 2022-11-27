import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Scanner;

public class UsandoProperties {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Insira a senha: ");
        String senha = sc.nextLine();

        // Crio a propriedade
        Properties prop = new Properties();
        prop.setProperty("usuario", usuario);
        prop.setProperty("senha", senha);
        prop.store(new PrintWriter("login.properties", Charset.forName("UTF-8")), "Arquivo criado!");
        System.out.println("Arquivo gerado!");
        System.out.println("------------------------------------");

        // leio a propriedade
        System.out.println("Abrindo arquivo:");
        Properties prop2 = new Properties();
        prop2.load(new FileReader("login.properties"));

        System.out.printf("Usuario: %s %nSenha: %s", prop2.getProperty("usuario"), prop2.getProperty("senha"));

        sc.close();
    }
}
