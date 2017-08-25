import java.io.*;
import java.util.*;

public class TodoList{
    ArrayList<TodoItem> toDoList = new ArrayList<>();

    public void AddToList(TodoItem item){
        toDoList.add(item);
    }

    public void removeFromList(TodoItem item){
        toDoList.remove(item);
    }

    public void listAllTasks(){
        int i = 1;
        for (Object item : toDoList){
            System.out.println(i + "." + item);
            i++;
        }
    }

    public void markByEnteredNumb(Integer numb){
        this.toDoList.get(numb-1).mark();
    }
}
