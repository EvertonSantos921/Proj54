package com.java;

import java.util.Scanner;

public class testando {
	
	public static void main(String[] args) {		

        int num1;
        int num2;

        Scanner sc = new Scanner (System.in);

        System.out.println("Escreva num1: ");
        num1 = sc.nextInt();

        System.out.println("Escreva num2: ");
        num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Num1 é maior que o num2");
        }
        else if(num1<num2){
            System.out.println("Num2 é maior que o num1");
        }else {
            System.out.println("Os números são iguais");
        }
    }
	
	}


