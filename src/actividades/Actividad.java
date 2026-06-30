
package actividades;

import java.time.LocalDate;
import java.time.LocalTime;



public class Actividad {
    private ActividadEducativa actividad;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int cupoMaximo;
    private Usuario[] usuarios;

    public ActividadEducativa getActividad() {
        return actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public Actividad(ActividadEducativa actividad, String nombre, LocalDate fecha, LocalTime hora, int cupoMaximo) {
        this.actividad = actividad;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.usuarios = new Usuario[cupoMaximo];
    }
    
    public boolean cuposDisponibles(){
        for (int i = 0; usuarios.length < 10; i++) {
            if (clientes[i] == null) {
                return true;
            }
        }
        return false;
    }
    
    public void inscribirUsuario(Usuario usuario){
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                clientes[i] = usuario;
                
            }
            
        }
    }
    
    
    
    
    
}
