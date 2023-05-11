/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfirstprogramingjava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Myfirstprogramingjava {

    public static void main(String[] args) {
       
        float n1,n2,n3, media;
        String nome;
        
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.print("Seu nome: ");
        nome = dado.next();
                
        System.out.print("Digite a sua primeira nota: ");
        n1 = dado.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        n2 = dado.nextFloat();
        System.out.print("Digite a sua terceira nota: ");
        n3 = dado.nextFloat();
         
        
        
        media = (n1+n2+n3)/3;
        
        System.out.println(nome + " a sua media de notas foi: " + media);
        
        if (media >= 7){
            System.out.print("Você passou! ");
        }
        else{
            System.out.print("Você reprovou!");
        }
        
        
              
        
    }
}
