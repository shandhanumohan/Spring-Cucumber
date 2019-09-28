package com.sample.test.cucumber.stepdefs;

import com.sample.test.calc.Calculate;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractStepdef {

    @Autowired
    public Calculate calculate;

    public int result;


}
