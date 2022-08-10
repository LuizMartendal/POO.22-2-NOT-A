
/**
 * Escreva uma descrição da classe FabricaDeProdutos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FabricaDeProdutos
{

    public void fabricar()
    {
        Produto produto1;
        produto1 = new Produto("Caderno", "Caderno em espiral tamanho médio", 4.50f, 15);

        Produto produto2 = new Produto("Caneta ESF", "Caneta esferográfica 5mm", 1.20f, 2);
        Produto produto3 = new Produto("Esquadro", "Esquadro de acrílico 20 cm", 2.35f, 10);
    }
}
