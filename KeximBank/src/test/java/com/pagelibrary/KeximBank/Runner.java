package com.pagelibrary.KeximBank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="folder",glue= {"com.pagelibrary.KeximBank"},
format= {"pretty","html:C:\\Users\\Sudheer Martha\\eclipse-workspace\\KeximBank\\target"})
public class Runner {

}

//@CucumberOptions::to get cucumber file into this cucumber class
//@RunWith::to convert java file to cucumber class file
/*features=folder::to get the feature file into runner class,if it is only one feature file we need to
/mention as foldername/feature-filename*/

