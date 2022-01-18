
package tecelagem;

/**
 *
 * @author André Henrique Sousa / RA:0040481811025
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administracao a1;
    a1 = new Administracao("Jaqueline Martins", "6698956242", 4200);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        a1.novoMes();
        a1.hollerith();

        Producao p1;
        p1 = new Producao("Pedro Ribeiro",  "5612356972", 25);
        p1.registrarHorasDiurnas(140);
        p1.registrarHorasNoturnas(35);
        p1.hollerith();
        p1.novoMes();
        p1.hollerith();
        
        Vendedores v1;
        v1 = new Vendedores ("Maria Joana", "3332356977", 1500,0);
        v1.registrarVenda(5245.00);
        v1.registrarVenda(4765.00);
        v1.salarioLiquido();
        v1.hollerith();
        v1.novoMes();
        v1.hollerith();
    }

}