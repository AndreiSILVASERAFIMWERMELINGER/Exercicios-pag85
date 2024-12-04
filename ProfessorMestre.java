package projeto;

public class ProfessorMestre extends Professor{

    private String temaDeDissertacao;

    public ProfessorMestre(){}

    public void setTemaDeDissertacao(String temaDeDissertacao) {
        this.temaDeDissertacao = temaDeDissertacao;
    }

    public String getTemaDeDissertacao(){
        return this.temaDeDissertacao;
    }

    @Override
    protected void calcularSalario() {
        Double aumento = getValorHoraAula() * 1.2;
        this.setSalario(aumento * getHorasDeAulaMes());
    }
}
