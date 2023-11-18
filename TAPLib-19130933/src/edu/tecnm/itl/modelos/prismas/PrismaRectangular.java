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
:*                                   Clase PrismaRectangular
:*        
:*  Archivo     : PrismaRectangular.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase Prisma Rectangular que hereda de la clase Prisma.java
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
import edu.tecnm.itl.modelos.figuras.Rectangulo;
import java.util.ArrayList;


public class PrismaRectangular extends Prisma {
	private float ladoA;
	private float ladoB;
	private float altura;
        
	private ArrayList<Rectangulo> carasLaterales = new ArrayList<Rectangulo>();
	public ArrayList<Rectangulo> baseSupInf = new ArrayList<Rectangulo>();

	public PrismaRectangular(float ladoA, float ladoB, float altura) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.altura = altura;

       
            
            
            
            baseSupInf.add(new Rectangulo(ladoB, ladoA));
            baseSupInf.add(new Rectangulo(ladoB, ladoA));

            carasLaterales.add(new Rectangulo(ladoA, altura));
            carasLaterales.add(new Rectangulo(ladoA, altura));
            carasLaterales.add(new Rectangulo(ladoB, altura));
            carasLaterales.add(new Rectangulo(ladoB, altura));
	}

        //-----------------------------------------------------------------------
        
	public float areaBase() {
		return baseSupInf.get(0).area();
	}

        //-----------------------------------------------------------------------
        
	public float areaLateral() {
		 return carasLaterales.get(0).area() + carasLaterales.get(1).area() + carasLaterales.get(2).area() + carasLaterales.get(3).area();
	}

        //-----------------------------------------------------------------------
        
	public float areaTotal() {
		return areaLateral() + (2 * areaBase());
	}

        //-----------------------------------------------------------------------
        
	public float volumen() {
		return areaBase() * altura;
	}
}
