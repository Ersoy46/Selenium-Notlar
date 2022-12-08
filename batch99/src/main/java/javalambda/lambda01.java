package javalambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class lambda01
{
    /*Lambda Functional Programming
     * Functional Programming te Nasıl Yaparım değil Ne Yaparım düşünülür.
     * Structuret Programming te Ne Yaparım dan çok Nasıl Yaparım düşünülür.
     * Functional Programming te Hız Code Kısalığı Code Okunabilirliği
     * ve Hatasız Code yazma açılarından çok faydalıdır.
     * Lambda sadece Collectionlarda (List,Queue ve Set) ve Array lerde kullanılabilir ancak Maplerde kullanılamaz.
     * Lambda kullanmak hatasız code kullanmaktır.
     */
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,60,42,55));
        prinElsStructured(list); // Method Call
        System.out.println();
        System.out.println("***********");
        prinElfunctional(list);
        System.out.println( );
        System.out.println("***********");
        prinElfunctional1(list);
        System.out.println( );
        System.out.println("***********");
        prinCiftElStructured(list);
        System.out.println( );
        System.out.println("***********");
        prinElCiftFunctional(list);
        System.out.println( );
        System.out.println("***********");
        prinElCiftkucukFunctional(list);
        System.out.println( );
        System.out.println("***********");
        tekYırmıdenBuyukPrint(list);
        System.out.println( );
        System.out.println("***********");
        ciftKarePrint(list);
        System.out.println( );
        System.out.println("***********");
        tekKupFazla(list);
        System.out.println( );
        System.out.println("***********");
        kareKokCİft(list);
        System.out.println( );
        System.out.println("***********");
        enBuyukPrint(list);
    }
    //Structured programing ile list elemanlarının tamamını yazdırınız.
    public static void prinElsStructured(List<Integer>list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
        //Functional programing ile list elemanlarının tamamını yazdırınız.
    }
        public static void prinElfunctional (List < Integer > list) {
            list.stream().forEach(t -> System.out.print(t + " "));
        }

public static void prinEl(int t){
    System.out.print(t+ " ");
}
public static void prinElfunctional1(List < Integer > list){
        list.stream().forEach(lambda01::prinEl);
}
// Structured programing ile list elemanlarının cift olanlarını aynı satırda aralarına boşluk bırakarak yazdırınız.

    public static void prinCiftElStructured(List < Integer > list){
       for (Integer w :list){
           if (w%2==0){
               System.out.print(w+ " ");
           }

       }

    }

// Functional programing ile list elemanlarının cift olanlarını aynı satırda aralarına boşluk bırakarak yazdırınız.

public static void prinElCiftFunctional(List < Integer > list){
        list.stream().filter(t->t%2==0).forEach(lambda01::prinEl);
}
public static boolean ciftBul(int i){

        return i%2==0; // ciftbull ile ilgili method oluşturduk. kısayol ile direk buradan alabiliriz.
}

// Functional programing ile list elemanlarının cift olanlarını 60 dan küçük olanlarını
// aynı satırda aralarına boşluk bırakarak yazdırınız.

public static void prinElCiftkucukFunctional(List < Integer > list){
     list.stream().filter(t->t%2==0 & t<60).forEach(lambda01::prinEl);
}

// Functional programing ile list elemanlarının tek olanlarını veya 20 den büyük olanlarını
// aynı satırda aralarına boşluk bırakarak yazdırınız.

public static void tekYırmıdenBuyukPrint(List < Integer > list){
        list.stream().filter(t->t%2==1 || t>=20).forEach(lambda01::prinEl);
}

// Functional programing ile list elemanlarının cift olanlarını ve karelerini
// aynı satırda aralarına boşluk bırakarak yazdırınız.

public static void ciftKarePrint(List < Integer > list) {

        list.stream().filter(t->t%2==0).map(t->t*t).forEach(lambda01::prinEl);
}


    public static void ciftKarePrint1(List < Integer > list) {

        list.stream().filter(t->t%2==0).map(t->t*t).forEach(lambda01::prinEl);
    }


//Functional programing ile list elemanlarının tek olanlarının kuplerinin bir fazlasını
    // aynı satırda aralarına boşluk bırakarak yazdırınız.

public static void tekKupFazla(List < Integer > list){
        list.
                stream().
                filter(t->t%2==1).
                map(t->(t*t*t)+1).
                forEach(lambda01::prinEl);
}

//Functional programing ile list elemanlarının cift olanlarının kareköklerini
    // aynı satırda aralarına boşluk bırakarak yazdırınız.


public static void kareKokCİft(List < Integer > list){
        list.
                stream().
                filter(t->t%2==0).
                map(Math::sqrt).
                forEach(t-> System.out.println(t+ " "));
}
 //List'in en büyük elemanını yazdırınız.

public static void enBuyukPrint(List < Integer > list){
        Optional<Integer> maxEl=list.stream().reduce(Math::max);
    System.out.println(maxEl);
}

















}
