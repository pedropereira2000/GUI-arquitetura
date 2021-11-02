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
    public void TestControlePotassioIdeal() {
        var controlPot = new ControlePotassio();
        assertEquals(controlPot.potassioIdeal(1), "newpackage");
    }
    
    @Test
    public void TestControlePostassioCorrecao(){
        var potMock = mock(FontePotassio.class);
        when(potMock.calcPotassioAtingir(1)).thenReturn(5.0);
        var controlPot = new ControlePotassio();
        controlPot.setFonte(potMock);
        assertEquals(controlPot.potassioPosCorrecao(1),5.0);
    }
}
