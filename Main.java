public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto1 = new Produto(0, "Camiseta", 29.99);
        Produto produto2 = new Produto(0, "Calça Jeans", 59.99);

        produtoDAO.adicionarProduto(produto1);
        produtoDAO.adicionarProduto(produto2);

        System.out.println("Lista de Produtos:");
        for (Produto produto : produtoDAO.listarProdutos()) {
            System.out.println(produto);
        }

        Produto produtoEncontrado = produtoDAO.buscarProduto(1);
        if (produtoEncontrado != null) {
            produtoEncontrado.setPreco(39.99);
            produtoDAO.atualizarProduto(produtoEncontrado);
        }

        System.out.println("Produto atualizado:");
        System.out.println(produtoEncontrado);

        produtoDAO.removerProduto(2);

        System.out.println("Lista de Produtos após exclusão:");
        for (Produto produto : produtoDAO.listarProdutos()) {
            System.out.println(produto);
        }
    }
}