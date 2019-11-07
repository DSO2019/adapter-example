package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoAdapter implements Torta{
    Taco taco;
    public TacoAdapter(Taco taco1){
        this.taco = taco1;
    }


    @Override
    public void cutByHalf() {

    }

    @Override
    public void fill() {
        this.taco.fill();
    }

    @Override
    public void cover() {
        this.taco.fold();
    }

    @Override
    public void printDescription() {
        this.taco.printDescription();
    }
}
