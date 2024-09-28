package org.example;

public class AppValidacao {
    public static void main(String[] args) {

        /*
            Essa é a classe que está usando a classe validaacao para passar as notas de
            todas as modalidades que o atleta recebeu.

            Quando você chama Validacao.validaTotalidade(valor da pontuação do atleta). Ele tá executando
            tudo que esse metódo faz e retornando o valor dela, ou seja, é o mesmo que dizer que o valor dessa
            expressão Validacao.validaTotalidade(1) = true, já que esse é o seu retorno. Então quando ele chama
            if (Validacao.validaTotalidade(1)) for true, ele retorna a mensagem (Pontuação de totalidade dos movimentos válida),
            else(senão) retorna (Pontuação de totalidade dos movimentos inválida). Do mesmo jeito funciona para os outros ifs.
         */

        if (Validacao.validaTotalidade(1)) {
            System.out.println("Pontuação de totalidade dos movimentos válida");
        }else{
            System.out.println("Pontuação de totalidade dos movimentos inválida");
        }

        if (Validacao.validaComplexidade(8.9)) {
            System.out.println("Pontuação de complexidade das acrobacia válida");
        }else{
             System.out.println("Pontuação de complexidade das acrobacia inválida");
        }

        if (Validacao.validaExatidao(11)) {
            System.out.println("Pontuação da exatidão dos movimentos válido");
        }else{
            System.out.println("Pontuação da exatidão dos movimentos inválida");
        }

    }
}