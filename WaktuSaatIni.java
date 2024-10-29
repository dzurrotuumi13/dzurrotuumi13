/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176020pbo5;

/**
 *
 * @author Asus
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", Locale.forLanguageTag("id-ID"));
        String formattedDateTime = now.format(formatter);

        System.out.println("Hari ini adalah hari " + formattedDateTime);
    }
}

