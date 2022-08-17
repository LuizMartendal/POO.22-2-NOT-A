
/**
 * Escreva uma descrição da classe InteiroPositivo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class InteiroPositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    // item a
    public void setValor(int valor){
        if (valor >= 0){
            this.x = valor;
        }
    }

    public int getValor(){
        return this.x;
    }

    // item b
    public long multiplicar(InteiroPositivo outro){
        return this.x * outro.getValor();
    }

    // item c
    public long fatorial(){
        long fat = 1;
        for (int i = this.x; i > 1; i--){
            fat = fat * i;
        }
        return fat;
    }

    // item d
    public String divisoresInteiros(){
        int contador = 0;
        String str = "Os divisores são ";
        for(int i = 1; i <= this.x; i++){
            if(this.x%i == 0){
                str += i+", ";
                contador++;
            }
        }
        str += " e a quantidade de divisores é " + contador;
        return str;
    }

    // item e
    public int[] fibonacci(){
        int[] vetor = new int[this.x];
        if (vetor.length > 0){
            vetor[0] = 1;
            if (vetor.length > 1){
                vetor[1] = 1;
            }
        }
        for (int i = 2; i < vetor.length; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        return vetor;
    }
}
