/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{
    private String title;
    private boolean isDone;

    public TodoItem(String title){
        this.title = title;
        // this.deadline = deadline;
        this.isDone = false;
    }

    public void mark(){
        this.isDone = true;
    }

    public String toString() {
        String output = "";
        if (this.isDone) {
            output += "[X]";
        } else {
            output += "[ ]";
        }
        output += " " + this.title;

        return output;
    }

    public String getName(){
        return this.title;
    }
}
