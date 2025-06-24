package org.example;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main extends Welcome {


    public static void main(String[] args) throws IOException, InterruptedException {
        // Create an instance of the Welcome class and call the welcome method
        // to display the welcome message and options
        Main app = new Main();
        app.showWelcomeMessage();

        Double currency = 0.0;

        System.out.println("What currency do you want to convert ? ");
        Scanner introCurrency = new Scanner(System.in);
        int option = introCurrency.nextInt();


        switch (option) {
            case 1:
                System.out.println("Your selection is the ¥ Yuan, and the conversion is as follows: \n");
                HttpClient clientYuan = HttpClient.newHttpClient();
                HttpRequest requestYuan = HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/60737150a15a670ba4a0750d/latest/CNY"))
                        .build();
                HttpResponse<String> responseYuan = clientYuan.send(requestYuan, HttpResponse.BodyHandlers.ofString());
                System.out.println("The conversion of ¥ Yuan to others currencies is: " + responseYuan.body());
                System.out.println("***Yuan conversion was successfully performed with the current world conversion date***\nThanks for use this API Currency");
                break;

            case 2:
                System.out.println("Your selection is the $ Dollar, and the conversion is as follows: \n");
                HttpClient clientDollar = HttpClient.newHttpClient();
                HttpRequest requestDollar = HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/60737150a15a670ba4a0750d/latest/EUR"))
                        .build();
                HttpResponse<String> responseDollar = clientDollar.send(requestDollar, HttpResponse.BodyHandlers.ofString());
                System.out.println("The conversion of E Euro to others currencies is: " + responseDollar.body());
                System.out.println("***Dollar conversion was successfully performed with the current world conversion date***\nThanks for use this API Currency");
                break;

            case 3:
                System.out.println("Your selection is the € Euro, and the conversion is as follows: \n");
                HttpClient clientEuro = HttpClient.newHttpClient();
                HttpRequest requestEuro = HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/60737150a15a670ba4a0750d/latest/EUR"))
                        .build();
                HttpResponse<String> responseEuro = clientEuro.send(requestEuro, HttpResponse.BodyHandlers.ofString());
                System.out.println("The conversion of E Euro to others currencies is: " + responseEuro.body());
                System.out.println("***Euro conversion was successfully performed with the current world conversion date***\nThanks for use this API Currency");
                break;

            case 4:
                System.out.println("You selected (R$) Real Brazil, and the conversion is as follows: \n");
                HttpClient clientReal = HttpClient.newHttpClient();
                HttpRequest requestReal= HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/60737150a15a670ba4a0750d/latest/BRL"))
                        .build();
                HttpResponse<String> responseReal = clientReal.send(requestReal, HttpResponse.BodyHandlers.ofString());
                System.out.println("The conversion of E Euro to others currencies is: " + responseReal.body());
                System.out.println("***Real conversion was successfully performed with the current world conversion date***\nThanks for use this API Currency");
                break;

            case 5:
                System.out.println("Your selection is the £ Pound Sterling, and the conversion is as follows: \n");
                HttpClient clientSterling = HttpClient.newHttpClient();
                HttpRequest requestSterling = HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://v6.exchangerate-api.com/v6/60737150a15a670ba4a0750d/latest/GBP"))
                        .build();
                HttpResponse<String> responseSterling = clientSterling.send(requestSterling, HttpResponse.BodyHandlers.ofString());
                System.out.println("The conversion of £ Pound Sterling to others currencies is: " + responseSterling.body());
                System.out.println("***Pound Sterling conversion was successfully performed with the current world conversion date***\nThanks for use this API Currency");
                break;

            case 6:
                System.out.println("\nThanks for use this API Currency");
                System.out.println("*******************************");
                System.out.println("********** Goodbye! ***********");
                System.out.println("*******************************");
                return;

            default:
                System.out.println("Invalid option. Please try again.");
        }

        // Close the scanner to prevent resource leaks
        introCurrency.close();

    }

}


