package com.animalshelter.backend.animal.domain.entity;

public enum AnimalType {

    UNKOWN(0),
    CAT(1),
    DOG(2);

    public final int typeId;

    AnimalType(int typeId) {
        this.typeId = typeId;
    }

    public static AnimalType findById(int id){
        for(AnimalType v : values()){
            if( v.typeId == id){
                return v;
            }
        }
        return UNKOWN;
    }
}
