package ru.study.riddle.models;

import java.util.ArrayList;
import java.util.List;


public class ColorRepository {


    public List<Color> listOfColors;

    public ColorRepository() {
        listOfColors = new ArrayList<>();
        int id = 0;
        listOfColors.add(new Color(++id, 0,0,0,0, "Красный"));
        listOfColors.add(new Color(++id,0,0,0,0,"Зеленый"));
        listOfColors.add(new Color(++id,0,0,0,0,"Синий"));
        listOfColors.add(new Color(++id,0,0,0,0,"Желтый"));
        listOfColors.add(new Color(++id,0,0,0,0,"Белый"));
    }

    public List<Color> getListOfColors() {
        return listOfColors;
    }
}
