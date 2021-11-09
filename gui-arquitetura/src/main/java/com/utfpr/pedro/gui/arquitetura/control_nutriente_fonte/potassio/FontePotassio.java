/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.potassio;

/**
 *
 * @author pedropereira
 */
public interface FontePotassio {
    public double calcPotassioAtingir(double potassioUsado);
    
    //potCalcMag é a soma dos três aplicados no solo
    public float calcPotassioCTCSolo(float potassioSolo, float hAL, float potCalcMag);
    
    public float calcParticipacaoIPotassioCTC (int tipoSolo);
    
    public float calcCustoPorHa(int qtdUsado, float areaAplicada);
    
}
