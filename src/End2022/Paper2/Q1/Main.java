package End2022.Paper2.Q1;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("www.google.com");
        browser.visit("www.youtube.com");
        browser.visit("www.sci.pdn.ac.lk");
        browser.visit("www.w3schools.com");
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("www.linkedin.com");
        browser.back();
        browser.back();
    }
}
