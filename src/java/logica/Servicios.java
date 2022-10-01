package logica;

/**
 *
 * @author Dirley Puentes
 */
public class Servicios {

    //Atributos de la clase
    private String hospital1 = "Hospital: San Rafael - Facatativa";
    private String clinica1 = "Clinica: Medifaca - Facatativa";
    private String centroSalud1 = "Centro de salud: Los Molinos - Facatativa";
    
   //metodo para Armar String del contenido del servicio
    public String imprimir(String servicio) {
        
        //Instanciar objeto
        Pacientes pa = new Pacientes();
        Doctores doc = new Doctores();
        
        //Declarar variable que entrega el resultado final
        String respuesta = "";
        
        //switch donde se selecciona el paciente
        switch (servicio) {
            case "Hospital":
                respuesta = this.hospital1 + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor1() + "<br>Doctor: Juan Mesa "+"<br> <br>Pacientes del Hospital: <br>" + pa.getJuan() + "<br>" + pa.getFabian();
                break;
            case "Clinica":
                respuesta = this.clinica1 + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor2() + "<br>Doctor: Feliciano Rodriguez "+"<br> <br>Pacientes de la Clinica: <br>" + pa.getCaterine() + "<br>" + pa.getClaudia();
                break;
            
            case "CentroDeSalud":
                respuesta = this.centroSalud1 + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor1() + "<br>Doctor: Alejandro Alarcon "+"<br> <br>Pacientes del Centro de Salud: <br>" + pa.getYeimi()+ "<br>" + pa.getCamilo();
                break;
           

            default:
                respuesta = "Error ¡Intente otra vez escogiendo un Servicio!";
        }

        return respuesta;

    }
    
    
    //Constructor de la clase
    public Servicios() {
    }

    
    
    //Métodos de Encapsulamiento
    public String getHospital1() {
        return hospital1;
    }

    public void setHospital1(String hospital1) {
        this.hospital1 = hospital1;
    }

   

    public String getClinica1() {
        return clinica1;
    }

    public void setClinica1(String clinica1) {
        this.clinica1 = clinica1;
    }

   
    public String getCentroSalud1() {
        return centroSalud1;
    }

    public void setCentroSalud1(String centroSalud1) {
        this.centroSalud1 = centroSalud1;
    }

    
}
