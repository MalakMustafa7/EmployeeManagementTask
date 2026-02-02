package org.example.entity;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class CompanyInfo {
    private static final String name;
    private static final String country;

    static {
        name="Vodafone";
        country="Egypt";
        log.info(" Company information is loaded");
    }


    public static void displayInfo(){
        log.info("CompanyLegalName= {}",name);
        log.info("Country= {}",country);
    }

}
