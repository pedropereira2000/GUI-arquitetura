/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.calcioMagnesio;

import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio.ControleCalcioMagnesio;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio.FonteCalcioMagnesio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author pedropereira
 */
public class TesteControleCalcioMagnesio {
    
    @Test
    public void testeCalcioIdealValido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.calcioIdeal(1), 6.0);
    }
    
    @Test
    public void testeCalcioIdealInvalido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.calcioIdeal(3), 0.0);
    }
    
    @Test
    public void testeMagnesioIdealValido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.magnesioIdeal(1), 1.5);
    }
    
    @Test
    public void testeMagnesioIdealInvalido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.magnesioIdeal(3), 0.0);
    }
    
    @Test
    public void testeCalcPartAtualCalcCtc(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.calcPartCalciCTC(anyFloat(), anyFloat(), anyFloat())).thenReturn(Float.parseFloat(String.valueOf(2)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(2, calcMag.calcPartAualCalcCtc(1, 5, 12));
    }
    
    @Test
    public void testeDefValorIdealCalcioTipo1(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("45 a 55%", calcMag.defValorIdealCalcio(1));
    }
    
    @Test
    public void testeDefValorIdealCalcioTipo2(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("35 a 40%", calcMag.defValorIdealCalcio(2));
    }
    
    @Test
    public void testeDefValorIdealCalcioSemTipo(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("", calcMag.defValorIdealCalcio(0));
    }
    
    @Test
    public void testeCalcPosCorrecaoCalCtc(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.calcPosCorrecaoCTC(anyFloat())).thenReturn(Float.parseFloat(String.valueOf(1)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(1, calcMag.calcPosCorrecaoCalcCTC(5));
    }
    
    @Test
    public void testeCalcPartAtualMagSolo(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.calcPartAtualMagSolo(anyFloat(),anyFloat(),anyFloat())).thenReturn(Float.parseFloat(String.valueOf(4)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(4, calcMag.calcPartAualMagSolo(5,2,3));
    }
    
    @Test
    public void testeDefValorIdealMagnesioTipo1(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("10 a 15%", calcMag.defValorIdealMagnesio(1));
    }
    
    @Test
    public void testeDefValorIdealMagnesioTipo2(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("8 a 12%", calcMag.defValorIdealMagnesio(2));
    }
    
    @Test
    public void testeDefValorIdealMagnesioSemTipo(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("", calcMag.defValorIdealMagnesio(0));
    }
    
    @Test
    public void testeCalPosCorrecaoMagCtc(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.aposCorrecoes(anyFloat(),anyFloat(),anyFloat())).thenReturn(Float.parseFloat(String.valueOf(0)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(0, calcMag.calcPosCorrecaoMagCTC(5,2,3));
    }
    
    @Test
    public void testeQtdAplicar(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.qtdAplicar(anyFloat())).thenReturn(Float.parseFloat(String.valueOf(2)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(2, calcMag.qtdAplicar(5));
    }
    
    @Test
    public void testeCalcCusto(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.calcCusto(anyFloat())).thenReturn(Float.parseFloat(String.valueOf(44)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(44, calcMag.calcCusto(25));
    }
    
    @Test
    public void testeCalcPercentAtual(){
        var mockCalcMag = mock(FonteCalcioMagnesio.class);
        when(mockCalcMag.calcPercentAtual(anyFloat(),anyFloat(),anyFloat())).thenReturn(Float.parseFloat(String.valueOf(32)));
        var calcMag = new ControleCalcioMagnesio();
        calcMag.setFonte(mockCalcMag);
        assertEquals(32, calcMag.calPercentAtual(4,3,5));
    }
    
    @Test
    public void testeCalcValorIdealTipo1(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("60 a 70%", calcMag.calcValIdealAtingir(1));
    }
    
    @Test
    public void testeCalcValorIdealTipo2(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("50%", calcMag.calcValIdealAtingir(2));
    }
    
    @Test
    public void testeCalcValorIdealSemTipo(){
        var calcMag = new ControleCalcioMagnesio();
        assertEquals("", calcMag.calcValIdealAtingir(0));
    }
}
