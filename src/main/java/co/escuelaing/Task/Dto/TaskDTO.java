package co.escuelaing.Task.Dto;

import java.util.Date;

public class TaskDTO {

    String name , description , status , assignedTo, dueDate;

    public TaskDTO(String name, String description, String status, String assignedTo, String dueDate) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
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

    public String getDate(){
        return dueDate;
    }

    public void setDate(String dueDate){
        this.dueDate = dueDate;
    }

}
