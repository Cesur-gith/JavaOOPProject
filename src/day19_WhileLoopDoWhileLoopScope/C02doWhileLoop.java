package day19_WhileLoopDoWhileLoopScope;

public class C02doWhileLoop {

    public static void main(String[] args) {



        // kullanicidan pozitif bir tamsayi alip
        // while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
                int input=5;
                int sayi=1;
                while (sayi<input){
                    System.out.println(sayi);
                    sayi++;
                }
        // Ayni soruyu do-while loop ile yapalim
                sayi=1;
                do {
                    System.out.println(sayi);
                    sayi++;
                } while (sayi<input);
            }




    }
