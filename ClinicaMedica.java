/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

/**
 *
 * @author Cielo
 */
import java.util.Scanner;
public class ClinicaMedica {

    /**;
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
       
        System.out.println("Bem vindo!!Digite a opção desejada:   ");
        int opcao;
         do{  
        System.out.println("1-Cadastrar Paciente");
        System.out.println("2-Cadastrar Medico");
        System.out.println("3-Cadastrar Cliente");
        System.out.println("4-Sair");
       System.out.println("Bem vindo!!Digite a opção desejada:   ");
             opcao=ler.nextInt(); 
             switch (opcao){
case 1:
    System.out.println("CADASTRO PACIENTE");
    System.out.println("Digite o nome do paciente: ");
        String nome =ler.nextLine();
     

break;
case 2:

break;
case 3:

break;
case 4:
    System.out.println("Operação terminada com sucesso!!");

break;
default:
    System.out.println("Opção inválida!! Digite novamente: ");
    break;
        }
        }while(opcao>4);
    }
}
       
       

