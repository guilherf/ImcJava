package net.bifewagyu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float altura = 0;
        float peso = 0;

        boolean entrada = false;
        boolean entrada2 = false;

        Scanner scan = new Scanner(System.in);
        while (!entrada) {

            try {
                System.out.println("Calcule seu IMC ");
                System.out.println("Digite sua altura: ");
                altura = scan.nextFloat();
                if (altura < 0 || altura > 100) {
                    throw new InputMismatchException();
                }
                entrada = true;
            } catch (InputMismatchException e) {
                System.out.println("Não foi possivel calcular seu IMC, numero invalido");
                scan.next();
            }

        }

        while (!entrada2) {

            try {
                System.out.println("Digite seu peso: ");
                peso = scan.nextFloat();
                entrada2 = true;

            } catch (InputMismatchException e) {
                System.out.println("Seu peso é invalido");
            }

        }

        altura = altura * altura;

        peso = peso / altura;


        if (peso < 18.5) {

            System.out.println("Abaixo do peso");

        } else if (peso > 18.5 && peso < 24.9) {

            System.out.println("Saudável");
        } else if (peso > 25 && peso < 29.9) {
            System.out.println("Sobre o peso");
        } else if (peso > 30 && peso < 34.9) {

            System.out.println("Obesidade Grau I");
        } else if (peso > 35 && peso < 39.9) {

            System.out.println("Obesidade Grau II");
        } else if (peso > 40) {

            System.out.println("Obesidade Grau III (PROCURE UM MEDICO)");

        }


    }
}