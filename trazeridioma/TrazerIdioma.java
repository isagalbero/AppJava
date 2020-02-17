package trazeridioma;

import java.util.Locale;

public class TrazerIdioma {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }

}