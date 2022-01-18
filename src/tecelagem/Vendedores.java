package tecelagem;

/**
 *
 * @author André Henrique Sousa / RA: 0040481811025
 */
public class Vendedores extends Funcionario {
    private double salBase;
    private double valor;
    private double vds;

    public Vendedores(String nome, String rg, double salBase, double valor) {
        super(nome, rg);
        this.salBase = salBase;
        this.valor=valor;
    }

    public void registrarVenda(double valor){
        vds += valor;
    }
   
    @Override
    public void novoMes(){
        vds = 0;
    }

    @Override
    public double salarioLiquido(){
        return salBase + (vds * 0.03);
    }

    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario Base: " + salBase + "\n" +
                           "Comissão: " + (vds * 0.03) + "\n" + 
                           "Salario Liquido:" + (salBase +(vds * 0.03)) + "\n");
    }

}