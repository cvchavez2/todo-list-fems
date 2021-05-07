package com.carloscognizant.todolistfems.models;

import java.util.Date;

public class Todo {
    long id;
    String createdBy;
    boolean isCompleted;
    String todo;
    Date dateCreated;
    Date dateCompleted;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public long getReferenceId() {
        return id;
    }

    public void setReferenceId(long referenceId) {
        this.id = referenceId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getItemName() {
        return todo;
    }

    public void setItemName(String itemName) {
        this.todo = itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
}
