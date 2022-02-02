package co.escuelaing.Task.Controller;

import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.escuelaing.Task.Data.Task;
import co.escuelaing.Task.Dto.TaskDTO;
import co.escuelaing.Task.Service.*;


@RestController
@RequestMapping( "/v1/task" )
public class TaskController {
    private final TaskService taskService;
    private final AtomicLong counter = new AtomicLong(0);

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public ResponseEntity<List<Task>> getAll() {

        return new ResponseEntity<List<Task>>(taskService.getAll() , HttpStatus.OK );

    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById(@PathVariable String id ) {


        return new ResponseEntity<Task>(taskService.findById(id) , HttpStatus.OK );
    }


    @PostMapping
    public ResponseEntity<Task> create( @RequestBody TaskDTO taskDto ) {

        Task userCreation = new Task((Integer.toString((int) counter.incrementAndGet())), taskDto.getName() , taskDto.getDescription() ,
                taskDto.getStatus(), taskDto.getAssignedTo() , taskDto.getDate(),  LocalDateTime.now().toString());

        return new ResponseEntity<Task>(taskService.create(userCreation), HttpStatus.OK );
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update( @RequestBody TaskDTO taskDto, @PathVariable String id ) {
        Task task = taskService.findById(id);
        task.setAssignedTo(taskDto.getAssignedTo());
        task.setDescription(taskDto.getDescription());
        task.setDate(taskDto.getDate());
        task.setName(taskDto.getName());
        return new ResponseEntity<Task>(taskService.update(task , id ), HttpStatus.OK );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) throws Exception {
        return new ResponseEntity<Boolean>(taskService.deleteById(id), HttpStatus.OK);
    }
}