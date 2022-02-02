package co.escuelaing.Task.Service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

//import co.escuelaing.Task.Dto.TaskDTO;
import co.escuelaing.Task.Service.TaskService;

//import org.springframework.stereotype.Service;
import co.escuelaing.Task.Data.Task;

@Service
public class TaskImpl implements TaskService {
    HashMap<String , Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        tasks.put(task.getId() , task);
        return task;
    }

    @Override
    public Task findById(String id) {
        return tasks.containsKey(id) ? tasks.get(id) : null ;
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<Task>(tasks.values());
    }

    @Override
    public boolean deleteById(String id) {
        if (tasks.containsKey(id)) {
            tasks.remove(id) ;
            return true;
        }
        else return false;
    }

    @Override
    public Task update(Task task, String id) {
        if(tasks.containsKey(id)) tasks.put(id,task);
        return task;
    }
    

}
