/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package contribuinte;

/**
 *
 * @author bosch
 */
public class contibuinte2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Contribuinte c1 = new Contribuinte ("Gabriel","23456456",3500);
        System.out.println("|nome:" + c1.Getnome()+"|cpf" + c1.GetCPF()
        + "|desconto" + c1.Getdesc_irpf() +
        "|salario liquido" + c1.Getcalcularsalarioliq()
        ); 
        // o resultado da questao do imposto sob salario de R$3500 foi de R$525,00 
        
        Contribuinte c2 = new Contribuinte ("Rafael","456356456",1300);
        System.out.println("|nome:" + c2.Getnome()+"|cpf" + c2.GetCPF()
        + "|desconto" + c2.Getdesc_irpf() +
        "|salario liquido" + c2.Getcalcularsalarioliq()
        ); 
         // o resultado da questao do imposto sob salario de R$1300 foi de R$00,00 
        Contribuinte c3 = new Contribuinte ("nicolas","456566456",5600);
        System.out.println("|nome:" + c3.Getnome()+"|cpf" + c3.GetCPF()
        + "|desconto" + c3.Getdesc_irpf() +
        "|salario liquido" + c3.Getcalcularsalarioliq()
        );
      // o resultado da questao do imposto sob salario de R$5600 foi de R$1540,00 
        Contribuinte c4 = new Contribuinte ("Rafhael","456236456",2150);
        System.out.println("|nome:" + c4.Getnome()+"|cpf" + c4.GetCPF()
        + "|desconto" + c4.Getdesc_irpf() +
        "|salario liquido" + c4.Getcalcularsalarioliq()
        );
        // o resultado da questao do imposto sob salario de R$2150 foi de R$161,25
        c2.imprimir();
    }
    
}
