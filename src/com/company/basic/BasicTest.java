package com.company.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {
    public static Basic basic;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeAll
    static void before(){
    basic=new Basic();
    }
@Test
    void task7() {
        assertArrayEquals(Basic.task7(3),new int[]{3,6,9,12,15,18,21,24,27,30});

    }
    @Test
    void task8(){
        Basic.task8();
        assertEquals("   J    a   v     v  a \r\n", outContent.toString());
        outContent.reset();
    }
    @Test
    void task54(){

        assertEquals(true,Basic.task54(10,15,5));
        assertEquals(true,Basic.task54(10,15,2));
        outContent.reset();
    }

}


/*
        * * * * * * ==================================
        * * * * *   ==================================
        * * * * * * ==================================
        * * * * *   ==================================
        * * * * * * ==================================
        * * * * *   ==================================
        * * * * * * ==================================
        * * * * *   ==================================
        * * * * * * ==================================
        ==============================================
        ==============================================
        ==============================================
        ==============================================
        ==============================================
        ==============================================
 */