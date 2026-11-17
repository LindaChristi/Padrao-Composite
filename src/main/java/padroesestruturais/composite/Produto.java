package padroesestruturais.composite;

public class Produto extends ItemEstoque {

    private int quantidade;

    public Produto(String descricao, int quantidade) {
        super(descricao);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getConteudo() {
        return "Produto: " + this.getDescricao() + " - quantidade: " + this.quantidade + "\n";
    }

}