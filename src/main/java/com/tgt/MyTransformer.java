package com.tgt;

/**
 * Created by a522467 on 11/20/16.
 */
public class MyTransformer {

    public String transformContent(String body)
    {
       String uppperCaseContent =  body.toUpperCase();
        return  uppperCaseContent;
    }
}
