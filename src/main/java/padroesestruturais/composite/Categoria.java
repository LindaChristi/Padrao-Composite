package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemEstoque {

    private List<ItemEstoque> conteudos;

    public Categoria(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<ItemEstoque>();
    }

    public void addConteudo(ItemEstoque conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (ItemEstoque conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
