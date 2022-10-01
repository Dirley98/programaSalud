package logica;

/**
 *
 * @author Dirley Puentes
 */
public class Pacientes extends Servicios {

    //Constructor de la clase
    public Pacientes() {
    }

    //metodo para Armar e Imprimir String del Paciente
    @Override
    public String imprimir(String paciente) {

        //Instanciar objeto
        Doctores doc = new Doctores();

        //Declarar variable que entrega el resultado final
        String respuesta = "";

        //switch donde se selecciona el Paciente
        switch (paciente) {
            case "Juan":
                respuesta = getHospital1() + "<br>" + "<br>" + doc.getDoctor1() + "<br>" + getJuan();
                break;
            case "Caterine":
                respuesta = getClinica1() + "<br>" + "<br>" + doc.getDoctor2() + "<br>" + getCaterine();
                break;
            case "Camilo":
                respuesta = getCentroSalud1() + "<br>" + "<br>" + doc.getDoctor3() + "<br>" + getCamilo();
                break;
            case "Yeimi":
                respuesta = getCentroSalud1() + "<br>" + "<br>" + doc.getDoctor3() + "<br>" + getYeimi();
                break;
            case "Fabian":
                respuesta = getHospital1() + "<br>" + "<br>" + doc.getDoctor1() + "<br>" + getFabian();
                break;
            case "Claudia":
                respuesta = getClinica1() + "<br>" + "<br>" + doc.getDoctor2() + "<br>" + getClaudia();
                break;

            default:
                respuesta = "Error ¡Intente otra vez escogiendo un paciente!";
        }

        return respuesta;

    }

    //Atributos de la subclase
    private String sexoM = "Masculino";
    private String sexoF = "Femenino";
    private int cod1 = 57362;
    private int cod2 = 45321;
    private int cod3 = 85246;
    private int cod4 = 85246;
    private int cod5 = 95135;
    private int cod6 = 15734;
    private String nombreJuan = "Juan Jose";
    private String apellidoJuan = "Castro velandia";
    private String direccionJuan = "Calle 12 #12-3";
    private String motivoJuan = "El paciente le duele la cabeza";
    private String fechaJuan = "31/09/2022";
    private String nombreCaterine = "Leidy Caterine";
    private String apellidoCaterine = "Rodriguez Piraquive";
    private String direccionCaterine = "Calle 5 #11-9";
    private String motivoCaterine = "El paciente tiene fuertes dolores en el abdomen";
    private String fechaCaterine = "29/09/2022";
    private String nombreCamilo = "Bairon Camilo";
    private String apellidoCamilo = "Medina Paez";
    private String direccionCamilo = "Calle 9 #12-7";
    private String motivoCamilo = "El paciente tiene se fracturo un pie";
    private String fechaCamilo = "30/09/2022";
    private String nombreYeimi = "Yeimi Rocio";
    private String apellidoYeimi = "Avila Garcia";
    private String direccionYeimi = "Calle 2B #9-17";
    private String motivoYeimi = "El paciente esta intoxicado";
    private String fechaYeimi = "28/09/2022";
    private String nombreFabian = "Carlos Fabian";
    private String apellidoFabian = "Gonzalez Triana";
    private String direccionFabian = "Calle 1 #1-6";
    private String motivoFabian = "El paciente fue picado por abejas";
    private String fechaFabian = "29/09/2022";
    private String nombreClaudia = "Claudia Milena";
    private String apellidoClaudia = "Sierra Alarcon";
    private String direccionClaudia = "Carrera 6  #18-12";
    private String motivoClaudia = "El paciente se corto con un cuchillo mientras cocinaba";
    private String fechaClaudia = "31/09/2022";

    //Funciones donde se arman los datos de los pacientes 
    public String getJuan() {
        return "<br> Nombres: " + this.nombreJuan + " <br> Apellidos: " + this.apellidoJuan + " <br> Codigo: " + this.cod1 + " <br> Sexo: " + this.sexoM + "<br> Direccion Residencia: " + this.direccionJuan + " <br> Motivo de consulta: " + this.motivoJuan + " <br> Fecha: " + this.fechaJuan;
    }

