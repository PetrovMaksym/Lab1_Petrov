package com.company;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

public class Main {
        public static Random r = new Random();
    public static void main(String[] args) {
        int num = r.nextInt(5)+1;
        System.out.println("Количество студентов: " + num);
        Student[] student = new Student[num];
        Input_Student(student, num);
        Output_Student(student, num);

        num = r.nextInt(5)+1;
        Airport[] airport = new Airport[num];
        System.out.println("\n\n\nКоличество авиарейсов: " + num);
        Input_Airport(airport, num);
        Output_Airport(airport, num);
    }

    public static void Input_Student(Student[] student, int num)
    {
        for (int i = 0; i < num; i++)
        {
            student[i] = new Student();
            student[i].surname = Dictionary.getSurnames()[r.nextInt(Dictionary.getSurnames().length)];
            System.out.println("\nФамилия студента: " + student[i].surname);

            student[i].group = r.nextInt(3)+1;
            System.out.println("Номер группы: " + student[i].group);

            student[i].year = Dictionary.getYears()[r.nextInt(Dictionary.getYears().length)];
            System.out.println("Год рождения: " + student[i].year);

            student[i].rating_physics = r.nextInt(5)+1;
            System.out.println("Оценка по физике: " + student[i].rating_physics);

            student[i].rating_math = r.nextInt(5)+1;
            System.out.println("Оценка по математике: " + student[i].rating_math);

            student[i].rating_history = r.nextInt(5)+1;
            System.out.println("Оценка по истории: " + student[i].rating_history);
        }
    }

    public static void Output_Student(Student[] student, int num)
    {
        int amount = 0;
        System.out.print("Cтуденты, сдавшие математику на отлично: ");
        for (int i = 0; i < num; i++)
        {
            if (student[i].rating_math == 5)
            {
                System.out.print(student[i].surname + " ");
                amount++;
            }
        }
        System.out.println("\nКоличество студентов, сдавших математику на отлично: " + amount);
    }

    public static void Input_Airport(Airport[] airport, int num)
    {
        for (int i = 0; i < num; i++)
        {
            airport[i] = new Airport();
            airport[i].N = r.nextInt(20)+1;
            System.out.println("\n№ авиарейса: " + airport[i].N);

            int hour = r.nextInt(24)+1;
            int minute = r.nextInt(60)+1;
            airport[i].startDate = LocalTime.of(hour, minute);
            System.out.println("Время вылета: " + airport[i].startDate);

            hour = hour + r.nextInt(10) + 1;
            minute = minute + r.nextInt(60)+1;
            airport[i].endDate = airport[i].startDate.plusHours(r.nextInt(10)+1).plusMinutes(r.nextInt(60)+1);
            System.out.println("Время прилета: " + airport[i].endDate);

            airport[i].direction = Dictionary.getDirections()[r.nextInt(Dictionary.getDirections().length)];
            System.out.println("Направление: " + airport[i].direction);

            airport[i].mark = Dictionary.getMarks()[r.nextInt(Dictionary.getMarks().length)];
            System.out.println("Марка самолета: " + airport[i].mark);

            airport[i].distance = r.nextInt(5000)+1000;
            System.out.println("Расстояние: " + airport[i].distance + " км");
        }
    }

    public static void Output_Airport(Airport[] airport, int num)
    {
        int imax = 0;
        int max = 0;
        int dif = 0;
        for (int i = 0; i < num; i++)
        {
            dif = Math.abs((int) Duration.between(airport[i].startDate, airport[i].endDate).toMinutes());
            if (dif>max)
            {
                max = dif;
                imax = i;
            }
        }
        System.out.println("\nАвиарейс с максимальной длительностью полета: ");
        System.out.println("\n№ авиарейса: " + airport[imax].N);
        System.out.println("Время вылета: " + airport[imax].startDate);
        System.out.println("Время прилета: " + airport[imax].endDate);
        System.out.println("Направление: " + airport[imax].direction);
        System.out.println("Марка самолета: " + airport[imax].mark);
        System.out.println("Расстояние: " + airport[imax].distance + " км");
    }
}
