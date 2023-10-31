package ru.study.riddle.models;



public class Color {
    private int id;
    private int id2;
    private int id3;
    private int id4;
    private int id5;
    private String name;

    public Color(){

    }

    public Color(int id, int id2, int id3, int id4, int id5, String name) {
        this.id = id;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
        this.id5 = id5;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getId4() {
        return id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }

    public int getId5() {
        return id5;
    }

    public void setId5(int id5) {
        this.id5 = id5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
