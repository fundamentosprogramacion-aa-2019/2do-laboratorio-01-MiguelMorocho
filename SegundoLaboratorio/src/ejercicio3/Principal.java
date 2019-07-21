/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author INSPIRON
 */
public class Principal {

    public static void main(String[] args) {

        //Personas
        Persona p1 = new Persona("Jorge", "Bailon", 54);
        Persona p2 = new Persona("Patricia", "Lopez", 35);
        Persona p3 = new Persona("Robert", "Blacio", 36);
        Persona p4 = new Persona("Maximo", "Quizhpe", 38);
        Persona p5 = new Persona("Karla", "Gonzalez", 41);
        Persona p6 = new Persona("Marco", "Leon", 29);
        Persona p7 = new Persona("Andrea", "Bustamante", 30);
        Persona p8 = new Persona("Mercy ", "Guerrero", 44);

        //Ciudades
        Ciudad c1 = new Ciudad("Guayaquil", "Guayas");
        Ciudad c2 = new Ciudad("Quito", "Pichincha");
        Ciudad c3 = new Ciudad("Loja", "Loja");

        //Creacion de cuatro municipios
        Municipio m1 = new Municipio("Loja", c3);
        Municipio m2 = new Municipio("Catamayo", c3);
        Municipio m3 = new Municipio("Cumbaya", c2);
        Municipio m4 = new Municipio("Urdesa", c1);

        //Areas Municipales
        
        AreaMunicipal am1 = new AreaMunicipal("Nivel Politico", p1, m1);
        AreaMunicipal am2 = new AreaMunicipal("Nivel Acesor", p2, m2);
        AreaMunicipal am3 = new AreaMunicipal("Nivel de Apoyo", p3, m3);
        AreaMunicipal am4 = new AreaMunicipal("Nivel Operativo", p4, m4);
        AreaMunicipal am5 = new AreaMunicipal("Dependencias Generales", p5, 
                m4);

        //Departamentos municipales
       
        DepartamentoMunicipal dm1 = new DepartamentoMunicipal("Alcaldia",
                am1, 4000, p1);
        DepartamentoMunicipal dm2 = new DepartamentoMunicipal("Alacaldia-"
                + "Secretaria",
                am1, 500, p2);
        DepartamentoMunicipal dm3 = new DepartamentoMunicipal("Procuraduría "
                + "Síndica",
                am2, 800, p3);
        DepartamentoMunicipal dm4 = new DepartamentoMunicipal("Dirección"
                + " Financiera",
                am3, 600, p4);
        DepartamentoMunicipal dm5 = new DepartamentoMunicipal("Comisaría "
                + "de Higiene",
                am4, 400, p5);
        DepartamentoMunicipal dm6 = new DepartamentoMunicipal("Comisaría de "
                + "Ornato",
                am4, 400, p6);
        DepartamentoMunicipal dm7 = new DepartamentoMunicipal("Jefe de "
                + "Cultura",
                am4, 550, p7);
        DepartamentoMunicipal dm8 = new DepartamentoMunicipal("Jefe de"
                + " Presupuesto",
                am5, 780, p8);

        //Arreglo para imprimir las Ciudades
        DepartamentoMunicipal[] depMunicipales = new DepartamentoMunicipal[8];
        depMunicipales[0] = dm1;
        depMunicipales[1] = dm2;
        depMunicipales[2] = dm3;
        depMunicipales[3] = dm4;
        depMunicipales[4] = dm5;
        depMunicipales[5] = dm6;
        depMunicipales[6] = dm7;
        depMunicipales[7] = dm8;

        //For para imprimir las 10 ciudades 
        for (int i = 0; i < depMunicipales.length; i++) {
            System.out.println(depMunicipales[i]);
        }

        OperacionDepartamento operacion = new OperacionDepartamento();
        System.out.printf("==================O================="
                + "\nLa suma de presupuestos es: %.2f$", 
                operacion.obtenerSumaPresuspuestos(depMunicipales));
        System.out.printf("\n=================O==================="
                + "\nEl promedio de edades es: %.2f años\n", 
                operacion.obtenerPromedioEdades(depMunicipales));
    }

}
