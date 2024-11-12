package br.com.jamazonasa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsGruposGenero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();
        String adicionar = "Sim";

        do {
            System.out.println("Nome: ");
            String nome = s.nextLine();

            System.out.println("Gênero: ");
            String genero = s.nextLine();

            if (genero.equalsIgnoreCase("Feminino")) {
                feminino.add(nome);
            } else if (genero.equalsIgnoreCase("Masculino")) {
                masculino.add(nome);
            } else {
                System.out.println("Gênero inválido, digite Masculino ou Feminino.");
                continue;
            }

            System.out.println("Adicionar mais alguém à lista? Responda com Sim ou Não:");
            adicionar = s.nextLine();

        } while (adicionar.equalsIgnoreCase("Sim"));



        System.out.println("Feminino: " + feminino);
        System.out.println("Masculino: " + masculino);
    }
}
