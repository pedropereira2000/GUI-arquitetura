/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio.FonteCalcioMagnesio;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author pedropereira
 */
public class ControleCalcioMagnesio {
    private FonteCalcioMagnesio fCalcMag;
    
    public void setFonte(FonteCalcioMagnesio fCalcMag){
        this.fCalcMag = fCalcMag;
    }
    
    public double calcioIdeal(int textSolo){
        if(textSolo==1)return 6.0;
        else if(textSolo==2)return 4.0;
        else return 0.0;
    }
    
    public double magnesioIdeal(int textSolo){
        if(textSolo==1)return 1.5;
        else if(textSolo==2) return 1.0;
        else return 0.0;
    }
    
    public ArrayList<Double> calcioMagnesioAtingir(double magUsado, double calcUsado){
        ArrayList atingir = new ArrayList();
        atingir.add(fCalcMag.calcCalcioAtingir(calcUsado));
        atingir.add(fCalcMag.calcMagnesioAtingir(magUsado));
        return atingir;
    }
}
