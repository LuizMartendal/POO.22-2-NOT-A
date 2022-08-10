public class Produto
{
    // Variáveis de instância
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int desconto;

 

    /**
     * Construtor para objetos da classe Produto
     */
    
    public Produto(String nome, String descricao, double precoUnitario, int desconto)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPrecoUnitario(precoUnitario);
        this.setDesconto(desconto);
    }

 

    public String getNome () {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getDescricao () {
        return descricao;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public double getPrecoUnitario () {
        return precoUnitario;
    }
    
    public void setPrecoUnitario (double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public int getDesconto () {
        return desconto;
    }
    
    public void setDesconto (int desconto) {
        this.desconto = desconto;
    }
}
 