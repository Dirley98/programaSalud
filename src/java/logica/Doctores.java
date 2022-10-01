package logica;

/**
 *
 * @author Dirley Puentes
 */
public class Doctores extends Servicios {

    //Constructor de la clase
    public Doctores() {
    }

    //metodo para Armar e Imprimir String del Doctor
    @Override
    public String imprimir(String doctor) {

        //Instanciar objeto
        Pacientes pa = new Pacientes();

        //Declarar variable que entrega el resultado final
        String respuesta = "";

        //switch donde se selecciona el Doctor y se arman los datos 
        switch (doctor) {
            case "Doctor 1":
                respuesta = this.doctor1 + "<br> " + getHospital1() + "<br> <br>Pacientes a su cargo: <br>" + pa.getJuan() + "<br>" + pa.getFabian();
                break;
            case "Doctor 2":
                respuesta = this.doctor2 + "<br> " + getClinica1() + "<br> <br>Pacientes a su cargo: <br>" + pa.getClaudia() + "<br>" + pa.getCaterine();
                break;
            case "Doctor 3":
                respuesta = this.doctor3 + "<br> " + getCentroSalud1()+ "<br> <br>Pacientes a su cargo: <br>" + pa.getCamilo()+ "<br>" + pa.getYeimi();
                break;
            default:
                respuesta = "Error ¡Intente otra vez escogiendo un doctor!";
        }

        return respuesta;

    }
    
    //Atributos de la subclase
    private String doctor1 = "Doctor: Olvar Salinas";
    private String doctor2 = "Doctora: Maria Gutierrez";
    private String doctor3 = "Doctora: Lucia Franco";

    //Métodos de Encapsulamiento
    public void setDoctor1(String doctor1) {
        this.doctor1 = doctor1;
    }

    public void setDoctor2(String doctor2) {
        this.doctor2 = doctor2;
    }

    public void setDoctor3(String doctor3) {
        this.doctor3 = doctor3;
    }

    public String getDoctor1() {
        return doctor1;
    }

    public String getDoctor2() {
        return doctor2;
    }

    public String getDoctor3() {
        return doctor3;
    }

}