    public String getCaterine() {
        return "<br> Nombres: " + this.nombreCaterine + " <br> Apellidos: " + this.apellidoCaterine + " <br> Codigo: " + this.cod2 + " <br> Sexo: " + this.sexoF + "<br> Direccion Residencia: " + this.direccionCaterine + " <br> Motivo de consulta: " + this.motivoCaterine + " <br> Fecha: " + this.fechaCaterine;
    }

    public String getCamilo() {
        return "<br> Nombres: " + this.nombreCamilo + " <br> Apellidos: " + this.apellidoCamilo + " <br> Codigo: " + this.cod3 + " <br> Sexo: " + this.sexoM + "<br> Direccion Residencia: " + this.direccionCamilo + " <br> Motivo de consulta: " + this.motivoCamilo + " <br> Fecha: " + this.fechaCamilo;
    }

    public String getYeimi() {
        return "<br> Nombres: " + this.nombreYeimi + " <br> Apellidos: " + this.apellidoYeimi + " <br> Codigo: " + this.cod4 + " <br> Sexo: " + this.sexoF + "<br> Direccion Residencia: " + this.direccionYeimi + " <br> Motivo de consulta: " + this.motivoYeimi + " <br> Fecha: " + this.fechaYeimi;
    }

    public String getFabian() {
        return "<br> Nombres: " + this.nombreFabian + " <br> Apellidos: " + this.apellidoFabian + " <br> Codigo: " + this.cod5 + " <br> Sexo: " + this.sexoM + "<br> Direccion Residencia: " + this.direccionFabian + " <br> Motivo de consulta: " + this.motivoFabian + " <br> Fecha: " + this.fechaFabian;
    }

    public String getClaudia() {
        return "<br> Nombres: " + this.nombreClaudia + " <br> Apellidos: " + this.apellidoClaudia + " <br> Codigo: " + this.cod6 + " <br> Sexo: " + this.sexoF + "<br> Direccion Residencia: " + this.direccionClaudia + " <br> Motivo de consulta: " + this.motivoClaudia + " <br> Fecha: " + this.fechaClaudia;
    }

    //Métodos de Encapsulamiento
    public String getSexoM() {
        return sexoM;
    }

    public void setSexoM(String sexoM) {
        this.sexoM = sexoM;
    }

    public String getSexoF() {
        return sexoF;
    }

    public void setSexoF(String sexoF) {
        this.sexoF = sexoF;
    }

    public int getCod1() {
        return cod1;
    }

    public void setCod1(int cod1) {
        this.cod1 = cod1;
    }

    public int getCod2() {
        return cod2;
    }

    public void setCod2(int cod2) {
        this.cod2 = cod2;
    }

    public int getCod3() {
        return cod3;
    }

    public void setCod3(int cod3) {
        this.cod3 = cod3;
    }

    public int getCod4() {
        return cod4;
    }

    public void setCod4(int cod4) {
        this.cod4 = cod4;
    }

    public int getCod5() {
        return cod5;
    }

    public void setCod5(int cod5) {
        this.cod5 = cod5;
    }

    public int getCod6() {
        return cod6;
    }

    public void setCod6(int cod6) {
        this.cod6 = cod6;
    }

    public String getNombreJuan() {
        return nombreJuan;
    }

    public void setNombreJuan(String nombreJuan) {
        this.nombreJuan = nombreJuan;
    }

    public String getApellidoJuan() {
        return apellidoJuan;
    }

    public void setApellidoJuan(String apellidoJuan) {
        this.apellidoJuan = apellidoJuan;
    }

    public String getDireccionJuan() {
        return direccionJuan;
    }

    public void setDireccionJuan(String direccionJuan) {
        this.direccionJuan = direccionJuan;
    }

    public String getMotivoJuan() {
        return motivoJuan;
    }

    public void setMotivoJuan(String motivoJuan) {
        this.motivoJuan = motivoJuan;
    }

    public String getFechaJuan() {
        return fechaJuan;
    }

    public void setFechaJuan(String fechaJuan) {
        this.fechaJuan = fechaJuan;
    }

    public String getNombreCaterine() {
        return nombreCaterine;
    }

    public void setNombreCaterine(String nombreCaterine) {
        this.nombreCaterine = nombreCaterine;
    }

    public String getApellidoCaterine() {
        return apellidoCaterine;
    }

    public void setApellidoCaterine(String apellidoCaterine) {
        this.apellidoCaterine = apellidoCaterine;
    }

