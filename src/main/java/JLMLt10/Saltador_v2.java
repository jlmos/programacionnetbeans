/* Modificar esta interfaz añadiendole el método llamado saltaPertiga
que recibe como parámetro y una altura en cm y devuelva true si ha logrado el salto 
y false si no lo ha logrado. Qué ocurre con la clase TriAtleta_v2? Desarrolla 
saltaPertiga como método default en la interfaz de forma que por defecto devuelva false.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;

public interface Saltador_v2 {

    int saltarAltura();

    /*
        Al añadir este método, la clase TriAtleta al implementar esta interfaz, da error por no tener
        descrito el método nuevo.
        Al escribir una implementación por defecto, evitamos este problema, aunque se puede
        sobreescribir en la clase para modificar su comportamiento.
     */
    default boolean saltaPertiga(int alturaCM) {
        return false;
    }

}