/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.calcioMagnesio;

import com.utfpr.pedro.gui.arquitetura.control_nutriente_fonte.magnesio_calcio.ControleCalcioMagnesio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedropereira
 */
public class TesteControleCalcioMagnesio {
    
    @Test
    public void ControleCalcioIdealValido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.calcioIdeal(1), 6.0);
    }
    
    @Test
    public void ControleCalcioIdealInvalido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.calcioIdeal(3), 0.0);
    }
    
    @Test
    public void ControleMagnesioIdealValido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.magnesioIdeal(1), 1.5);
    }
    
    @Test
    public void ControleMagnesioIdealInvalido() {
        var calcMag = new ControleCalcioMagnesio();
        assertEquals(calcMag.magnesioIdeal(3), 0.0);
    }
}
