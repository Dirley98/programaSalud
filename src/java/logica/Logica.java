package logica;

/**
 *
 * @author Dirley Puentes
 */
public class Logica {

    //Instanciar objetos
    Pacientes pa = new Pacientes();
    Doctores doc = new Doctores();
    Servicios serv = new Servicios();
    
    //metodo que lee el valor de paciente y retorna la Respuesta
    public String paciente(String paciente) {
        return getRespuestaPaciente(paciente);
    }

    //invoca el metodo de imprimir paciente y lo retona al metodo paciente
    public String getRespuestaPaciente(String paciente) {
        return pa.imprimir(paciente);
    }

    //metodo que lee el valor de Doctor y retorna la Respuesta
    public String doctor(String doctor) {
        return getRespuestaDoctor(doctor);
    }

    //invoca el metodo de imprimir Doctor y lo retona al metodo Doctor
    public String getRespuestaDoctor(String doctor) {
        return doc.imprimir(doctor);
    }
    
    //metodo que lee el valor de Servicio y retorna la Respuesta
    public String servicio(String servicio) {
        return getRespuestaServicio(servicio);
    }

    //invoca el metodo de imprimir Servicio y lo retona al metodo Servicio
    public String getRespuestaServicio(String servicio) {
        return serv.imprimir(servicio);
    }
}
