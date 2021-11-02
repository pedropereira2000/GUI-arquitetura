/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.fosforo;

import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.fosforo.ControleFosforo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
