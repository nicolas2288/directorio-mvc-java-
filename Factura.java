public class Factura implements Prototipo {
    private String numeroFactura;
    private String cliente;
    private String fecha;
    private double subtotal;
    private double impuestos;

    public Factura(String numeroFactura, String cliente, String fecha, double subtotal, double impuestos) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
    }

    public Factura(Factura facturaOriginal) {
        this.numeroFactura = facturaOriginal.numeroFactura;
        this.cliente = facturaOriginal.cliente;
        this.fecha = facturaOriginal.fecha;
        this.subtotal = facturaOriginal.subtotal;
        this.impuestos = facturaOriginal.impuestos;
    }

    @Override
    public Prototipo clonar() {
        return new Factura(this);
    }

    public String getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(String numeroFactura) { this.numeroFactura = numeroFactura; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
    public double getImpuestos() { return impuestos; }
    public void setImpuestos(double impuestos) { this.impuestos = impuestos; }

    @Override
    public String toString() {
        return "Factura [No=" + numeroFactura + " | Cliente=" + cliente + " | Fecha=" + fecha + " | Subtotal=$" + subtotal + " | Impuestos=$" + impuestos + "]";
    }
}
