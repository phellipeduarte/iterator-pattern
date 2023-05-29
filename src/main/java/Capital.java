import java.util.ArrayList;

public class Capital {

    public static Integer contarProdutos(Estoque estoque){
        int quantidade = 0;
        for (Produto produto : estoque){
            quantidade++;
        }
        return quantidade;
    }

    public static Double getValorEstoque(Estoque estoque){
        Double valor = 0.0;
        for(Produto produto : estoque){
            valor += produto.getPreco();
        }
        return valor;
    }
}
