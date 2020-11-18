import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Algoritmos d1 = new Algoritmos();
    Matematica d2 = new Matematica();

    d1.setCodigo(001);
    d2.setCodigo(001);

    System.out.println("\nDISCIPLINA: ALGORITMOS:\n");
    System.out.println("Insira a primeira nota do aluno:");
    d1.setNota1(input.nextDouble());
    System.out.println("Insira a segunda nota do aluno:");
    d1.setNota2(input.nextDouble());
    System.out.println("Insira a terceira nota do aluno:");
    d1.setNota3(input.nextDouble());

    System.out.println("\nDISCIPLINA: MATEMATICA:\n");
    System.out.println("Insira a primeira nota do aluno:");
    d2.setNota1(input.nextDouble());
    System.out.println("Insira a segunda nota do aluno:");
    d2.setNota2(input.nextDouble());
    System.out.println("Insira a terceira nota do aluno:");
    d2.setNota3(input.nextDouble());
    System.out.println("Insira a quarta nota do aluno:");
    d2.setNota4(input.nextDouble());

    System.out.println("\nAPRESENTAÇÃO DAS MÉDIAS:\n");
    System.out.printf("ALGORITMOS: %.2f\n", d1.media());
    System.out.printf("MATEMATICA: %.2f\n", d2.media());

    

  }
}

class Disciplina
{
  private int codigo = 0;
  private double nota1 = 0;
  private double nota2 = 0;

  public void setCodigo(int codigo)
  {
    this.codigo = codigo;
  }
  public int getCodigo()
  {
    return codigo;
  }

  public void setNota1(double nota1)
  {
    this.nota1 = nota1;
  }
  public double getNota1()
  {
    return nota1;
  }
  public void setNota2(double nota2)
  {
    this.nota2 = nota2;
  }
  public double getNota2()
  {
    return nota2;
  }

  public double media()
  {
    return ((nota1 + nota2) / 2);
  }
}

class Algoritmos extends Disciplina
{
  private double nota3 = 0;

  public void setNota3(double nota3)
  {
    this.nota3 = nota3;
  }
  public double getNota3()
  {
    return nota3;
  }


  public double media()
  {
    double nota1 = super.getNota1();
    double nota2 = super.getNota2();

    return ((nota1 + nota2 + nota3) / 3);
  }
}

class Matematica extends Disciplina
{
  private double nota3 = 0;
  private double nota4 = 0;
  

  public void setNota3(double nota3)
  {
    this.nota3 = nota3;
  }
  public double getNota3()
  {
    return nota3;
  }
  public void setNota4(double nota4)
  {
    this.nota4 = nota4;
  }
  public double getNota4()
  {
    return nota4;
  }

  public double media()
  {
    double nota1 = super.getNota1();
    double nota2 = super.getNota2();

    return ((nota1 + nota2 + nota3 + nota4 +nota4) / 4);
  }
}
