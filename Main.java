package interfaces;

import interfaces.clases.*;

public class Main {
    public static void info(Persona per)
    {
        System.out.println(per.getNombre());
    }
    public static void main(String[] args)
    {
        Persona juan = null;
        juan = new Maestro("12345", "Juan Carlos", "juan@mail.com");
        System.out.println(juan.getNombre());
        info(juan);
    }
}