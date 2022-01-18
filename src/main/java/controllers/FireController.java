package controllers;

import models.FireModel;
import views.PrincipalFrame;

public class FireController {

    private PrincipalFrame principalFrame;
    private FireModel fireModel;
    private float fireLength = (float) 0.88;

    private boolean primerPitjat = true;

    public void start(){
        principalFrame = new PrincipalFrame(this);
    }
    public FireController(){

//        this.fireModel = fireModel;

    }

    public void pauseFire(){
        if(primerPitjat){
        System.out.println("C pausó");
        }else{
            System.out.println("C reanudó");}
    }


    public void setFireLength(float v) {
        this.fireLength = v;
    }

    public float getFireLength(){
        return fireLength;
    }
}
