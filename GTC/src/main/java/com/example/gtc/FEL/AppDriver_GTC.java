package com.example.gtc.FEL;

import com.example.gtc.BLL.Control.RemoteGTC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppDriver_GTC {
    public static void main(String[] args) throws IOException {
        RemoteGTC gtc = new RemoteGTC();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Entrez votre salaire");
        Double amount = Double.valueOf(reader.readLine());

        System.out.println("Les taxes à payer sont de " + gtc.getTax(amount));
    }
}
