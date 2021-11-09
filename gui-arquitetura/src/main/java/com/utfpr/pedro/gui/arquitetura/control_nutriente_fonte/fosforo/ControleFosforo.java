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
    
    public float qtdAplicarFosforo(float teor, float fonte){
        return fontFosforo.qtdAplicar(teor, fonte);
    }
    
    public float calcFonteFosforo(float fonteFosforo){
        return fontFosforo.calcValFonteFosforo(fonteFosforo);
    }
    
    public float calcFonteFosforoCorrecao(float fonteFosforo, float tipoFonte){
        return fontFosforo.calcValFonteFosforoCorrecao(fonteFosforo, tipoFonte);
    }
    
    public float calcCustoCorreção(float fonte, float qtdTeor, float tipoFonte){
        return fontFosforo.calcCusto(fonte, qtdTeor, tipoFonte);
    }
}
