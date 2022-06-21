package pl.lublin.wsei.java.cwiczenia.lab6.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {
    public static void main(String[] args) throws IOException {
         long startTime = System.nanoTime();
//        long startTime = System.currentTimeMillis();
        File oryginal = new File("sample_1920×1280 (1).tiff");
        File kopia = new File("img_copppy.tiff");
        Files.copy(oryginal.toPath(), kopia.toPath());
//        System.out.println("Czas kopiowania: " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime() - startTime));
    }
}
