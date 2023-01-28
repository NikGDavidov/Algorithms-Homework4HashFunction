package HashSample;
//Написать любую хэш-функцию
import static java.lang.Math.abs;

public class HashSample {
    public static void main(String[] args) {
        System.out.println(getMyFirstHash(new HashSample()));//олучаем целочисленное представление объекта
        int baskets_qty = 16;// количество ячеек в хэш-таблице
        int index = getIndex("Привет", baskets_qty);
        System.out.println(index);
        index = getIndex("Прривет", baskets_qty);
        System.out.println(index);
         index = getIndex("Привет", baskets_qty);
        System.out.println(index);//проверяем, что разные объекты попадают в разные бакеты, тот же объект - в тот же бакет.

    }
    //хэш-функция
    public static int getMyFirstHash(Object obj){
        int result=0;
        byte []arr = obj.toString().getBytes();
        for (int i = 0; i<arr.length; i++){
            result += arr[i]*(i+1);
        }
        return abs(result);
    }
    // метод для получения индекса в хэш-таблице
    public static int getIndex(Object obj, int baskets_qty) {
    int hash = getMyFirstHash(obj);
    return hash%baskets_qty;

    }
}