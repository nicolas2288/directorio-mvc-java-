public class PropuestaComercial implements Prototipo {
    private String numeroPropuesta;
    private String cliente;
    private String descripcionServicio;
    private double valor;
    private String vigencia;

    public PropuestaComercial(String numeroPropuesta, String cliente, String descripcionServicio, double valor, String vigencia) {
        this.numeroPropuesta = numeroPropuesta;
        this.cliente = cliente;
        this.descripcionServicio = descripcionServicio;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public PropuestaComercial(PropuestaComercial propuestaOriginal) {
        this.numeroPropuesta = propuestaOriginal.numeroPropuesta;
        this.cliente = propuestaOriginal.cliente;
        this.descripcionServicio = propuestaOriginal.descripcionServicio;
        this.valor = propuestaOriginal.valor;
        this.vigencia = propuestaOriginal.vigencia;
    }

    @Override
    public Prototipo clonar() {
        return new PropuestaComercial(this);
    }

    public String getNumeroPropuesta() { return numeroPropuesta; }
    public void setNumeroPropuesta(String numeroPropuesta) { this.numeroPropuesta = numeroPropuesta; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getDescripcionServicio() { return descripcionServicio; }
    public void setDescripcionServicio(String descripcionServicio) { this.descripcionServicio = descripcionServicio; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public String getVigencia() { return vigencia; }
    public void setVigencia(String vigencia) { this.vigencia = vigencia; }

    @Override
    public String toString() {
        return "Propuesta Comercial [No=" + numeroPropuesta + " | Cliente=" + cliente + " | Servicio=" + descripcionServicio + " | Valor=$" + valor + " | Vigencia=" + vigencia + "]";
    }
}
