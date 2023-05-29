import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalTest {

    Estoque estoque;

    @BeforeEach
    void setUp(){
        estoque = new Estoque(
                new Produto("Chocolate Lacta", 9.90),
                new Produto("Chocolate Lacta", 9.90),
                new Produto("Chocolate Lacta", 9.90),
                new Produto("Café Melitta", 26.90),
                new Produto("Café Melitta", 26.90),
                new Produto("Biscoito Amanteigado", 19.90),
                new Produto("Biscoito Amanteigado", 19.90),
                new Produto("Biscoito Amanteigado", 19.90),
                new Produto("Biscoito Amanteigado", 19.90)
        );
    }

    @Test
    void deveContarProdutosEstoque(){
        assertEquals(9, Capital.contarProdutos(estoque));
    }

    @Test
    void deveCalcularValorEstoque(){
        assertEquals(163.1, Capital.getValorEstoque(estoque), 0.01);
    }
}
