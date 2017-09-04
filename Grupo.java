public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    
    
    public Grupo(int totalEstudiantes, String nombreMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nombreMateria = nombreMateria; // palabra para decir que este 
    }
    
    
    private int buscaEspacioDisponible()
    
    {
        /**
         * busca un espacio disponible en el arreglo
         * return regresa la posicion nuela dentro del arreglo
         */
        
        for(int i=0; i<estudiantes.length; i++)
        {
            if (estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    public boolean inscribir(Estudiante unEstudiante)
    {
        /**
         * inscribe a un estudiante nuevo en el grupo
         * param un Estudiante es el objeto estudiante a inscribir en el grupo
         * return Regresa verdadero si el estudiante fue inscrito o falso e caso de que no se pueda inscribir
         */
        
        int existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if(existe != -1)
        {
            return false;// el estudiante ya esta inscrito
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible == -1)
        {
            return false; // el arreglo esta lleno
        }
        
        
      
        if(estudiantes[0] == null)
        {
           estudiantes[0] = unEstudiante;
        }
        estudiantes[posDisponible] = unEstudiante;
        return true;
    }
    
    
  
    public boolean darDeBaja(int claveBaja, Estudiante unEstudiante)
    {
        /**
         * buscar al estudiante con su clave
         * le asignamos null
        **/
        int buscaA = this.buscarEstudiante(unEstudiante.dimeClave());
          if(unEstudiante.dimeClave() == claveBaja)
            {
              return true;
            }
            else
            {
                return false;
            }
    }
    
    private int buscarEstudiante(int clave)
    {
        /**
        //Busca a un estudiante por medio de su clave
        // param ClaveEstudiante parametro que representa la clave del estudiante buscar
        //regresa la posicion del estudiante si no lo encuentra regresa -1
        **/ 
        
        int i;
        for(i=0; i<estudiantes.length; i++)
        {
            if(estudiantes[i].dimeClave() == clave)
            {
                return i;
            }
        }
        return -1;
    }
}
