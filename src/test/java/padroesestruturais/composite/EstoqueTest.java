package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {

    @Test
    void deveRetornarConteudoEstoque() {
        Categoria categoria1 = new Categoria("Madeiras");
        Produto produto11 = new Produto("Eucalipto", 100);
        Produto produto12 = new Produto("Pinus", 80);
        categoria1.addConteudo(produto11);
        categoria1.addConteudo(produto12);

        Categoria categoria2 = new Categoria("Ferramentas");
        Produto produto21 = new Produto("Serrote", 15);
        categoria2.addConteudo(produto21);

        Categoria categoria3 = new Categoria("Materiais de construcao");
        Produto produto31 = new Produto("Cimento", 50);
        categoria3.addConteudo(produto31);

        Categoria estoque = new Categoria("Materiais");
        estoque.addConteudo(categoria1);
        estoque.addConteudo(categoria2);
        estoque.addConteudo(categoria3);

        Estoque estoquePrincipal = new Estoque();
        estoquePrincipal.setConteudo(estoque);

        assertEquals("Categoria: Materiais\n" +
                "Categoria: Madeiras\n" +
                "Produto: Eucalipto - quantidade: 100\n" +
                "Produto: Pinus - quantidade: 80\n" +
                "Categoria: Ferramentas\n" +
                "Produto: Serrote - quantidade: 15\n" +
                "Categoria: Materiais de construcao\n" +
                "Produto: Cimento - quantidade: 50\n", estoquePrincipal.getEstoque());
    }

    @Test
    void deveRetornarExcecaoEstoqueSemConteudo() {
        try {
            Estoque estoque = new Estoque();
            estoque.getEstoque();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Estoque sem conteúdo", e.getMessage());
        }
    }
}