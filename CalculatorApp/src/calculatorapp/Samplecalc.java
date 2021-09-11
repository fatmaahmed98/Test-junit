/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

/**
 *
 * @author Fatma
 */
public class Samplecalc {
    public int Sum(int num1 , int num2){
        return num1 + num2;
    }
     public int Sub(int num1 , int num2){
        return num1 - num2;
    }
    public int Mul(int num1 , int num2){
        return num1 * num2;
    }
    public int Div(int num1 , int num2){
        if(num2==0){
             throw new IllegalArgumentException("Number can not be divide by 0!");
        }
        return num1 / num2;
    }

    
}
