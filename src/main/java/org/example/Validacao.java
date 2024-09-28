package org.example;

public class Validacao {

    /*
    Esse é um metódo que serve para validar a pontuação da totalidade dos movimentos.
    a variável (pontuação) vai receber o valor dessa pontuação do atleta e validar se essa
    pontuação é pode ser aceita ou não. Essa pontuação é aceita se ela for de 0 à 2.5. Então
    o metódo retorna um true se essa pontuação for válida e false se ela não tiver no intervalo de
    0 à 2.5

    Todos os metódo dessa classe são estático, ou seja, para você conseguir usar ele em outra classe, você só precisa
    dizer o nomeDaClasse.nomeDoMetodo(Validacao.validaTotalidade). Eles são estáticos porque possuem o nome (static)

    Se por acaso a classe não fosse estática, teria que declarar um objeto da
    classe para conseguir usar esse metódo. Ou seja, precisaria fazer nomeDaClasse nomeQualquerParaRepresentarObjeto = new nomeDaClasse();
    (Validacao objetoValidacao = new Validacao();) e
    chamar o metódo com o nomeDoObjetoCriado.nomeDoMetodo(objetoValidacao.validaTotalidade)
     */
    public static boolean validaTotalidade(double pontuacao){
        if(pontuacao >= 0 && pontuacao <= 2.5 ){
            return true;
        }
        return false;
    }


    /*
    Esse é um metódo que serve para validar a complexidade dos movimentos.
    a variável (pontuação) vai receber o valor dessa pontuação do atleta e validar se essa
    pontuação é pode ser aceita ou não. Essa pontuação é aceita se ela for de 0.9 à 9. Então
    o metódo retorna um true se essa pontuação for válida e false se ela não tiver no intervalo de
    0.9 à 9

     */
    public static boolean validaComplexidade(double pontuacao) {
        if(pontuacao>=0.9 && pontuacao<=9){
            return true;
        }
        return false;
    }


    /*
    Esse é um metódo que serve para validar a exatidão dos movimentos.
    a variável (pontuação) vai receber o valor dessa pontuação do atleta e validar se essa
    pontuação é pode ser aceita ou não. Essa pontuação é aceita se ela for de 0 à 10. Então
    o metódo retorna um true se essa pontuação for válida e false se ela não tiver no intervalo de
    0 à 10

     */
    public static boolean validaExatidao(double pontuacao) {
        if(pontuacao>=0 && pontuacao<=10){
            return true;
        }
        return false;
    }
}
