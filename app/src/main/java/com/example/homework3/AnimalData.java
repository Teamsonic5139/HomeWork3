package com.example.homework3;

import android.widget.ArrayAdapter;

import com.example.homework3.Model.Animal;

import java.util.ArrayList;

/**
 * Created by User on 29/10/2560.
 */

public class AnimalData {
    private static AnimalData sInstant;

    public ArrayList<Animal> animalList ;//ที่เหลือคือโครง

    public static AnimalData getsInstant(){
        if (sInstant == null){
            sInstant = new AnimalData();
        }
        return sInstant;
    }
}
