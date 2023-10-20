package com.chivumarius.furniturestore;



public class DataModel {

    // ▼ "VARIABLES" ▼
    String name;
    String version;

    int id_;
    int image;



    // ▬ "CONSTRUCTOR" ▬
    public DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
    }


    // ▬ "GETTER" AND "SETTER" → FOR "NAME"  ▬
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    // ▬ "GETTER" AND "SETTER" → FOR "VERSION"  ▬
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }




    // ▬ "GETTER" AND "SETTER" → FOR "ID"  ▬
    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }




    // ▬ "GETTER" AND "SETTER" → FOR "IMAGE"  ▬
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
