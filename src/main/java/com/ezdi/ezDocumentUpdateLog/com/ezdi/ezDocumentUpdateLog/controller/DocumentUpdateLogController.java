package com.ezdi.ezDocumentUpdateLog.com.ezdi.ezDocumentUpdateLog.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentUpdateLogController {
    @RequestMapping(value={"/samplepath"},method= RequestMethod.GET)
    public String samplePath(){
        return("Path reached");
    }
}
