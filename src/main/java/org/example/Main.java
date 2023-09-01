//Проверка кодировки в файле
package org.example;

import com.glaforge.i18n.io.CharsetToolkit;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static final String FILENAME = "D:\\Java-practik\\1.txt";
    static final String UNICODE_STRING = "Hello word!!!!";
    static final Logger logger = Logger.getLogger(Main.class.getName());
//    static final CharsetToolkit guesser = new CharsetToolkit();


    public static Charset guessCharset2(File file) throws IOException {
        return CharsetToolkit.guessEncoding(file, 4096, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((FILENAME), true), "UTF8"))) {
            bw.write(UNICODE_STRING);
            bw.flush();
        } catch (UnsupportedEncodingException | FileNotFoundException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }

        File file = new File("D:\\Java-practik\\1.txt");
        System.out.println();
        try {
            guessCharset2(file);
            System.out.println(guessCharset2(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        String s;
//
//        fis = new FileInputStream("D:/Java-practik/123.txt");
//        isr = new InputStreamReader(fis);
//
//        s = isr.getEncoding();
//
//        System.out.print("Character Encoding: " + s);
    }
}