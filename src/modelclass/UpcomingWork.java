/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

/**
 *
 * @author jawhar
 */
public class UpcomingWork 
{
    private String task, dueDate;

    public UpcomingWork(String task, String dueDate) {
        this.task = task;
        this.dueDate = dueDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "UpcomingWork{" + "task=" + task + ", dueDate=" + dueDate + '}';
    }
    
    
    
}
