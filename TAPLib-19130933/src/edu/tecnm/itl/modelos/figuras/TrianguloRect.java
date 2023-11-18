/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                                  Clase TrianguloRectangulo 
:*        
:*  Archivo     : Cilindro.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase TrianguloRectangulo que hereda de figura
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.figuras;

/**
 *
 * @author carlo
 */

public class TrianguloRect extends Figura {
	private float cateto1;
	private float cateto2;

        
	public TrianguloRect(float cat1, float cat2) {
            this.cateto1 = cat1;
            this.cateto2 = cat2;
	}
        
    //-----------------------------------------------------------------------
        
	public float hipotenusa() {
            return (float) Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
	}

    //-----------------------------------------------------------------------
        
    @Override
    public float area() {
        return (cateto1*cateto2)/2;
    }

    //-----------------------------------------------------------------------
    
    @Override
    public float perimetro() {
        return cateto1+cateto2+hipotenusa();
    }
}
