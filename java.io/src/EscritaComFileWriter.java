import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EscritaComFileWriter {
    public static void main(String[] args) throws IOException {
        // ler um arquivo de texto
        InputStream fis = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // escrever um arquivo de texto
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        // lê uma linha do arquivo de entrada
        String line = br.readLine();

        // enquanto a linha do arquivo de entrada não for nulo, escreve essa linha no
        // arquivo novo
        while (line != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        bw.close();

    }
}
