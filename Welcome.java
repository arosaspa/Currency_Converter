package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Welcome {

    protected String message = "**************************************" +
            "\n* Welcome to Yuan Currency Converter *" +
            "\n* This program will help you convert  *" +
            "\n*   currencies from Yuan to other    *" +
            "\n**************************************" ;

    protected String list = "--------------------------------------" +
            "\n* Please select an option: *" +
            "\n* 1. ¥ Yuan " +
            "\n* 2. $ Dollar " +
            "\n* 3. € EURO" +
            "\n* 4. R Brazil" +
            "\n* 5. £ Sterling" +
            "\n* 6. Exit" +
            "\n --------------------------------------";

    public void showWelcomeMessage() {
        System.out.println(message);
        System.out.println(list);


    }
}