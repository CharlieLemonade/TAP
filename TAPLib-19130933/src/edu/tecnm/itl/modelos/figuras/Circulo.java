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
:*                                 Clase Circulo    
:*        
:*  Archivo     : Circulo.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase circulo que hereda de figura
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
    public class Circulo extends Figura {
            private float radio;

            public Circulo(float r) {
                    this.radio = r;
            }

       //-----------------------------------------------------------------------

            public float circunferencia() {
                    return (float) (Math.PI * ( 2 * radio));
            }

       //-----------------------------------------------------------------------

        @Override
        public float area() {
            return (float) (Math.PI * (Math.pow(radio, 2)));
        }

        //-----------------------------------------------------------------------

        @Override
        public float perimetro() {
            return circunferencia();
        }
    }
