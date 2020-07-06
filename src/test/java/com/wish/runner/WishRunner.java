package com.wish.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/resources/features/addFirstProductToCart.feature",
        //"src/test/resources/features/removeProductsInCart.feature"
},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/WishFinalProject.json",
        "html:target/WishFinalProject-html"},
        glue = {"com.wish.sites",
                "com.wish.pages",
                "com.wish.steps",
                "com.wish.utils",
                "com.wish.hooks"})

public class WishRunner {
}
