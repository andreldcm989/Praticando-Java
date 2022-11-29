import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.Pessoa;

public class SerializandoClasses {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("André Cruz", 99800786566l,
                LocalDate.parse("28/10/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "Uberlandia");
        System.out.println(pessoa.getNascimento());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializandoClasses.bin"));
        oos.writeObject(pessoa);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializandoClasses.bin"));
        Pessoa p2 = (Pessoa) ois.readObject();
        System.out.println(p2.getNome());

        oos.close();
        ois.close();
    }
}
