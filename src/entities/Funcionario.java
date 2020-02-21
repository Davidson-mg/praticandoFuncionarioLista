/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;
    
    
    public Funcionario (int id, String nome, double salario){
    
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    
    }
    
    
    public void setId (int id){
    
        this.id = id;
    
    }
    
    public int getId(){
        
        return id;
    
    }
    
    public void setNome(String nome){
    
        this.nome = nome;
        
    }
    
    public String getNome (){
        
        return nome;
    
    }
    
    
    public void setSalario (double salario){
    
        this.salario = salario;
    
    }
    
    public double getSalario (){
    
        return salario;
    
    }
    
    
    public double aumentoSalario (int aumento){
        
        double res = (salario / 100) * aumento;
        return salario = salario + res;
    
    }   
      
    
    public String toString (){
    
        return "ID: "+id+" Nome: "+nome+" Salario: "+salario;
    
    } 
    
}
