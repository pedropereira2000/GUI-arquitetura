/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle.outrasFontes;

import com.utfpr.pedro.gui.arquitetura.views.ControleOutrasFontes;
import com.utfpr.pedro.gui.arquitetura.views.FonteOutras;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author pedropereira
 */
public class TesteControleOutrasFontes {
    
    @Test
    public void TesteEnxofreIdeal() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.enxofreIdeal(1),9.0);
    }
    
    @Test
    public void TesteEnxofreIdealInvalido() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.enxofreIdeal(0),0.0);
    }
    
    @Test
    public void TesteTipoSolo1() {
        ArrayList<String> itens = new ArrayList();
        var controlOutras = new ControleOutrasFontes();
        itens.add("Argiloso");
        itens.add("+ 40% de argila");
        assertEquals(controlOutras.tipoSolo(1).get(0),itens.get(0));
        assertEquals(controlOutras.tipoSolo(1).get(1),itens.get(1));
    }
    
    @Test
    public void TesteTipoSolo2() {
        ArrayList<String> itens = new ArrayList();
        var controlOutras = new ControleOutrasFontes();
        itens.add("Text. Média");
        itens.add("25 a 40% de argila");
        assertEquals(controlOutras.tipoSolo(2).get(0),itens.get(0));
        assertEquals(controlOutras.tipoSolo(2).get(1),itens.get(1));
    }
    
    @Test
    public void TesteTipoPlantio() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.tipoPlantio(1),"Plantio Direto");
        assertEquals(controlOutras.tipoPlantio(2),"Convencional");
    }
    
    @Test
    public void TesteCalcSMolMaior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcSCmol(1, 2, 3),6);
    }
    
    @Test
    public void TesteCalcSMolMenor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcSCmol(0.002, 0.002, 0.002),0.0);
    }
    
    @Test
    public void TesteCalcCtcSCmolMaior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcCtcCmol(5, 5),10);
    }
    
    @Test
    public void TesteCalcCtcSCmolMenor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcCtcCmol(0.002, 0.002),0.0);
    }
    
    @Test
    public void TesteCalcVAtual() {
        var fontOMock = mock(FonteOutras.class);
        when(fontOMock.calcVAtual(anyDouble())).thenReturn(5.0);
        var controlOutras = new ControleOutrasFontes();
        controlOutras.setFonte(fontOMock);
        assertEquals(controlOutras.calcVAtual(2),5);
    }
    
    @Test
    public void TesteControleMOgdm3Maior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.controleMOgdm3(5),"");
    }
    
    @Test
    public void TesteControleMOgdm3Menor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.controleMOgdm3(0.0001),"M.O. %");
    }
    
    @Test
    public void TesteCalcMOPercentMaior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcMOPercent(50),5);
    }
    
    @Test
    public void TesteCalcMOPercentMenor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcMOPercent(0.05),0);
    }
    
    @Test
    public void TesteCalcTipoMOPercentMaior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcTipoMOPercent(50),"M.O. %");
    }
    
    @Test
    public void TesteCalcTipoMOPercentMenor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcTipoMOPercent(0.00005),"");
    }
    
    @Test
    public void TesteCalcVal3MOgdm3() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcVal3MOgdm3(50),500);
    }
    
    @Test
    public void TesteCalcVal3Decimal() {
        var fontOMock = mock(FonteOutras.class);
        when(fontOMock.calcGdm3Decimal(anyDouble())).thenReturn(10.0);
        var controlOutras = new ControleOutrasFontes();
        controlOutras.setFonte(fontOMock);
        assertEquals(controlOutras.calcVal3Decimal(2),10);
    }
    
    @Test
    public void TesteCalcVal2MOgdm3Menor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcVal2MOgdm3(0.0005),"");
    }
    
    @Test
    public void TesteCalcVal2MOgdm3Maior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcVal2MOgdm3(7),"M.O. (g.dm3)");
    }
    
    @Test
    public void TesteCalcVal4MOgdm3() {
        var fontOMock = mock(FonteOutras.class);
        when(fontOMock.calGdm4Decimal(anyDouble())).thenReturn("M.O. %");
        var controlOutras = new ControleOutrasFontes();
        controlOutras.setFonte(fontOMock);
        assertEquals(controlOutras.calcVal4MOgdm3(2),"M.O. %");
    }
    
    @Test
    public void TesteCalcK17Menor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcValK17(0.0005),"");
    }
    
    @Test
    public void TesteCalcK17Maior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcValK17(7),"M.O. %");
    }
    
    @Test
    public void TesteCalcP18Menor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcP18(0.0005),0);
    }
    
    @Test
    public void TesteCalcP18aior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcP18(7),40.69767441860465);
    }
    
    @Test
    public void TesteCalcCarbonoMenor() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcCarbono(0.0005),0);
    }
    
    @Test
    public void TesteCalcCarbonoMaior() {
        var controlOutras = new ControleOutrasFontes();
        assertEquals(controlOutras.calcCarbono(7),40.69767441860465);
    }
}
