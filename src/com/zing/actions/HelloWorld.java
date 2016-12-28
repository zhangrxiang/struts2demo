package com.zing.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhang on 2016/12/28.
 */
public class HelloWorld extends ActionSupport {

    public final String HELLOWORLD = "success";
    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String helloWorld(){
        System.out.println(HELLOWORLD);
        return SUCCESS;
    }
}
