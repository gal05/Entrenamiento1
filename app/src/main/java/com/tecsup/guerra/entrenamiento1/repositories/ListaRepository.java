package com.tecsup.guerra.entrenamiento1.repositories;

import com.tecsup.guerra.entrenamiento1.models.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaRepository {

    private  static List<Lista> listas;
    static {
        listas=new ArrayList<>();
        listas.add(new Lista(1,"Hotel Las gaviotas","Lima 0101","Mega plaza",998987898,"gaviotas"));
        listas.add(new Lista(2,"Gato negro","Ate 06060","Ceres",998945543,"gatonegro"));
        listas.add(new Lista(3,"Hotel el paraiso","Vitarte","Tagore",343456676,"paraiso"));
        listas.add(new Lista(4,"The rocas","Chosica 933","Huachipa",356654366,"rocas"));
        listas.add(new Lista(5,"Hotel Sheraton","Lima 23432","Cercado de lima",989878765,"sheraton"));
        listas.add(new Lista(6,"Mall Ovalo Sta Anita","Santa Anita 29394","Mall Sta Anita",987474632,"mall"));
        listas.add(new Lista(7,"Metro Frutales","La molina","Metreo frutales",847464637,"frutales"));

    }

    public static List<Lista> getListas() {
        return listas;
    }
}
