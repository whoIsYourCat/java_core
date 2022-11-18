package lesson2.homeWork;

public class homeWork {
    public static void main(String[] args) {

        //Задание 1
        float height = 1.82F;
        int weight = 75;
        double BMI = weight / (height * height);
        System.out.println(BMI);


        //Задание 2
        int ageChildren = 10;

        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }


        //Задание 3
        boolean chicken = true;
        //Овощи
        boolean vegetables = false;
        //Соус
        boolean sour = true;
        //Гренки
        boolean toast = true;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;
        boolean cesar = chicken && vegetables && sour && toast && sausage && eggs;
        boolean olivier =  (vegetables && sausage) || (chicken && eggs);
        boolean salad = vegetables;

        if (cesar){
            System.out.println("Готовим Цезарь");
        }else if(olivier){
            System.out.println("Готовим оливье");
        }else if(salad){
            System.out.println("Готовим овощной салат");
        } else {
            System.out.println("У меня ничего нет");
        }
    }
}