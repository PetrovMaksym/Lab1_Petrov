package com.company;

public class Dictionary {
        private static String[] surnames = {
                "Попович",
                "Лупенко",
                "Сухозалов",
                "Добрыня",
                "Кошмарик",
                "Кострик",
                "Кинев"
        };

        public static String[] getSurnames() {return surnames;}

        private static Integer[] years = {2000, 2001, 2002, 2003, 2004, 2005};

        public static Integer[] getYears() {return years;}

        private static String[] directions = {
                "Север",
                "Юг",
                "Запад",
                "Восток",
                "Северо-запад",
                "Северо-восток",
                "Юго-запад",
                "Юго-восток"
        };

        public static String[] getDirections() {return directions;}

        private static String[] marks = {
                "АТР Alenia",
                "Аэробус Airbus S.A.S.",
                "Agusta Aerospace Company.",
                "Boeing",
                "Bombardier Aerospace",
                "British Aerospace",
                "British Aircraft Corporation",
                "Britten-Norman"
        };

        public static String[] getMarks() {return marks;}
}
