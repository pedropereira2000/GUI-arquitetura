/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.potassio;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.potassio.FontePotassio;
/**
 *
 * @author pedropereira
 */
public class ControlePotassio {
    private FontePotassio fontPotassio;
    
    public void setFonte(FontePotassio fontPotassio){
        this.fontPotassio = fontPotassio;
    }
    
    public String potassioIdeal(int textSolo){
        return "newpackage";
    }
    
    public double potassioPosCorrecao(double teorPotUsado){
        return fontPotassio.calcPotassioAtingir(teorPotUsado);
    }
    
    public float potassioCTCPosCorrecao(float potassioCtcDesejado){
        if(potassioCtcDesejado>0.001) return potassioCtcDesejado;
        else return 0;
    }
    
    public float calcPotassioCTCSolo(float potassioSolo, float hAL, float potCalcMag){
        return fontPotassio.calcPotassioCTCSolo(potassioSolo, hAL, potCalcMag);
    }
    
    public float calcPartPotassioCtcAposCorrecao(int tipoSolo){
        return fontPotassio.calcParticipacaoIPotassioCTC(tipoSolo);
    }
    
    public String defParticipacaoIdeal(int tipoSolo){
        if(tipoSolo == 1) return "3,0%";
        else if(tipoSolo == 2) return "3,0%";
        else return "";
    }
    
    public float calcCustoPotassioAplicado(int qtdAplicado, float areaAplicada){
        return fontPotassio.calcCustoPorHa(qtdAplicado, areaAplicada);
    }
}
