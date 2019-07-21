/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author INSPIRON
 */
public class Principal {

    public static void main(String[] args) {
        
        Confederacion c1 = new Confederacion("Confederación Asiática "
                + "de Fútbol", "AFC");
        Confederacion c2 = new Confederacion("Confederación Sudamericana "
                + "de Fútbol", "Conmebol, CSF");
        Confederacion c3 = new Confederacion("Confederación de Fútbol"
                + "de Oceanía", "OFC");
        Confederacion c4 = new Confederacion("Confederación Africana "
                + "de Fútbol", "CAF");
        
        
        Federacion f1 = new Federacion("Ghana Football Association", 
                c4, "Futbol");
        Federacion f2 = new Federacion("Nigeria Football Association", 
                c4, "Futbol");
        Federacion f3 = new Federacion("Federación de Fútbol "
                + "de Tonga", c3, "Futbol");
        Federacion f4 = new Federacion ("Federación de Fútbol de Camboya ", 
                c1, "Futbol");
        Federacion f5 = new Federacion ("Asociación del Fútbol Argentino",
                c2,"Futbol");
        Federacion f6 = new Federacion ("Federación Ecuatoriana de Fútbol", 
                c2,"Futbol");
        Federacion f7 = new Federacion ("Federación Colombiana de Fútbol", 
                c2,"Futbol");
        Federacion f8 = new Federacion ("Federación Peruana de Fútbol ",
                c2,"Futbol");
        
        Equipo e1 = new Equipo("Cambodia Tiger", f4, 1);
        Equipo e2 = new Equipo("Naga World", f4, 2);
        Equipo e3 = new Equipo("CA Boca Juniors", f5, 3);
        Equipo e4 = new Equipo("Barcelona SC", f6, 2);
        Equipo e5 = new Equipo("Atlético Nacional", f7, 2);
        Equipo e6 = new Equipo("Millonarios", f7, 1);
        Equipo e7 = new Equipo("Emelec", f6, 3);
        Equipo e8 = new Equipo("América de Cali", f7, 3);
        Equipo e9 = new Equipo("CA River Plate", f5, 3);
        Equipo e10 = new Equipo("National Defense", f4, 2);
        Equipo e11 = new Equipo("Liga de Loja", f6, 2);
        Equipo e12 = new Equipo("Academia Cantolao", f8, 3);
        
        
        Equipo [] equipos = new Equipo[12];
        equipos [0] = e1;
        equipos [1] = e2;
        equipos [2] = e3;
        equipos [3] = e4;
        equipos [4] = e5;
        equipos [5] = e6;
        equipos [6] = e7;
        equipos [7] = e8;
        equipos [8] = e9;
        equipos [9] = e10;
        equipos [10] = e11;
        equipos [11] = e12;
        
 
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%s\n", equipos[i]);
        }
        
        int suma = 0;
        for (int i = 0; i < equipos.length; i++) {
            suma = equipos[i].obtenerNumeroCampeonatos() + suma;
        }
        System.out.printf("=============================================O"
                + "=================\n"
                + "La suma de los campeonatos es: %d\n", suma);
    }
    
}
