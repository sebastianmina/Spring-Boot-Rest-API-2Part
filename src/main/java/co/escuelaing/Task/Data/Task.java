package co.escuelaing.Task.Data;

import java.util.Date;

public class TaskData {
    private String id;
    private String name;
    private String description;
    private String status;
    private String assignedTo;
    private Date dueDate;
    private String created;

    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getAssignedTo(){
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo){
        this.assignedTo = assignedTo;
    }

    public Date getDate(){
        return dueDate;
    }

    public void setDate(Date dueDate){
        this.dueDate = dueDate;
    }

    public String getCreated(){
        return created;
    }

    public void setCreated(String created){
        this.created = created;
    }
}
