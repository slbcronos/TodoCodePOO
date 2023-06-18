/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaAbstracta;

/**
 *
 * @author slb_18
 */
public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

       
    

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando Circulo");
    }

    @Override
    public void Rotar() {
        System.out.println("Rotando Circulo");
    }
    
    
    
}
