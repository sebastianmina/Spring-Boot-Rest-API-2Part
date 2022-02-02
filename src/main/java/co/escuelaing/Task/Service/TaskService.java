package co.escuelaing.Task.Service;

import java.util.List;

import co.escuelaing.Task.Data.*;

public interface TaskService {
    
    TaskData create( TaskData task );

    TaskData findById( String id );
    
    List<TaskData> getAll();

    boolean deleteById( String id );

    TaskData update( TaskData taskDto, String id );
}
