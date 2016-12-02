package actions;

import data.*;
import ui.*;
import validation.TaskEditor;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by FurmanT on 23.11.2016.
 */
public class EditTaskAction implements Action {
    private Journal journal;

    public EditTaskAction(Journal journal) {
        this.journal = journal;
    }

    public void execute() {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < journal.size(); i++)
                System.out.println(i + 1 + ") " + journal.getTask(i).getName());
            System.out.println();
            System.out.println("Для редактирования задачи введите её номер. Для возврата в главное меню нажмите Enter");
            int ind = -1;
            while (true) {
                try {
                    String res = in.nextLine();
                    if (res.isEmpty()) return;
                    ind = Integer.valueOf(res) - 1;
                } catch (Exception e) {
                    System.out.println("Некорректный ввод, введите заново:");
                }
                if (ind >= 0 && ind < journal.size())
                    break;
                else
                    System.out.println("Введен несуществующий номер задачи, повторите ввод:");
            }
            while (true) {
                int command = -1;
                ConsoleView.showTask(journal.getTask(ind));
                System.out.println();
                System.out.println("Для редактирования определённой части задачи введите соответствующую цифру:" +
                        "\n1 - Имя задачи\n2 - Описание задачи\n3 - Дата и время задачи\n4 - Выбрать другую задачу для редактирования\n\nДля возврата в главное меню нажмите Enter");
                while (true) {
                    try {
                        String res = in.nextLine();
                        if (res.isEmpty()) return;
                        command = Integer.valueOf(res);
                    } catch (Exception e) {
                        System.out.println("Некорректный ввод, введите заново:");
                    }
                    if (command > 0 && command < 5)
                        break;
                    else
                        System.out.println("Введена несуществующая команда, повторите ввод:");
                }
                if (command == 4)
                    break;
                switch (command) {
                    case 1:
                        String name;
                        System.out.println("Введите новое имя задачи:");
                        name = in.nextLine();
                        while (!TaskEditor.validName(name)) {
                            System.out.println("Введено некорректное новое имя задачи, введите пожалуйста заново:");
                            name = in.nextLine();
                        }
                        journal.getTask(ind).setName(name);
                        break;
                    case 2:
                        String dscr;
                        System.out.println("Введите новое описание задачи:");
                        dscr = in.nextLine();
                        while (!TaskEditor.validDscr(dscr)) {
                            System.out.println("Введено некорректное новое описание задачи, введите пожалуйста заново:");
                            dscr = in.nextLine();
                        }
                        journal.getTask(ind).setDescription(dscr);
                        break;
                    case 3:
                        String date;
                        System.out.println("Введите новые дату и время задачи в следующем формате: день.месяц.год часы:минуты");
                        date = in.nextLine();
                        while (!TaskEditor.validDate(date)) {
                            System.out.println("Введена некорректная новая дата задачи, введите пожалуйста заново в формате: день.месяц.год часы:минуты");
                            date = in.nextLine();
                        }
                        Calendar calendarDate = TaskEditor.parseStringToCalendar(date);
                        journal.getTask(ind).setDate(calendarDate);
                        break;
                }
            }
        this.execute();
    }
}
