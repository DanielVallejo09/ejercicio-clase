
public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int clavaIni, String nombreIni)
    {
        
    }
    
    public String dimeDetalles()
    /**
     * este metodo nos va a decir los detalles del alumo 
     */
    {
        return "Clave: " + clave + "Nombre: " + nombre;
    }
    
    public int dimeClave()
    /**
     * Este metodo nos regresara la clave del alumno y la usaremos para usarla en la clase grupo
     */
    {
        return clave;
    }
}