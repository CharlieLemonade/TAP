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
:*                                   Clase Abstracta Prisma
:*        
:*  Archivo     : Prisma.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase Prisma
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  
:*------------------------------------------------------------------------------------------*/
package edu.tecnm.itl.modelos.prismas;

/**
 *
 * @author carlo
 */
public abstract class Prisma {

	public abstract float areaBase();
        
        //-----------------------------------------------------------------------

	public abstract float areaLateral();

        //-----------------------------------------------------------------------
        
	public abstract float areaTotal();

        //-----------------------------------------------------------------------
        
	public abstract float volumen();
}
