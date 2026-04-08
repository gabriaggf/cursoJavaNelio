package pooNelio;

import entities.Triangle;

import java.util.Scanner;

import static entities.Triangle.area;

public class AreaTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("Digite os valores do triangulo: ");
        triangle.a = sc.nextDouble();
        triangle.b = sc.nextDouble();
        triangle.c = sc.nextDouble();

        System.out.println("Area do triangulo: " + area(triangle.a, triangle.b, triangle.c));

    }

}
