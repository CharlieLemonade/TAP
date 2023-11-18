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
:*                                   Clase Cilindro
:*        
:*  Archivo     : Cilindro.java
:*  Autor       : Carlos Lopez Trujillo 19130933
:*  Fecha       : 20/SEPT/2023
:*  Compilador  : JDK 11 + Netbeans 
:*  Descripción : Clase cilindro que hereda de la clase Prisma
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  
:*------------------------------------------------------------------------------------------*/

package edu.tecnm.itl.modelos.prismas;
import edu.tecnm.itl.modelos.figuras.Circulo;
import edu.tecnm.itl.modelos.figuras.Rectangulo;
import java.util.ArrayList;


/**
 *
 * @author carlo
 */
public class Cilindro extends Prisma {
	private float radio;
	private float altura;
	private Rectangulo caraLateral;
	private ArrayList<Circulo> baseSupInf = new ArrayList<Circulo>();

	public Cilindro(float radio, float altura) {
            this.radio = radio;
            this.altura = altura;
            
           
            baseSupInf.add( new Circulo ( radio ) );
            baseSupInf.add( new Circulo ( radio ) );
            float largo = baseSupInf.get( 0 ).circunferencia();
            caraLateral = new Rectangulo( largo, altura );
	}
        //-----------------------------------------------------------------------
        
	public float areaBase() {
            return baseSupInf.get( 0 ).area();
	}

        //-----------------------------------------------------------------------
        
	public float areaLateral() {
            return caraLateral.area();
	}

        //-----------------------------------------------------------------------
        
	public float areaTotal() {
            return caraLateral.area() + ( 2 * baseSupInf.get( 0 ).area() );
	}

        //-----------------------------------------------------------------------
        
	public float volumen() {
		return areaBase() * altura;
	}
}