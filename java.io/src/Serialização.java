import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialização {
    public static void main(String[] args) throws Exception {
        String nome = "André Cruz";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialize.bin"));
        oos.writeObject(nome);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialize.bin"));
        String leitura = (String) ois.readObject();
        System.out.println(leitura);

        oos.close();
        ois.close();
    }
}
