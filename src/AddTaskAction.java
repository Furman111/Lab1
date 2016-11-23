import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class AddTaskAction implements Action {
    private Journal journal;

    public AddTaskAction(Journal j) {
        journal = j;
    }

    public void execute() {
        String name;
        String dscr;
        String date;
        Scanner in = new Scanner(System.in);
        System.out.println("Для продолжения добавления новой задачи введите 1");
        System.out.println("Для выхода из меню создания новой задачи введите 2");
        boolean er = true;
        while(er){
            try {
                er = false;
                int res = in.nextInt();
                if (res==2) return;
                if (res!=1) er = true;
            }
            catch(Exception e){
                er=true;
            }
        }
        System.out.println("Введите имя новой задачи:");
        name = in.nextLine();
        while(!TaskEditor.validName(name)){
            System.out.println("Введено некорректное имя новой задачи, введите пожалуйста заново:");
            name = in.nextLine();
        }
        System.out.println("Введите описание новой задачи:");
        dscr = in.nextLine();
        while(!TaskEditor.validDscr(dscr)){
            System.out.println("Введено некорректное описание новой задачи, введите пожалуйста заново:");
            dscr = in.nextLine();
        }
        System.out.println("Введите дату и время новой задачи в следующем формате: день.месяц.год часы:минуты");
        date = in.nextLine();
        while(!TaskEditor.validDate(date)){
            System.out.println("Введена некорректная дата новой задачи, введите пожалуйста заново в формате: день.месяц.год часы:минуты");
            date = in.nextLine();
        }
        Calendar calendarDate = TaskEditor.parseStringToCalendar(date);
        journal.addTask(journal.size(),new Task(name,calendarDate,dscr));
    }
}