    public String getDireccionCaterine() {
        return direccionCaterine;
    }

    public void setDireccionCaterine(String direccionCaterine) {
        this.direccionCaterine = direccionCaterine;
    }

    public String getMotivoCaterine() {
        return motivoCaterine;
    }

    public void setMotivoCaterine(String motivoCaterine) {
        this.motivoCaterine = motivoCaterine;
    }

    public String getFechaCaterine() {
        return fechaCaterine;
    }

    public void setFechaCaterine(String fechaCaterine) {
        this.fechaCaterine = fechaCaterine;
    }

    public String getNombreCamilo() {
        return nombreCamilo;
    }

    public void setNombreCamilo(String nombreCamilo) {
        this.nombreCamilo = nombreCamilo;
    }

    public String getApellidoCamilo() {
        return apellidoCamilo;
    }

    public void setApellidoCamilo(String apellidoCamilo) {
        this.apellidoCamilo = apellidoCamilo;
    }

    public String getDireccionCamilo() {
        return direccionCamilo;
    }

    public void setDireccionCamilo(String direccionCamilo) {
        this.direccionCamilo = direccionCamilo;
    }

    public String getMotivoCamilo() {
        return motivoCamilo;
    }

    public void setMotivoCamilo(String motivoCamilo) {
        this.motivoCamilo = motivoCamilo;
    }

    public String getFechaCamilo() {
        return fechaCamilo;
    }

    public void setFechaCamilo(String fechaCamilo) {
        this.fechaCamilo = fechaCamilo;
    }

    public String getNombreYeimi() {
        return nombreYeimi;
    }

    public void setNombreYeimi(String nombreYeimi) {
        this.nombreYeimi = nombreYeimi;
    }

    public String getApellidoYeimi() {
        return apellidoYeimi;
    }

    public void setApellidoYeimi(String apellidoYeimi) {
        this.apellidoYeimi = apellidoYeimi;
    }

    public String getDireccionYeimi() {
        return direccionYeimi;
    }

    public void setDireccionYeimi(String direccionYeimi) {
        this.direccionYeimi = direccionYeimi;
    }

    public String getMotivoYeimi() {
        return motivoYeimi;
    }

    public void setMotivoYeimi(String motivoYeimi) {
        this.motivoYeimi = motivoYeimi;
    }

    public String getFechaYeimi() {
        return fechaYeimi;
    }

    public void setFechaYeimi(String fechaYeimi) {
        this.fechaYeimi = fechaYeimi;
    }

    public String getNombreFabian() {
        return nombreFabian;
    }

    public void setNombreFabian(String nombreFabian) {
        this.nombreFabian = nombreFabian;
    }

    public String getApellidoFabian() {
        return apellidoFabian;
    }

    public void setApellidoFabian(String apellidoFabian) {
        this.apellidoFabian = apellidoFabian;
    }

    public String getDireccionFabian() {
        return direccionFabian;
    }

    public void setDireccionFabian(String direccionFabian) {
        this.direccionFabian = direccionFabian;
    }

    public String getMotivoFabian() {
        return motivoFabian;
    }

    public void setMotivoFabian(String motivoFabian) {
        this.motivoFabian = motivoFabian;
    }

    public String getFechaFabian() {
        return fechaFabian;
    }

    public void setFechaFabian(String fechaFabian) {
        this.fechaFabian = fechaFabian;
    }

    public String getNombreClaudia() {
        return nombreClaudia;
    }

    public void setNombreClaudia(String nombreClaudia) {
        this.nombreClaudia = nombreClaudia;
    }

    public String getApellidoClaudia() {
        return apellidoClaudia;
    }

    public void setApellidoClaudia(String apellidoClaudia) {
        this.apellidoClaudia = apellidoClaudia;
    }

    public String getDireccionClaudia() {
        return direccionClaudia;
    }

    public void setDireccionClaudia(String direccionClaudia) {
        this.direccionClaudia = direccionClaudia;
    }

    public String getMotivoClaudia() {
        return motivoClaudia;
    }

    public void setMotivoClaudia(String motivoClaudia) {
        this.motivoClaudia = motivoClaudia;
    }

    public String getFechaClaudia() {
        return fechaClaudia;
    }

    public void setFechaClaudia(String fechaClaudia) {
        this.fechaClaudia = fechaClaudia;
    }
}
