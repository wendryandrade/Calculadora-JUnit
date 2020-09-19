/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication5.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evandro
 */
public class testeCalculadora {
    private Calculadora calculadora;
    private final double MARGEM_DE_ERRO;
    
    public testeCalculadora() {
        this.MARGEM_DE_ERRO=0.00001;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.calculadora = new Calculadora();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testaCriacaoDaCalculadora(){
        Calculadora calculadora = new Calculadora();
    }
    
     @Test
    public void testaSoma(){
        assertEquals(2.0,calculadora.soma(2.0, 0.0),MARGEM_DE_ERRO);
        assertEquals(10.0,calculadora.soma(5.0, 5.0),MARGEM_DE_ERRO);
        assertEquals(0.0,calculadora.soma(-10.0, 10.0),MARGEM_DE_ERRO);
        assertEquals(-4.0,calculadora.soma(-6.0, 2.0),MARGEM_DE_ERRO);
    }
    
    @Test
    public void testaSubtracao(){
        assertEquals(2.0,calculadora.subtracao(2.0, 0.0),MARGEM_DE_ERRO);
        assertEquals(0.0,calculadora.subtracao(5.0, 5.0),MARGEM_DE_ERRO);
        assertEquals(-20.0,calculadora.subtracao(-10.0, 10.0),MARGEM_DE_ERRO);
        assertEquals(-8.0,calculadora.subtracao(-6.0, 2.0),MARGEM_DE_ERRO);
        assertEquals(-1.0,calculadora.subtracao(-6.0, -5.0),MARGEM_DE_ERRO);
    }
    
    @Test
    public void testaMultiplicacao(){
        assertEquals(0.0,calculadora.multiplicacao(2.0, 0.0),MARGEM_DE_ERRO);
        assertEquals(25.0,calculadora.multiplicacao(5.0, 5.0),MARGEM_DE_ERRO);
        assertEquals(-100.0,calculadora.multiplicacao(-10.0, 10.0),MARGEM_DE_ERRO);
        assertEquals(-12.0,calculadora.multiplicacao(-6.0, 2.0),MARGEM_DE_ERRO);
        assertEquals(30.0,calculadora.multiplicacao(-6.0, -5.0),MARGEM_DE_ERRO);
    }
    
    @Test
    public void testaDivisao(){
        assertEquals(Double.POSITIVE_INFINITY,calculadora.divisao(2.0, 0.0),MARGEM_DE_ERRO);
        assertEquals(1.0,calculadora.divisao(5.0, 5.0),MARGEM_DE_ERRO);
        assertEquals(-1.0,calculadora.divisao(-10.0, 10.0),MARGEM_DE_ERRO);
        assertEquals(-3.0,calculadora.divisao(-6.0, 2.0),MARGEM_DE_ERRO);
        assertEquals(2.0,calculadora.divisao(-6.0, -3.0),MARGEM_DE_ERRO);
    }
    
    @Test
    public void testaPotenciacao(){
        assertEquals(1.0,calculadora.potenciacao(2.0, 0),MARGEM_DE_ERRO);
        assertEquals(2.0,calculadora.potenciacao(2.0, 1),MARGEM_DE_ERRO);
        assertEquals(8.0,calculadora.potenciacao(2.0, 3),MARGEM_DE_ERRO);
    }
    

}