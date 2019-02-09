
package Modelo;

/**
 *
 * @author GERALDIN
 */
public abstract class Persona {
    
    private String nombre, apellido, sexo, tsangre, ntelefono, id;
    private int edad;


    public Persona(String nombre, String apellido, String id, String sexo , String tsangre, String ntelefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.sexo = sexo;
        this.tsangre = tsangre;
        this.ntelefono = ntelefono;
        this.edad = edad;
    }
        public Persona() {
        nombre = "";
        apellido = "";
        id = "";
        sexo = "";
        tsangre = "";
        ntelefono = "";
        edad = 0;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTsangre() {
        return tsangre;
    }

    public void setTsangre(String tsangre) {
        this.tsangre = tsangre;
    }

    public String getNtelefono() {
        return ntelefono;
    }

    public void setNtelefono(String ncelular) {
        this.ntelefono = ncelular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}


