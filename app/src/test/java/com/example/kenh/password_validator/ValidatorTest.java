package com.example.kenh.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ken H on 2018-02-10.
 */
public class ValidatorTest {

    Validator val=new Validator();

    @Test
    public void rule1()
    {
        assertEquals(2,val.validate("password" ));
    }

    @Test
    public void rule2()
    {
        assertEquals(2,val.validate("fail" ));
    }

    @Test
    public void rule3()
    {
        assertEquals(4,val.validate("Oaihfaohwojfoijfw" ));
    }

    @Test
    public void rule4()
    {
        assertEquals(5,val.validate("Oaihfaohwojfoijfw7" ));
    }

}