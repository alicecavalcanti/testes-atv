package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidacaoTest {

    /*
        Na classe de teste é onde você vai ter documentado todos os casos de teste. O assertEquals
        vai comparar se os dois valores passados são iguais, ou seja, se o valor esperado é igual ao
        retorno do metódo Validacao.validaTotalidade(valor da pontuação do atleta)
     */
    @Test
    public void validaTotalidade(){
        assertEquals( false/*valor que eu quero que retorne*/ , Validacao.validaTotalidade(-1)/*valor retornado pelo metódo*/);
        assertEquals( true , Validacao.validaTotalidade(0));
        assertEquals( true , Validacao.validaTotalidade(1));
        assertEquals( true , Validacao.validaTotalidade(2.4));
        assertEquals( true , Validacao.validaTotalidade(2.5));
        assertEquals( false , Validacao.validaTotalidade(2.6));
    }

    @Test
    public void validaComplexidade(){
        assertEquals( false , Validacao.validaComplexidade(0.8));
        assertEquals( true , Validacao.validaComplexidade(0.9));
        assertEquals( true , Validacao.validaComplexidade(1.0));
        assertEquals( true , Validacao.validaComplexidade(8.9));
        assertEquals( true , Validacao.validaComplexidade(9));
        assertEquals( false , Validacao.validaComplexidade(9.1));
    }


    @Test
    public void validaExatidao(){
        assertEquals(false, Validacao.validaExatidao(-1));
        assertEquals(true, Validacao.validaExatidao(0));
        assertEquals(true, Validacao.validaExatidao(1));
        assertEquals(true, Validacao.validaExatidao(9));
        assertEquals(true, Validacao.validaExatidao(10));
        assertEquals(false, Validacao.validaExatidao(11));
    }

}