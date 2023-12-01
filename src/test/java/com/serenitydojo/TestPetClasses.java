package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestPetClasses {

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido","Bone", 5);
        Pet spot = new Cat("Spot","String", 5);
        Pet hazel = new Hamster("Hazel", 1, "Wheel");

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }
}
