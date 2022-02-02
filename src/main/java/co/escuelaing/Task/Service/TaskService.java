package co.escuelaing.Task.Service;

import java.util.List;

import co.escuelaing.Task.Data.*;

public interface TaskService {
    
    Task create( Task task );

    Task findById( String id );
    
    List<Task> getAll();

    boolean deleteById( String id );

    Task update( Task taskDto, String id );
}
