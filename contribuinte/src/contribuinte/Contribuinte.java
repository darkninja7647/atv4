/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contribuinte;

/**
 *
 * @author bosch
 */
class Contribuinte 
{
private String nome;
private String cpf;
private float salario;
private float desc_irpf;
private String calcularirpf;
private float calcularsalarioliq;


public Contribuinte(String nome,String cpf,float salario)
{
this.nome = nome;
this.cpf = cpf;
this.salario= salario;
this.desc_irpf= desc_irpf;        

if (salario<1903.98)
{
desc_irpf = -salario*0;
 calcularsalarioliq= desc_irpf+salario;
}
else if(salario>1903.9 && salario<2826.65)
{
desc_irpf = -salario*0.075f;
    calcularsalarioliq= desc_irpf+salario;
}
else if(salario>2826.65 && salario<3751.05)
{
desc_irpf = -salario*0.15f;
 calcularsalarioliq= desc_irpf+salario;
}
else if(salario>3751.06 && salario<4664.68)
{
desc_irpf = -salario*22.5f/100;
 calcularsalarioliq= desc_irpf+salario;
}
else if(salario>4664.68)
{
desc_irpf = -salario*27.5f/100;
calcularsalarioliq = desc_irpf +salario;
}
}


public float Getdesc_irpf()
{
    return desc_irpf;
}
 public String Getnome()
{
    return nome;
}
 public String GetCPF()
{
    return cpf;
}
 public float Getnsalario()
{
    return salario;
}
 public float Getcalcularsalarioliq()
 {
 return calcularsalarioliq;
 }
 public void Setsalario(float salario)
 {
  this.salario = salario;
 }
 public void imprimir()
 {
     System.out.println("nome" + this.nome);
     System.out.println("Cpf" + this.cpf); 
     System.out.println("Salário" + this.salario); 
     System.out.println("salário líquido" + this.calcularsalarioliq);
     System.out.println("desconto aplicado" + this.desc_irpf); 
     
} 
}