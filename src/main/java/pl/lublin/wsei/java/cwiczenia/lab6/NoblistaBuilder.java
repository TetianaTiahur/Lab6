package pl.lublin.wsei.java.cwiczenia.lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoblistaBuilder {

    private static final String COMMA_DELIMITER = "\n";
    ArrayList<Noblista> listNoblista = new ArrayList<Noblista>();

    public void readFile(){
        try (BufferedReader br = new BufferedReader(new FileReader("nobel_prize_by_winner.csv"))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                for (String noblista : values){
                    if (!firstLine){
                        listNoblista.add(arrayToNoblista(noblista));
                    }
                    firstLine = false;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Noblista arrayToNoblista(String noblistaString){
        System.out.println("Noblista:");
        String[] noblistaArray = noblistaString.split(",");
        Noblista noblista = new Noblista();
        System.out.println(noblistaArray.length);
        noblista.setImie(dataByKey(noblistaArray,1));
        noblista.setNazwisko(dataByKey(noblistaArray,2));
        noblista.setKategoria(dataByKey(noblistaArray,13));
        noblista.setUzasadnienie(dataByKey(noblistaArray,16));
        noblista.setKraj(dataByKey(noblistaArray,5));
//        System.out.println(noblistaArray[14]);
//        noblista.setRok(Short.parseShort(dataByKey(noblistaArray,15)));
//        for (String stringValue:noblistaArray){
//            System.out.println(stringValue);
//        }
        return noblista;
    }

    private String dataByKey(String[] data, int key){
        if (data.length > key){
            return data[key];
        } else {
            return "";
        }
    }

    public ArrayList<Noblista> getList(){
        System.out.println("break");
        return listNoblista;
    }

}
