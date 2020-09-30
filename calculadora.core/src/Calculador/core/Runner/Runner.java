package Calculador.core.Runner;


import Calculadora.utils.Calculadora;


public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        System.out.println(" A soma é "+calculadora.sum(15,16));
        System.out.println(" A subtração é "+calculadora.sub(15,16));
        System.out.println(" A multiplicação é "+calculadora.multi(15,16));
        System.out.println(" A divisão é "+calculadora.div(15,16));
    }



              }


