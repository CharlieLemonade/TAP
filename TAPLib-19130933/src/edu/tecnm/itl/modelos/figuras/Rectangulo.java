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
:*                               Clase Rectangulo
:*        
:*  Archivo     : Rectangulo.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase Rectangulo que hereda de la clase figura.java
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
public class Rectangulo extends Figura {
	private float largo;
	private float ancho;

	public Rectangulo(float largo, float ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }

    //-----------------------------------------------------------------------
        
    @Override
    public float area() {
        return largo*ancho;
    }

    //-----------------------------------------------------------------------
    
    @Override
    public float perimetro() {
        return largo*2+ancho*2;
    }
}