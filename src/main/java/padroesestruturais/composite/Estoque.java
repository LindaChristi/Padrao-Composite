package padroesestruturais.composite;

public class Estoque {

    private ItemEstoque conteudo;

    public void setConteudo(ItemEstoque conteudo) {
        this.conteudo = conteudo;
    }

    public String getEstoque() {
        if (this.conteudo == null) {
            throw new NullPointerException("Estoque sem conteúdo");
        }
        return this.conteudo.getConteudo();
    }
}
