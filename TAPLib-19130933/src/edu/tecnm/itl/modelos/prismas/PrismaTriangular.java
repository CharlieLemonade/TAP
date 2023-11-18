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
:*                                   Clase PrismaTriangular
:*        
:*  Archivo     : PrismaTriangular.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase PrismaTriangular que hereda de la clase Prisma
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
import edu.tecnm.itl.modelos.figuras.TrianguloRect;
import java.util.ArrayList;

public class PrismaTriangular extends Prisma {
	private float catetoA;
	private float catetoB;
	private float altura;
	private ArrayList<Rectangulo> carasLaterales = new ArrayList<Rectangulo>();
	private ArrayList<TrianguloRect> baseSupInf = new ArrayList<TrianguloRect>();

	public PrismaTriangular(float catA, float catB, float altura) {
            this.catetoA = catA;
            this.catetoB = catB;
            this.altura = altura;
        
            // Crear los objetos de composicion del prisma Rectangular
            baseSupInf.add(new TrianguloRect(catetoA, catetoB));
            baseSupInf.add(new TrianguloRect(catetoA, catetoB));

            carasLaterales.add(new Rectangulo(catetoA, altura));
            carasLaterales.add(new Rectangulo(catetoB, altura));
            carasLaterales.add(new Rectangulo(baseSupInf.get(0).hipotenusa(), altura));
        }

        //-----------------------------------------------------------------------
        
	public float areaBase() {
            return baseSupInf.get(0).area();
        }

        //-----------------------------------------------------------------------
        
	public float areaLateral() {
		return carasLaterales.get(0).area() + carasLaterales.get(1).area() + carasLaterales.get(2).area();
	}

        //-----------------------------------------------------------------------
        
	public float areaTotal() {
		return areaLateral()+ (2*areaBase());
	}

        //-----------------------------------------------------------------------
        
	public float volumen() {
		return areaBase()*altura;
	}
        
        
        
}
