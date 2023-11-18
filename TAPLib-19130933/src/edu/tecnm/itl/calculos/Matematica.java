/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                   Clase que calcula operaciones matematicas
:*        
:*  Archivo     : Matematica.java
:*  Autor       : Carlos Lopez Trujillo     19130933        
:*  Fecha       : 28/08/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripción : Esta clase ofrece medicos estaticos para calcular las sig.
:*                operaciones matematicas:
:*                  1. Factorial n!
:*                  2. Permutaciones de n tomando r P(n,r)
:*                  3. Combinaciones de n tomando r C(n,r)
:*  Ultima modif:
:*  Fecha       Modifico             Motivo
:*========================================================================================== 
:*  03/Sep/2023 Carlos Lopez         
:*------------------------------------------------------------------------------------------*/

package edu.tecnm.itl.calculos;

/**
 *
 * @author carlo
 */
public class Matematica {

    public static long factorial(int n) {
         long resultado = 1;
                 
          for( int x = 1; x <= n; x++ ){
             resultado *= x;
           } 
             return resultado;
          }

    public static long permutaciones (int n, int x) {
             return factorial(n) / factorial ( n - x );
	}

    public static long combinaciones(int n, int x) {
             return permutaciones( n, x )  / factorial (x);
	}
}