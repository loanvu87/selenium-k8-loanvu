package lab_06;

public class URLCheck {

    public static void main(String[] args) {
        String myURL = "https://google.com";
        String url = "";
        String domain = "";
        url = myURL.substring(0, myURL.indexOf(":"));
        if (url.equals("https")) {
            System.out.println("The url is: " + url);
        } else
            System.out.println("The url is not: " + "https");
        domain = myURL.substring(myURL.indexOf("."));
        if (domain.equals(".com")) {
            System.out.println("The domain is: " + domain);
        } else System.out.println("The url is: " + ".com");

    }
}
