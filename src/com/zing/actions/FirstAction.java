package com.zing.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhang on 2016/12/28.
 */
public class FirstAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String add() {
        System.out.println("add");
        return "add";
    }

    public String delete() {
        System.out.println("delete");
        return "delete";
    }

    public String find() {
        System.out.println("find");
        return "find";
    }

    public String update() {
        System.out.println("update");
        return "update";
    }
}
