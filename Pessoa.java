package projeto;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String telefone;


    public Pessoa(){}
    public Pessoa(String nome, String cpf, String telefone){

        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setNome(nome);

    }




    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setTelefone (String tel){
        this.telefone = tel;
    }
    public String geTtelefone(){
        return this.telefone;
    }



}
