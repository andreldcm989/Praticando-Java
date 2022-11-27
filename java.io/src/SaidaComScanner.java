import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.Pessoa;

public class SaidaComScanner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("Pessoas.csv"));

        PrintWriter pw = new PrintWriter("pessoasNovo.txt");

        while (sc.hasNextLine()) {
            Scanner pessoa = new Scanner(sc.nextLine());
            pessoa.useDelimiter(";");
            String nome = pessoa.next();
            long cpf = pessoa.nextLong();
            LocalDate nascimento = LocalDate.parse(pessoa.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String cidade = pessoa.next();
            Pessoa novaPessoa = new Pessoa(nome, cpf, nascimento, cidade);
            pw.write(novaPessoa.toString());
            System.out.println(novaPessoa);
        }
        System.out.printf("Total pessoas: %d", Pessoa.getTotalPessoas());
        sc.close();
        pw.close();
    }
}
