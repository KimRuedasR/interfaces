package interfaces.clases;

public class Maestro implements Persona {
    private String clave;
    private String nombre;
    private String email;

    public Maestro (String clave, String nombre, String email) 
    {
        this.clave = clave;
        this.nombre = nombre;
        this.email = email;
    }

    public String getClave()
    {
        return clave;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getEmail()
    {
        return email;
    }
}

