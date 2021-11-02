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
}
