package targetsistemas;

/**
 *
 * @author Sayon Borges
 */
public class ProximoElemento {

    /*
    3) Descubra a lógica e complete o próximo elemento:
    a) 1, 3, 5, 7, ___
    b) 2, 4, 8, 16, 32, 64, ____
    c) 0, 1, 4, 9, 16, 25, 36, ____
    d) 4, 16, 36, 64, ____
    e) 1, 1, 2, 3, 5, 8, ____
    f) 2,10, 12, 16, 17, 18, 19, ____
     */
    public static void main(String[] args) {
        //a)
        int primeiro =1, proximo, cont=1;
        System.out.print("a) "+primeiro+", ");
        do {
            primeiro += 2;
            proximo = primeiro;
            cont++;
            System.out.print(proximo+", ");
        } while (cont < 5);
        System.out.println(" ");
        
        //b)
        int inicial =2, seguinte, ad=1;
        System.out.print("b) "+inicial+", ");
        do{
            seguinte = 2*inicial;
            inicial = seguinte; 
            ad++;
            System.out.print(seguinte+", ");
        }while (ad < 7);
        System.out.println(" ");
        
        //c)
        System.out.print("c) ");
        for (int i = 0; i < 8; i++) {
            int termo = i*i;
            System.out.print(termo+", ");
        }
        System.out.println(" ");
        
        //d)
        System.out.print("d) ");
        int quadrado=2;
        for (int i = 2; i < 11; i++) {
            if (i % 2 == 0) {
                quadrado = i*i;
                System.out.print(quadrado+", ");
            }
        }
        System.out.println(" ");
        
        //e)
        int t1=1, t2=1, t3=0;
        System.out.print("e) "+t1+", "+t2+", ");
        
        for (int i = 0; i < 5; i++) {
            t3=t1+t2;
            t1=t2;
            t2=t3;
            
            System.out.print(t3+", ");
        }
        System.out.println(" ");
        
        //f)
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, *200*"); //começam com a letra "D"
        
    }
}
