
package tecelagem;

/**
 *
 * @author André Henrique Sousa / RA: 0040481811025
 */
public class Producao extends Funcionario {
    private int hrDn, hrNt;
    private double vlrHr;

    public Producao(String nome, String rg, double vlrHr) {
        super(nome, rg);
        this.vlrHr = vlrHr;
        hrDn = 0;
        hrNt = 0;
    }

    public void registrarHorasDiurnas(int horas){
        hrDn += horas;
    }

    public void registrarHorasNoturnas(int horas){
        hrNt += horas;
    }

    @Override
    public void novoMes(){
        hrDn = 0;
        hrNt = 0;
    }

    @Override
    public double salarioLiquido(){
        return (hrDn * vlrHr) + (hrNt * vlrHr * 1.3);
    }

    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Horas diurnas: " + hrDn + "\n" +
                           "Horas noturnas: " + hrNt + "\n");
    }

}