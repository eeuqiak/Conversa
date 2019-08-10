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
public class PessoaB extends PessoaGenerica {
 
    @Override
    public String Comprimentar() {
            return "Olá, tudo bem?";
    }

    @Override
    public String Sentir() {
        return "Tudo bem tambem";
    }

    @Override
    public String Apresentar(String Nome) {
        return "Eu me chamo " + Nome;
    }
    

}
