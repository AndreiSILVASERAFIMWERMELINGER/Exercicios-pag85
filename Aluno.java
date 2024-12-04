package projeto;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno (){}
    public Aluno(int matricula){
        this.setMatricula(matricula);

    }






    public  void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){

        return this.matricula;
    }







}
