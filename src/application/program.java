/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class program {

    
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        
        
        List<Funcionario> list = new ArrayList<>();
        
        System.out.println("Informe quantos registros deseja inserir: ");
        int qtdRegistros = leia.nextInt();
        
   
        for (int i = 0; i < qtdRegistros; i++) {
            
            System.out.println("Informe o id do funcionario: ");
            int id = leia.nextInt();
            System.out.println("Informe nome do funcionario: ");
            String nome = leia.next();
            System.out.println("Informe o salario do funcionario");
            double salario = leia.nextDouble();
            
            list.add(new Funcionario(id, nome, salario));
            
        }
        
        System.out.println("Informe o Id do funcionario que vai receber um aumento: ");
        double idAumento = leia.nextInt();
        
        Funcionario aumento = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        
        
        if(aumento == null){
        
            System.out.println("O id informado não existe");
        
        }
        else {
            
            System.out.println("Informe um porcentagem de aumento: ");
            int PorcentoAumento = leia.nextInt();
            aumento.aumentoSalario(PorcentoAumento);
            
        }
        
        for(Funcionario x : list){
        
            System.out.println(x.toString());
        
        }
        
        
    }
 
}
