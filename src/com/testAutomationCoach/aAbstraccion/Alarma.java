package com.testAutomationCoach.aAbstraccion;

public class Alarma {
    String tonoAlarma;
    int horas;
    int minutos;
    int[] diasSemana = new int[7]; //boolean[] = new boolean[7];
    int volumen;

    public static void inicicarAlarma(int horas, int minutos){}
    public static void apagarAlarma(){}
    public static void seleccionarDiasAlarma(int[] diasSemana){}
    public static void seleccionarTonoAlarma(String tonoAlarma){}
    public static void subirVolumen(int volumen){}
    public static void bajarVolumen(int volumen){}
    public static void aplazarAlarma(int minutos){}
}
