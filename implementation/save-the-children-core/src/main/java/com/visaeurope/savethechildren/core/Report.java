package com.visaeurope.savethechildren.core;

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by dima on 21/08/2015.
 */
public class Report {

    String eventDate;
    String eventTime;
    HashMap<String,Boolean> questionaireResults;
    Location eventLocation;
    String extraInfo;
    String attachmentBlob;

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public HashMap<String, Boolean> getQuestionaireResults() {
        return questionaireResults;
    }

    public void setQuestionaireResults(HashMap<String, Boolean> questionaireResults) {
        this.questionaireResults = questionaireResults;
    }

    public Location getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(Location eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getAttachmentBlob() {
        return attachmentBlob;
    }

    public void setAttachmentBlob(String attachmentBlob) {
        this.attachmentBlob = attachmentBlob;
    }
}
