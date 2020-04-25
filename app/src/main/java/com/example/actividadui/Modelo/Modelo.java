package com.example.actividadui.Modelo;

import com.example.actividadui.LogicaNegocio.Pais;
import com.example.actividadui.LogicaNegocio.Provincia;
import com.example.actividadui.LogicaNegocio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Pais> pais_lista;
    private List<Usuario> usuario_list;
    private static Modelo instancia = null;
    public Modelo(){
        pais_lista= new ArrayList<>() ;
        usuario_list= new ArrayList<>() ;
     crearPais();
     crearUsuarios();
    }
    public Modelo getInstancia(){
        if(instancia==null){
            return new  Modelo ();
        }else
            return  instancia;

    }

    public void crearPais(){
        Pais p1 = new Pais("P1","Costa Rica");
        Pais p2 = new Pais("P2","Canada");
        Pais p4 = new Pais("P4","Nueva Zelanda");
        Pais p5 = new Pais("P5","Noruega");
        //Costa Rica
        p1.agregarProvincia(new Provincia("PR1","Alajauela"));
        p1.agregarProvincia(new Provincia("PR2","Sna José"));
        p1.agregarProvincia(new Provincia("PR3","Cartago"));
        p1.agregarProvincia(new Provincia("PR4","Guanacaste"));
        p1.agregarProvincia(new Provincia("PR5","Puntarenas"));
        p1.agregarProvincia(new Provincia("PR6","Heredia"));
        //Canada
        p2.agregarProvincia(new Provincia("PR7","Columbia Britanica"));
        p2.agregarProvincia(new Provincia("PR8","Matioba"));
        p2.agregarProvincia(new Provincia("PR9","Ontario"));
        p2.agregarProvincia(new Provincia("PR10","Alberta"));
        p2.agregarProvincia(new Provincia("PR11","Nueva Escocia"));
        p2.agregarProvincia(new Provincia("PR12","Nuevo Brunswick"));
        p2.agregarProvincia(new Provincia("PR13","Quebec"));
        p2.agregarProvincia(new Provincia("PR14","Terranova y Labarador"));
        //Nueva Zelanda
        p4.agregarProvincia(new Provincia("PR15","Columbia Britanica"));
        p4.agregarProvincia(new Provincia("PR16","Auckland"));
        p4.agregarProvincia(new Provincia("PR17","Canterbury"));
        p4.agregarProvincia(new Provincia("PR18"," Hawke's Bay"));
        p4.agregarProvincia(new Provincia("PR19","Marlborough"));
        p4.agregarProvincia(new Provincia("PR20","Nelson"));
        p4.agregarProvincia(new Provincia("PR21","Nuevo Leinster"));
        p4.agregarProvincia(new Provincia("PR22","Nuevo Munster"));
        //Noruega
        p5.agregarProvincia(new Provincia("PR23","Agder"));
        p5.agregarProvincia(new Provincia("PR24","Innlandet"));
        p5.agregarProvincia(new Provincia("PR25","Nordland"));
        p5.agregarProvincia(new Provincia("PR26","Oslo"));
        p5.agregarProvincia(new Provincia("PR27","Rogaland"));
        p5.agregarProvincia(new Provincia("PR28","Viken"));
        p5.agregarProvincia(new Provincia("PR29","Vestland"));


    }
    public void crearUsuarios(){
        //Admin
        usuario_list.add(new Usuario(true,"administrador","administrador","admin@una.cr","admin"));
        //Estandar
        usuario_list.add(new Usuario(false,"Naomi","Rojas","naon@una.cr","12345678"));
        usuario_list.add(new Usuario(false,"Enibeth","Sanchez","enin@una.cr","12345678"));


    }
}
