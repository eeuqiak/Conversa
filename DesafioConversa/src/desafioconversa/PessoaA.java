/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioconversa;

/**
 *
 * @author kaiqu
 */
public class PessoaA extends PessoaGenerica {

    @Override
    public String Comprimentar() { 
            return "Olá"; 
    }

    @Override
    public String Sentir() {
        return "Tudo bem, e você?";
    }

    @Override
    public String Apresentar(String Nome) {
        return "Meu nome é " + Nome + " e o seu?";
    }
    
}
