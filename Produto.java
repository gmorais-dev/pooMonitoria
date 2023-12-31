// Classe Produto
// apos definir os tipós que vamos definir os atribudos como ID,nome e preco.
//apos vamos criar um construtor,métodos getters e setters, e um método toString() para representação textual.
// no getter e setter vamos ter a possibilidade de manipular os atributos, levando em conta que podemos garantir o controle de proteção dos atributos.

class Produto { 
    private int id;
    private String nome;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: " + preco;
    }

}

   