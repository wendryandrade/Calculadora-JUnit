/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Evandro
 */
public class Calculadora {
    private double resultado;
    
    public double soma(double x, double y){
        this.resultado = x + y;
        return this.resultado;
    }
    
    public double subtracao(double x, double y){
        this.resultado = x - y;
        return this.resultado;
    }
    
    public double multiplicacao(double x, double y){
        this.resultado = x * y;
        return this.resultado;
    }
    
    public double divisao(double x, double y){
        this.resultado = x / y;
        return this.resultado;
    }
    
    public double potenciacao(double x, int y){
        this.resultado = 1.0;
        for(int i=0; y>i; i++)
            this.resultado = x * this.resultado;
        return this.resultado;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }
            
}