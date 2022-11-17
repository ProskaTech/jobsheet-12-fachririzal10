/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismeStatic;

/**
 *
 * @author HP
 */
public class CompileTime {
    static int Keliling(int a){
        return 4 * a;
    }
    
    static int Keliling(int l, int b){
        return 2 * (l + b);
    }
}
