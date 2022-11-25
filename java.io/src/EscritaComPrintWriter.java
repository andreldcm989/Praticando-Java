import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class EscritaComPrintWriter {
    public static void main(String[] args) throws Exception {

        PrintStream ps = new PrintStream("Print Stream.txt", Charset.forName("UTF-8"));
        ps.println("Este é um arquivo criado com PrintStream.");
        ps.println("PrintStrem é um FileOutputStream, que é um OutputStream.");
        ps.println("André.");
        ps.close();

        PrintWriter pw = new PrintWriter("Print Writer.txt", Charset.forName("UTF-8"));
        pw.println("Este é um arquivo criado com PrintWriter.");
        pw.println("O resultado é exatamente o mesmo que quando usei PrintStream.");
        pw.println("PrintWriter é um Writer.");
        pw.println("by André.");
        pw.close();

    }
}
