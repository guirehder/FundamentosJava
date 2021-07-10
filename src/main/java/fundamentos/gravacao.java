package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class gravacao {
    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome","idade","email"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz","29","11 99999999"});
        linhas.add(new String[]{"Gilmo","25","31 88888888"});
        linhas.add(new String[]{"Silas","21","11 77777777"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/test/resources/logs/clientes.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();
        escritor.close();

    }
}
