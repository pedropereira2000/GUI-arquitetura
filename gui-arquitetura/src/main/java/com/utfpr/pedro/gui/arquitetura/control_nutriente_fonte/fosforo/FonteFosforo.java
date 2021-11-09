/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo;

/**
 *
 * @author pedropereira
 */
public interface FonteFosforo {
    public float calcFosforoIdeal(int textSolo);
    
    public float qtdAplicar(float teor, float fonte);
    
    public float calcCusto(float fonte, float qtdTeor, float tipoFonte);
    
    public float calcValFonteFosforo(float fonteFosforo);
    
    public float calcValFonteFosforoCorrecao(float fonteFosforo, float tipoFonte);
}
