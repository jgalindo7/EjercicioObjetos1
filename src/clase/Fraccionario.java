/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Administrador
 */
public class Fraccionario {

    private int Numerador;
    private int Denominador;

    public Fraccionario(int Numerador, int Denominador) throws DenominadorCeroException {
        this.Numerador = Numerador;
        this.Denominador = Denominador;
        if(Denominador == 0){
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public Fraccionario Sumar(Fraccionario f2) throws DenominadorCeroException {
        Fraccionario f;
        int Num, Den;
        Num = (this.Numerador * f2.Denominador) + (this.Denominador * f2.Numerador);
        Den = (this.Denominador * f2.Denominador);
        f = new Fraccionario(Num, Den);
        return f;

    }

    public Fraccionario Restar(Fraccionario f2) throws DenominadorCeroException {
        Fraccionario f;
        int Num, Den;
        Num = (this.Numerador * f2.Denominador) - (this.Denominador * f2.Numerador);
        Den = (this.Denominador * f2.Denominador);
        f = new Fraccionario(Num, Den);
        return f;
    }

    public Fraccionario multiplicar(Fraccionario f2) throws DenominadorCeroException {
        Fraccionario f;
        int Num, Den;
        Num = (this.Numerador * f2.Numerador);
        Den = (this.Denominador * f2.Denominador);
        f = new Fraccionario(Num, Den);
        return f;
    }

    public Fraccionario Dividir(Fraccionario f2) throws DenominadorCeroException {
        Fraccionario f;
        int Num, Den;
        Num = (this.Numerador * f2.Denominador);
        Den = (this.Denominador * f2.Numerador);
        f = new Fraccionario(Num, Den);
        return f;

    }
}
