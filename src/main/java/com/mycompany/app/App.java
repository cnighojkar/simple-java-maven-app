package com.mycompany.app;
/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) throws Exception {
      try {
        System.out.println(new App().getMessage());
          } catch (Exception ex) {
            System.out.println(ex);
    }
  }

    private final String getMessage() {
        return message;
    }

    private final String getMessage123() {
        return message;
    }

    private final String getMessage456() {
      int a=1;
    if (a == 1) {}
        return message;
    }

}
