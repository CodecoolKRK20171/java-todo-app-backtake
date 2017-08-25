import java.util.*;
import java.util.*;

public class App{
    public static void main(String[] args) {
        TodoList tasksList = new TodoList();
        TodoItem item_1 = new TodoItem("posprzatac");
        TodoItem item_2= new TodoItem("pouczyc sie");
        TodoItem item_3 = new TodoItem("strzelic piwko");
        TodoItem item_4 = new TodoItem("wyspac sie");
        item_1.mark();
        item_3.mark();
        tasksList.AddToList(item_1);
        tasksList.AddToList(item_2);
        tasksList.AddToList(item_3);
        tasksList.AddToList(item_4);

        runApp(tasksList);
    }

    private static void runApp(TodoList tasksList){
        Scanner input = new Scanner(System.in);
        String mainOption;
        String subOption;
        Integer numb;
        boolean flag = true;
        TodoItem item;

        while (flag) {
            System.out.println("Type In your action : listAll, addTask, mark, remove, exit");
            mainOption = input.next();
            if (mainOption.equals("exit")){
                flag = false;

            } else if (mainOption.equals("addTask")) {
                System.out.println("Type In name of your new task");
                subOption = input.next();
                item = new TodoItem(subOption);
                tasksList.AddToList(item);

            } else if (mainOption.equals("listAll")){
                tasksList.listAllTasks();

            } else if (mainOption.equals("mark")){
                System.out.println("Enter number of task u would like to mark: ");
                numb = input.nextInt();
                tasksList.markByEnteredNumb(numb);

            } else if (mainOption.equals("remove")){
                System.out.println("Enter number of task u would like to remove: ");
                numb = input.nextInt();
                item = tasksList.toDoList.get(numb-1);
                tasksList.removeFromList(item);
            }
        }
    }
}
