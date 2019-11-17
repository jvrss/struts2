package controller;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    private static int helloCount = 0;

    public String execute() {
        messageStore = new MessageStore();
        helloCount++;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount() {
        return helloCount;
    }
}
