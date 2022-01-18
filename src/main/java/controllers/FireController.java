package controllers;

import models.FireModel;
import views.PrincipalFrame;

public class FireController {

    private PrincipalFrame principalFrame;
    private FireModel fireModel;

    public void start(){
        principalFrame = new PrincipalFrame(this);
    }
    public FireController(){

//        this.fireModel = fireModel;

    }

}
