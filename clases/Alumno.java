package interfaces.clases;

public class Alumno implements Persona {
    private String expediente;
    private String nombre;
    private String email;

    public Alumno (String expediente, String nombre, String email) 
    {
        this.expediente = expediente;
        this.nombre = nombre;
        this.email = email;
    }

    public String getExpediente()
    {
        return getClave();
    }
    public String getClave()
    {
        return expediente;
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

