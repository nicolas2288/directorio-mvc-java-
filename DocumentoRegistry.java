import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistry {
    private Map<String, Prototipo> plantillas = new HashMap<>();

    public DocumentoRegistry() {
        Contrato contratoBase = new Contrato("CON-000", "Por asignar", "Empresa Ejemplo S.A.", 0.0, "12 meses");
        plantillas.put("contrato", contratoBase);

        Factura facturaBase = new Factura("FAC-000", "Consumidor Final", "14/10/2026", 0.0, 0.0);
        plantillas.put("factura", facturaBase);

        PropuestaComercial propuestaBase = new PropuestaComercial("PROP-000", "Por asignar", "Consultoría TI", 1000.0, "30 días");
        plantillas.put("propuesta", propuestaBase);
    }

    public void registrarPlantilla(String clave, Prototipo prototipo) {
        plantillas.put(clave, prototipo);
    }

    public Prototipo obtenerClon(String clave) {
        Prototipo plantilla = plantillas.get(clave.toLowerCase());
        if (plantilla != null) {
            return plantilla.clonar();
        }
        return null;
    }
}
