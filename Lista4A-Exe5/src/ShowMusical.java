import java.time.LocalDate;

public class ShowMusical extends Evento {
    private String nomeBanda;
    private String estiloMusical;

    public String getNomeBanda() {
        return nomeBanda;
    }

    public ShowMusical(String titulo, float valor, LocalDate data, 
    		String nomeBanda, String estiloMusical) {
        super(titulo, valor, data);
        setNomeBanda(nomeBanda);
        setEstiloMusical(estiloMusical);
    }

    @Override
    public String exibir() {
        String mensagem = getTitulo() + " de "
                + getEstiloMusical()  +  " de "
                + getNomeBanda() + " com ingressos a R$"
                + String.format("%.2f", getValor());
        if (this.a != null) {
            mensagem += ", contou com " + getQtdPagantes()
                    + " pagantes no dia " + getData().getDayOfMonth()
                    + "/" + getData().getMonthValue() + "/" + getData().getYear()
                    + ". Opini„o: "
                    + getOpiniaoGeral() + ".";
        } else {
            mensagem += ". Ainda n„o avaliado.";
        }
        return  mensagem;
    }

    public void setNomeBanda(String nomeBanda) {
        if (nomeBanda != null && !nomeBanda.isBlank()) {
            this.nomeBanda = nomeBanda;
        } else {
            throw new IllegalArgumentException("Banda inv·lida");
        }
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        if (estiloMusical != null && !estiloMusical.isBlank()) {
            this.estiloMusical = estiloMusical;
        } else {
            throw new IllegalArgumentException("Estilo Musical inv√°lido");
        }
    }
}
