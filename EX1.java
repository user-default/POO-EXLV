import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    Programador f1 = new Programador();
    Gerente f2 = new Gerente();

     System.out.println("Qual o projeto do Gerente?");
     f2.setProjeto(input.nextLine());
     System.out.println("Qual a linguagem do programador?");
     f1.setLinguagem(input.nextLine());

     f1.setNome("Joao");
     f2.setNome("Bastião");
     f1.setSalario(1500);
     f2.setSalario(5000);

    System.out.printf("O programador %s está trabalhando no ", f1.getNome());
    f2.informarProjeto();
    System.out.printf("Utilizando a ");
    f1.informarLinguagem();
    System.out.printf("E recebe por mês a remuneração de R$%.2f\n", f1.getSalario());
  }
  
}

class Funcionario
{ 
  private  String nome;
  private  double salario;
  
  public void informarSalario()
  {
    System.out.println("Salario para "+nome+" é de R$"+salario);
  }
  public void setNome(String nome)
  {
    this.nome = nome;
  }
  public String getNome()
  {
    return nome;
  }
  public void setSalario(double salario)
  {
    this.salario = salario;
  }
  public Double getSalario()
  {
    return salario;
  }
}

class Gerente extends Funcionario
{
  private String projeto;

  public void setProjeto(String projeto)
  {
    this.projeto = projeto;
  }
  public String getProjeto()
  {
    return projeto;
  }
  public void informarProjeto()
  {
    System.out.println("Projeto "+getProjeto()+".");
  }

}

class Programador extends Funcionario
{
  private String linguagem;

  public void setLinguagem(String linguagem)
  {
    this.linguagem = linguagem;
  }
  public String getLinguagem()
  {
    return linguagem;
  }

  public void informarLinguagem()
  {
    System.out.println("Linguagem de programação "+getLinguagem()+".");
  }
}
