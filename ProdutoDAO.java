import java.util.ArrayList;
import java.util.List;




// Classe ProdutoDAO para manipulação dos produtos


class ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    public void adicionarProduto(Produto produto) {
        produto.setId(nextId);
        nextId++;
        produtos.add(produto);
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == produto.getId()) {
                produtos.set(i, produto);
                break;
            }
        }
    }

    public void removerProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}

