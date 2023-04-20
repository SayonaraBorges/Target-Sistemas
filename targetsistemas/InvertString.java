package targetsistemas;

/**
 *
 * @author Sayon Borges
 */
public class InvertString {

    /*
    5) Escreva um programa que inverta os caracteres de um string.
    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua
    preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;
     */
    public static void main(String[] args) {
        String texto = "TarguetSistemas";
        System.out.println(texto);
        char[] ch = texto.toCharArray(); 
        //Convertendo a string em um array de caracteres 
        //com mesmo tamanho do comprimento da string
        int inicio = 0;
        int fim = ch.length - 1;
        char temp;
        while (fim > inicio) {
            temp = ch[inicio]; //variável temporaria recebe o caractere na posição 0
            ch[inicio] = ch[fim]; //a posição 0 do array recebe a ultima posição do array
            ch[fim] = temp; // a ultima posição do array recebe a variável temporaria
            fim--;
            inicio++;
        }
        texto = new String(ch);
        System.out.println(texto);
    }
}
