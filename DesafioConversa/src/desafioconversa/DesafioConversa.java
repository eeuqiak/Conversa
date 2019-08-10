/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioconversa;

import java.util.Scanner;

/**
 *
 * @author kaiqu
 */
public class DesafioConversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa A");
        String NomeA = entrada.nextLine();
        System.out.println("Digite o nome da pessoa B");
        String NomeB = entrada.nextLine();
        PessoaA A = new PessoaA();
        PessoaB B = new PessoaB();
        
        System.out.println(NomeA + ": " + A.Comprimentar());
        System.out.println(NomeB + ": " + B.Comprimentar());
        System.out.println(NomeA + ": " +A.Sentir());
        System.out.println(NomeB + ": " + B.Sentir());
        System.out.println(NomeA + ": " + A.Apresentar(NomeA));
        System.out.println(NomeB + ": " + B.Apresentar(NomeB));
        
        
    }
    
}
