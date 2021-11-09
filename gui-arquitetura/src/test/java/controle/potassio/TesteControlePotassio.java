/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.potassio;

import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.potassio.FontePotassio;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.potassio.ControlePotassio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author pedropereira
 */
public class TesteControlePotassio {
    
    @Test
    public void testeControlePotassioIdeal() {
        var controlPot = new ControlePotassio();
        assertEquals(controlPot.potassioIdeal(1), "newpackage");
    }
    
    @Test
    public void testeControlePostassioCorrecao(){
        var potMock = mock(FontePotassio.class);
        when(potMock.calcPotassioAtingir(1)).thenReturn(5.0);
        var controlPot = new ControlePotassio();
        controlPot.setFonte(potMock);
        assertEquals(controlPot.potassioPosCorrecao(1),5.0);
    }
    
    @Test
    public void testeControlePotassioCtcPosCorrecaoDesejado(){
        var controlePot = new ControlePotassio();
        assertEquals(1, controlePot.potassioCTCPosCorrecao(Float.parseFloat(String.valueOf(1))));        
    }
    
    @Test
    public void testeControlePotassioCtcPosCorrecaoZero(){
        var controlePot = new ControlePotassio();
        assertEquals(0, controlePot.potassioCTCPosCorrecao(Float.parseFloat(String.valueOf(0.0002))));        
    }
    
    @Test
    public void testeControlePotassioCtcSolo(){
        var potMock = mock(FontePotassio.class);
        when(potMock.calcPotassioCTCSolo(anyFloat(),anyFloat(), anyFloat())).thenReturn(Float.parseFloat(String.valueOf(5.0)));
        var controlePot = new ControlePotassio();
        controlePot.setFonte(potMock);
        assertEquals(5,controlePot.calcPotassioCTCSolo(1, 2, 13));
    }
    
    @Test
    public void testeControleCalcPartPotassioPosCorrecao(){
        var potMock = mock(FontePotassio.class);
        when(potMock.calcParticipacaoIPotassioCTC(anyInt())).thenReturn(Float.parseFloat(String.valueOf(6.0)));
        var controlePot = new ControlePotassio();
        controlePot.setFonte(potMock);
        assertEquals(6,controlePot.calcPartPotassioCtcAposCorrecao(1));
    }
    
    @Test
    public void testeControleDefParticipacaoIdealTipo1(){
        var controlePot = new ControlePotassio();
        assertEquals("3,0%",controlePot.defParticipacaoIdeal(1));
    }
    
    @Test
    public void testeControleDefParticipacaoIdealTipo2(){
        var controlePot = new ControlePotassio();
        assertEquals("3,0%",controlePot.defParticipacaoIdeal(2));
    }
    
    @Test
    public void testeControleDefParticipacaoIdealSemTipo(){
        var controlePot = new ControlePotassio();
        assertEquals("",controlePot.defParticipacaoIdeal(0));
    }
    
    @Test
    public void testeControleCalcPotassioAplicado(){
        var potMock = mock(FontePotassio.class);
        when(potMock.calcCustoPorHa(anyInt(),anyFloat())).thenReturn(Float.parseFloat(String.valueOf(15)));
        var controlePot = new ControlePotassio();
        controlePot.setFonte(potMock);
        assertEquals(15,controlePot.calcCustoPotassioAplicado(20, 2));
    }
}
