package pkj1;

import java.net.URL;

public class ValidURL {

    public static void main(String[] args) {
        String urlString = "https://www.google.com/";

        if (isValidURL(urlString)) {
            System.out.println("URL is valid: " + urlString);
        } else {
            System.out.println("URL is not valid: " + urlString);
        }
    }

    public static boolean isValidURL(String urlString) {
        try {
            // Create a URL object
            URL url = new URL(urlString);
            
            // Check if the protocol is valid (e.g., http, https, ftp)
            String protocol = url.getProtocol();
            if (!protocol.equalsIgnoreCase("http") && !protocol.equalsIgnoreCase("https") && !protocol.equalsIgnoreCase("ftp")) {
                return false;
            }
            
            // Check if the host is valid (e.g., example.com)
            String host = url.getHost();
            if (host == null || host.isEmpty()) {
                return false;
            }

            // Check if the URL is well-formed
            url.toURI();

            return true;
        } catch (Exception e) {
            // Malformed URL
            return false;
        }
    }
}
