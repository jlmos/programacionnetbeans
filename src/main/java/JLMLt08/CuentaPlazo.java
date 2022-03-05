/* ejercicio 8.9-2)Crea una clase hija llamada CuentaPlazo igual que la anterior, pero sin comisiones.
Además tiene un nuevo atributo, que es la fecha de creación. 3)Esta nueva clase ya no permitirá que 
haya subclases de ella. 4)Crea un constructor para la nueva clase que incorpore la incialización de la 
fecha de creación al día en curso. 5) Sobrescribe el método retirar () para que no que no calcule comisiones. Revisa los
modificadores de acceso de atributos y quizás tengas que crear algún getter/setter. 
autor: jose luis mosquera losada
fecha: 22-01-2022*/
package JLMLt08;

import java.time.LocalDate;

public final class CuentaPlazo extends CuentaCorriente {

    private LocalDate fechaCreacion;

    public CuentaPlazo(String iban) {
        super(iban);
        setComision(0, 0);
        this.fechaCreacion = LocalDate.now();
    }

    @Override
    public boolean retirar(float importe) {
        if (importe <= getSaldo()) {
            setSaldo(getSaldo() - importe);  //resta (importe+comision)
            setContadorIngresos(0);
            return true;
        } else return false;
    }
}
