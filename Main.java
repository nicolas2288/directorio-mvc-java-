import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentoRegistry bodega = new DocumentoRegistry();
        List<Prototipo> documentosCreados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("==================================================");
        System.out.println("   SISTEMA DE GESTIÓN DE DOCUMENTOS (PROTOTYPE)   ");
        System.out.println("==================================================");

        do {
            System.out.println("\n--- MENÚ INTERACTIVO ---");
            System.out.println("1. Clonar y crear un nuevo Contrato");
            System.out.println("2. Clonar y crear una nueva Factura");
            System.out.println("3. Clonar y crear una nueva Propuesta Comercial");
            System.out.println("4. Consultar todos los documentos generados");
            System.out.println("5. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = teclado.nextInt();
                teclado.nextLine(); 
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número válido.");
                teclado.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    Contrato nuevoContrato = (Contrato) bodega.obtenerClon("contrato");
                    System.out.println("\n[INFO] Plantilla de Contrato clonada con éxito.");
                    System.out.print("Ingrese el número de contrato: ");
                    nuevoContrato.setNumeroContrato(teclado.nextLine());
                    System.out.print("Ingrese el nombre del contratista: ");
                    nuevoContrato.setContratista(teclado.nextLine());
                    System.out.print("Ingrese el valor del contrato: ");
                    nuevoContrato.setValor(teclado.nextDouble());
                    teclado.nextLine(); 
                    documentosCreados.add(nuevoContrato);
                    System.out.println("[ÉXITO] Documento guardado de manera independiente.");
                    break;

                case 2:
                    Factura nuevaFactura = (Factura) bodega.obtenerClon("factura");
                    System.out.println("\n[INFO] Plantilla de Factura clonada con éxito.");
                    System.out.print("Ingrese el número de factura: ");
                    nuevaFactura.setNumeroFactura(teclado.nextLine());
                    System.out.print("Ingrese el nombre del cliente: ");
                    nuevaFactura.setCliente(teclado.nextLine());
                    System.out.print("Ingrese el subtotal: ");
                    nuevaFactura.setSubtotal(teclado.nextDouble());
                    System.out.print("Ingrese los impuestos: ");
                    nuevaFactura.setImpuestos(teclado.nextDouble());
                    teclado.nextLine(); 
                    documentosCreados.add(nuevaFactura);
                    System.out.println("[ÉXITO] Documento guardado de manera independiente.");
                    break;

                case 3:
                    PropuestaComercial nuevaPropuesta = (PropuestaComercial) bodega.obtenerClon("propuesta");
                    System.out.println("\n[INFO] Plantilla de Propuesta clonada con éxito.");
                    System.out.print("Ingrese el número de propuesta: ");
                    nuevaPropuesta.setNumeroPropuesta(teclado.nextLine());
                    System.out.print("Ingrese el nombre del cliente: ");
                    nuevaPropuesta.setCliente(teclado.nextLine());
                    System.out.print("Ingrese el valor comercial: ");
                    nuevaPropuesta.setValor(teclado.nextDouble());
                    teclado.nextLine(); 
                    documentosCreados.add(nuevaPropuesta);
                    System.out.println("[ÉXITO] Documento guardado de manera independiente.");
                    break;

                case 4:
                    System.out.println("\n==================================================");
                    System.out.println("       LISTA DE DOCUMENTOS EN EL ARRAYLIST        ");
                    System.out.println("==================================================");
                    if (documentosCreados.isEmpty()) {
                        System.out.println("No se ha generado ninguna copia todavía.");
                    } else {
                        for (Prototipo doc : documentosCreados) {
                            System.out.println(doc.toString());
                        }
                    }
                    System.out.println("==================================================");
                    break;

                case 5:
                    System.out.println("\nSaliendo del sistema de gestión. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        teclado.close();
    }
}
