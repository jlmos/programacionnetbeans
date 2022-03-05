/*  Copia la última versión de las clases Figura2D, Triangulo, Triancolor como una nueva versión
de las mismas (añade sufijo _v8) y realizar los siguientes cambios:
1) Añadir a la clase Figura2D_v9 un atributo privado llamado nombre de tipo String.
2) Añadir el getter/setter de ese campo y modificar los constructores de dicha clase para incorporar
como parámetro el nombre de la figura (en el constructor por defecto se le asignará valor null).
autor: jose luis mosquera losada
fecha: 21-01-2022 */
package JLMLt10;

public abstract class Figura2D_v9 {

    private double ancho;
    private double alto;
    private String nombre;

    public Figura2D_v9() {
        this.alto = 0;
        this.ancho = 0;
        this.nombre = null;
    }

    public Figura2D_v9(double ancho, double alto, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public Figura2D_v9(double altoancho, String nombre) {
        this.ancho = altoancho;
        this.alto = altoancho;
        this.nombre = nombre;
    }

    public Figura2D_v9(Figura2D_v9 figura2D_v7) {
        this.alto = figura2D_v7.alto;
        this.ancho = figura2D_v7.ancho;
        this.nombre = getNombre();
    }

    public void verDim() {
        System.out.printf("Ancho: %.2f | Alto: %.2f\n", ancho, alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double area();
    
    public double precio(float precioMetroCuadrado) {
        return area() * precioMetroCuadrado;
    }
    
    }
