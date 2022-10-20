import java.time.LocalDate;

public class Evento {
    private String titulo;
    private float valor;
    private LocalDate data;
    protected Avaliacao a;

    public Evento(String titulo, float valor, LocalDate data) {
        setTitulo(titulo);
        setValor(valor);
        setData(data);
    }

    public String exibir(){
        String mensagem = titulo + ", no dia" +
                data.getDayOfMonth() + "/" +
                data.getMonthValue() + "/" +
                data.getYear() + ", ingressos a R$"
                + String.format("%.2f", valor);
        if (this.a != null) {
            mensagem += ", teve " + a.getQtdPagantes()
                      + " pagantes que acharam o evento "
                      + a.getOpiniaoGeral();
        } else {
            mensagem += ". Ainda n„o avaliado";
        }
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("TÌtulo inv·lido");
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor do evento n√£o pode ser maior do que zero");
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data != null) {
            this.data = data;
        } else {
            throw new IllegalArgumentException("Data inv·lida");
        }
    }

    public String getOpiniaoGeral() {
        return a.getOpiniaoGeral();
    }

    public int getQtdPagantes() {
        return a.getQtdPagantes();
    }

    public void setAvaliacao(Avaliacao a) {
        if (a != null) {
            this.a = a;
        } else {
            throw new IllegalArgumentException("AvaliaÁ„o inv√°lida");
        }
    }
}
