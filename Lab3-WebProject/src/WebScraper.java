import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param "url"- url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public class WebScraper {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void counter(String[] urlToString) {
        System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        int counter = 0;
        for (int i = 0; i <= WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt").length() - 1; i++) {
            if (urlToString[i] == "Horatio") {
                counter = counter + 1;


            }
        }
    }

    public static void main(String[] unused) {W
        WebScraper.counter(unused);
    }


}
