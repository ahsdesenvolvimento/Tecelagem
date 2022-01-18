
package tecelagem;

/**
 *
 * @author André Henrique Sousa / RA: 0040481811025
 */
public abstract class Funcionario {
    protected String nome, rg;

    //Construtor
    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    //Métodos abstratos
    public abstract double salarioLiquido();

    public abstract void novoMes();

    //Método para imprimir o hollerith
    public void hollerith(){
        System.out.println("Nome: " + nome + "\n" +
                           "RG: " + rg + "\n" +
                           "Salario Liquido: " + salarioLiquido());
    }

}