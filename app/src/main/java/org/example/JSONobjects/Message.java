package org.example.JSONobjects;

public class Message {

    public long ID;
    public String Timestamp;
    public String Contents;
    public String Attachments;

    public Message() {
    }


    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }


    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }


    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        Contents = contents;
    }


    public String getAttachments() {
        return Attachments;
    }
    
    public void setAttachments(String attachments) {
        Attachments = attachments;
    }

}
