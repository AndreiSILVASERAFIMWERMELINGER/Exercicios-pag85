package projeto;

public class Professor extends Pessoa {

    public Professor(){}

    protected Double horasDeAulaMes;
    protected Double valorHoraAula;
    protected Double salario;

    protected void calcularSalario(){
        this.setSalario(horasDeAulaMes * valorHoraAula);
    }

    public void setHorasDeAulaMes(Double HoraAula){
        this.horasDeAulaMes = HoraAula;

    }
    public  Double getHorasDeAulaMes(){

        return this.horasDeAulaMes;
    }

    public void setValorHoraAula (Double valorHoraAula){
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorHoraAula(){
        return this.valorHoraAula;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }



}
