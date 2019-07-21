/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author INSPIRON
 */
public class Principal {
    public static void main(String[] args){
        
      Region r1 = new Region ("Costa");
      Region r2 = new Region ("Sierra");
      Region r3 = new Region ("Oriente");
     
      Provincia p1 = new Provincia ("Loja", r2);
      Provincia p2 = new Provincia ("Pichincha", r2);
      Provincia p3 = new Provincia ("Imbabura", r2);
      Provincia p4 = new Provincia ("Chimborazo", r2);
      Provincia p5 = new Provincia ("Esmeraldas", r1);
      Provincia p6 = new Provincia ("Guayas", r1);
      Provincia p7 = new Provincia ("Santa Elena", r1);
      Provincia p8 = new Provincia ("Pastaza", r3);
      Provincia p9 = new Provincia ("Napo", r3);
      Provincia p10 = new Provincia ("Orellana", r3);
      
      Ciudad c1 = new Ciudad("Loja", 180617, p1);
      Ciudad c2 = new Ciudad("Quito",1619000, p2);
      Ciudad c3 = new Ciudad("Guayaquil",2291000, p6);
      Ciudad c4 = new Ciudad("Esmeraldas", 161868, p5);
      Ciudad c5 = new Ciudad("Puyo", 33557, p8);
      
        
        Ciudad [] ciudades = new Ciudad [5];
        ciudades [0] = c1;
        ciudades [1] = c2;
        ciudades [2] = c3;
        ciudades [3] = c4;
        ciudades [4] = c5;
        
 
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("%s\n", ciudades[i]);
        }
        
        int suma = 0;
        for (int i = 0; i < ciudades.length; i++) {
            suma = ciudades[i].obtenerPoblacion() + suma;
        }
        double promedio;
        promedio = (double) suma / ciudades.length;
        System.out.printf("==========================O"
                + "========================\n"
                + "El promedio del número de habitantes es: %.2f\n", promedio);
    }
    
}

        
   

