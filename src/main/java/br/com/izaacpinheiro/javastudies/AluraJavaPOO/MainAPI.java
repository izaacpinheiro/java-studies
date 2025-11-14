package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

import br.com.izaacpinheiro.javastudies.AluraJavaPOO.exceptions.ErroConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Início do curso Java: consumindo APis da Alura

        String API_KEY = "9add21eb";
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Title> titles = new ArrayList<>();

        // usando uma biblioteca para manipular JSON
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            try {
                System.out.println("Digite um filme para busca: ");
                busca = scanner.nextLine();

                if (busca.equalsIgnoreCase("sair")) break;

                // uso da biblioteca http para fazer requisições
                HttpClient client = HttpClient.newHttpClient();
                // requisição HTTP
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + API_KEY))
                        .build();
                // resposta da API
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                // uso de classe Record para criação mais simples da classe Title
                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Conversão com erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de argumento de busca");
                System.out.println(e.getMessage());
            } catch (ErroConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titles);

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();
    }
}