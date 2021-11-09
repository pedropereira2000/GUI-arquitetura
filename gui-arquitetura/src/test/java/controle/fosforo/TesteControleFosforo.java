/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.fosforo;

import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo.ControleFosforo;
import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo.FonteFosforo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author pedropereira
 */
public class TesteControleFosforo {
    
    @Test
    public void testeFosforoIdealValido() {
        var controlFosforo = new ControleFosforo();
        assertEquals(controlFosforo.fosforoIdeal(1),9.0);
    }
    
    @Test
    public void testeFosforoIdealInvalido() {
        var controlFosforo = new ControleFosforo();
        assertEquals(controlFosforo.fosforoIdeal(3),0);
    }
    
    @Test
    public void testeTeorFosforoCorrecao() {
        var controlFosforo = new ControleFosforo();
        assertEquals(controlFosforo.fosforoPosCorrecao(1),1.0);
    }
    
    @Test
    public void testeQtdAplicadaFosforo(){
        var mockFosf = mock(FonteFosforo.class);
        when(mockFosf.qtdAplicar(anyFloat(), anyFloat())).thenReturn(Float.parseFloat(String.valueOf(6)));
        var controlF = new ControleFosforo();
        controlF.setFonte(mockFosf);
        assertEquals(6, controlF.qtdAplicarFosforo(1, 1));
    }
    
    @Test
    public void testeCalcFonteFosforo(){
        var mockFosf = mock(FonteFosforo.class);
        when(mockFosf.calcValFonteFosforo(anyFloat())).thenReturn(Float.parseFloat(String.valueOf(2)));
        var controlF = new ControleFosforo();
        controlF.setFonte(mockFosf);
        assertEquals(2, controlF.calcFonteFosforo(1));
    }
    
    @Test
    public void testeCalcFonteFosforoCorrecao(){
        var mockFosf = mock(FonteFosforo.class);
        when(mockFosf.calcValFonteFosforoCorrecao(anyFloat(), anyFloat())).thenReturn(Float.parseFloat(String.valueOf(3)));
        var controlF = new ControleFosforo();
        controlF.setFonte(mockFosf);
        assertEquals(3, controlF.calcFonteFosforoCorrecao(1, 1));
    }
    
    @Test
    public void testeCalcCustoCorrecao(){
        var mockFosf = mock(FonteFosforo.class);
        when(mockFosf.calcCusto(anyFloat(), anyFloat(), anyFloat())).thenReturn(Float.parseFloat(String.valueOf(50)));
        var controlF = new ControleFosforo();
        controlF.setFonte(mockFosf);
        assertEquals(50, controlF.calcCustoCorreção(8, 5, 20));
    }
}
