public class Contrato implements Prototipo {
    private String numeroContrato;
    private String contratista;
    private String entidadContratante;
    private double valor;
    private String duracion;

    // Constructor completo para definir la plantilla original
    public Contrato(String numeroContrato, String contratista, String entidadContratante, double valor, String duracion) {
        this.numeroContrato = numeroContrato;
        this.contratista = contratista;
        this.entidadContratante = entidadContratante;
        this.valor = valor;
        this.duracion = duracion;
    }

    // Constructor de copia: copia los datos de un objeto a otro nuevo en memoria
    public Contrato(Contrato contratoOriginal) {
        this.numeroContrato = contratoOriginal.numeroContrato;
        this.contratista = contratoOriginal.contratista;
        this.entidadContratante = contratoOriginal.entidadContratante;
        this.valor = contratoOriginal.valor;
        this.duracion = contratoOriginal.duracion;
    }

    // AQUÍ SE APLICA EL PATRÓN PROTOTYPE
    @Override
    public Prototipo clonar() {
        return new Contrato(this); // Retorna una copia 100% independiente
    }

    // Getters y Setters para modificar los datos de las copias libremente
    public String getNumeroContrato() { return numeroContrato; }
    public void setNumeroContrato(String numeroContrato) { this.numeroContrato = numeroContrato; }

    public String getContratista() { return contratista; }
    public void setContratista(String contratista) { this.contratista = contratista; }

    public String getEntidadContratante() { return entidadContratante; }
    public void setEntidadContratante(String entidadContratante) { this.entidadContratante = entidadContratante; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }

    @Override
    public String toString() {
        return "Contrato [No=" + numeroContrato + " | Contratista=" + contratista + 
               " | Entidad=" + entidadContratante + " | Valor=$" + valor + " | Duración=" + duracion + "]";
    }
}
