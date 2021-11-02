/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo.FonteFosforo;

/**
 *
 * @author pedropereira
 */
public class ControleFosforo {
    private FonteFosforo fontFosforo;
    
    public void setFonte(FonteFosforo fontFosforo){
        this.fontFosforo = fontFosforo;
    }
    
    public double fosforoIdeal(int textSolo){
        if(textSolo==1)return 9.0;
        else if(textSolo==2)return 12.0;
        else return 0.0;
    }
    
    public double fosforoPosCorrecao(double teorFosfAtingir){
        if(teorFosfAtingir>0.01)return teorFosfAtingir;
        else return 0;
    }
}
