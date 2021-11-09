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
    
    public float calcPartAualCalcCtc(float calcioSolo, float hal, float soma){
        return fCalcMag.calcPartCalciCTC(calcioSolo, hal, soma);
    }
    
    public String defValorIdealCalcio(int tipoSolo){
        if(tipoSolo == 1) return "45 a 55%";
        else if(tipoSolo == 2) return "35 a 40%";
        else return "";
    }
    
    public float calcPosCorrecaoCalcCTC(float hal){
        return fCalcMag.calcPosCorrecaoCTC(hal);
    }
    
    public float calcPartAualMagSolo(float magSolo, float hal, float soma){
        return fCalcMag.calcPartAtualMagSolo(magSolo, hal, soma);
    }
    
    public String defValorIdealMagnesio(int tipoSolo){
        if(tipoSolo == 1) return "10 a 15%";
        else if(tipoSolo == 2) return "8 a 12%";
        else return "";
    }
    
    public float calcPosCorrecaoMagCTC(float magnesioPosCorrecao, float hal, float calcioMagnesioPotassio){
        return fCalcMag.aposCorrecoes(magnesioPosCorrecao, hal, calcioMagnesioPotassio);
    }
    
    public float qtdAplicar(float prnt){
        return fCalcMag.qtdAplicar(prnt);
    }
    
    public float calcCusto(float tipoFonteUsada){
        return fCalcMag.calcCusto(tipoFonteUsada);
    }
    
    public float calPercentAtual(float hal, float calcioSolo, float calcioMagnesioPotassio){
        return fCalcMag.calcPercentAtual(hal, calcioSolo, calcioMagnesioPotassio);
    }
    
    public String calcValIdealAtingir(int tipoSolo){
        if(tipoSolo == 1) return "60 a 70%";
        else if(tipoSolo == 2) return "50%";
        else return "";
    }
}
