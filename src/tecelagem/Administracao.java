package tecelagem;

/**
 *
 * @author André Henrique Sousa / RA: 0040481811025
 */
public class Administracao extends Funcionario {
    private int faltas;
    private double salBase;

    public Administracao(String nome, String rg, double salBase) {
        super(nome, rg);
        this.salBase = salBase;
        faltas = 0;
    }

    public void registrarFalta(){
        faltas++;
    }

    @Override
    public double salarioLiquido(){
        return salBase - (salBase/30) * faltas;
    }

    @Override
    public void novoMes(){
        faltas = 0;
    }

    @Override
    public void hollerith(){
      super.hollerith();
      System.out.println("Faltas no mês: " + faltas + "\n" +
                         "Salario Base: " + salBase + "\n");
    }
}
