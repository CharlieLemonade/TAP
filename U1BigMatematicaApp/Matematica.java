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
:*  03/Sep/2023 Carlos Lopez          Aplicar correccion para calcular operaciones  
:*                                    con numeros grandes. Uso de BigInteger.
:*------------------------------------------------------------------------------------------*/
package matematica;

import java.math.BigInteger;

/**
 *
 * @author Carlos
 */
public class Matematica {
    
    public static BigInteger factorial(int n) {
            BigInteger fact = new BigInteger("-1");
		if(n == 0)
                {
                    fact = BigInteger.ONE ;
                }
                else if(n > 0){
                    fact = BigInteger.ONE;
                  for(int i = 1; i <= n;i++){
                
                    fact = fact.multiply(BigInteger.valueOf(i));
                }
                }else{
                
                    fact = BigInteger.valueOf(-1);
                }
                return fact;

                
	}
//------------------------------------------------------------------------------------------        

	public static BigInteger permutaciones(int n, int r) {
            return ( factorial(n).divide (factorial (n-r)));
	}
//------------------------------------------------------------------------------------------        

	public static BigInteger combinaciones(int n, int r) {
                return (permutaciones(n,r).divide(factorial(r)));
		
	}
}
