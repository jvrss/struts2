package controller;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    private static int helloCount = 0;

    private String userName;

    public String execute() {
        messageStore = new MessageStore();
        helloCount++;

        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount() {
        return helloCount;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
