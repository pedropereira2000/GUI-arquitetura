/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio;

/**
 *
 * @author pedropereira
 */
public interface FonteCalcioMagnesio {
    //Calcio
    public double calcCalcioAtingir(double calcioUsado);
    public float calcPartCalciCTC(float calcioSolo, float hAL, float calcioMagnesioPotassio);
    public float calcPosCorrecaoCTC(float hAL);
    
    //Geral
    public float qtdAplicar(float prnt);
    public float calcCusto(float tipoFonteUsada);
    public float calcPercentAtual(float hal, float calcioSolo, float calcioMagnesioPotassio);
    
    //Magnésio
    public double calcMagnesioAtingir(double magnesioUsado);
    public float calcPartAtualMagSolo(float magnesioSolo, float hal, float calcioMagnesioPotassio);
    public float aposCorrecoes(float magnesioPosCorrecao, float hal, float calcioMagnesioPotassio);
}
