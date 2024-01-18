import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PoblacionAnalfabeta {
    public static void main(String[] args) throws IOException {

        List<Member> personasAnalfabetas = new ArrayList<>();
        String csvSplitBy = ",";

        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10722437/Escriptori/illiterate.csv"));
        String line;
        reader.readLine();
        while ((line = reader.readLine())!=null) {
            String[] datos = line.split(csvSplitBy);
            String pais = datos[5];
            int personas = Integer.parseInt(datos[8]);
            personasAnalfabetas.add(new Member(pais, personas));
        }
        reader.close();

        personasAnalfabetas.stream().sorted().forEach(System.out::println);

    }
}
