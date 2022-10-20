public class Avaliacao {
    private int qtdPagantes;
    private String opiniaoGeral;

    public Avaliacao(int qtdPagantes, String opiniaoGeral) {
        setOpiniaoGeral(opiniaoGeral);
        setQtdPagantes(qtdPagantes);
    }

    public int getQtdPagantes() {
        return qtdPagantes;
    }

    public void setQtdPagantes(int qtdPagantes) {
        if (qtdPagantes >= 0) {
            this.qtdPagantes = qtdPagantes;
        } else {
            throw new IllegalArgumentException("Quantidade de pagantes precisa ser positiva");
        }
    }

    public String getOpiniaoGeral() {
        return opiniaoGeral;
    }

    public void setOpiniaoGeral(String opiniaoGeral) {
        if (opiniaoGeral != null && !opiniaoGeral.isBlank()) {
            this.opiniaoGeral = opiniaoGeral;
        } else {
            throw new IllegalArgumentException("Opini„o geral inv√°lida");
        }
    }
}