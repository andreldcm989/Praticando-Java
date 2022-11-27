import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class EscritaComPrintWriter {
    public static void main(String[] args) throws Exception {
        Long ini = System.currentTimeMillis();
        PrintStream ps = new PrintStream("Print Stream.txt", Charset.forName("UTF-8"));
        ps.println("Este é um arquivo criado com PrintStream.");
        ps.println("PrintStrem é um FileOutputStream, que é um OutputStream.");
        ps.println("André.");
        ps.close();
        long fim = System.currentTimeMillis();
        System.out.println("Execução PrintStream: " + (fim - ini) + " ms.");

        ini = System.currentTimeMillis();
        PrintWriter pw = new PrintWriter("Print Writer.txt", Charset.forName("UTF-8"));
        pw.println("Este é um arquivo criado com PrintWriter.");
        pw.println("O resultado é exatamente o mesmo que quando usei PrintStream.");
        pw.println("PrintWriter é um Writer.");
        pw.println("by André.");
        pw.close();
        fim = System.currentTimeMillis();
        System.out.println("Execução PrintStream: " + (fim - ini) + " ms.");

        // no teste, PrintWriter foi mais rápido que PrintStream.

    }
}
