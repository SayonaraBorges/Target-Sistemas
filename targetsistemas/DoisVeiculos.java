package targetsistemas;

/**
 *
 * @author Sayon Borges
 */
public class DoisVeiculos {

    /*
    4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades 
    opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, 
    a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a 
    Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem 
    na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

    IMPORTANTE:
    a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
    b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais 
    para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
    c) Explique como chegou no resultado.
     */
    //Fonte: https://brainly.com.br/tarefa/53120464
    public static void main(String[] args) {
        //dados iniciais
        double velcarro =110;
        double velcaminhao =80;
        int tempohora =1;
        int tempominutos =60;
        double distanciatotal =100;
        double cruzamento =0;
        
        //dados de referência 
        double carro = velcarro * tempohora;
        double caminhao = distanciatotal - (velcaminhao * tempohora);
        
        //tempo total de viagem do caminhão desconsiderando pedágio
        double tempoviagemcaminhao = 100/80d; 
        //tempo total de viagem do caminhão considerando pedágio
        double tempopedagio = ((2*5d)/tempominutos)+tempoviagemcaminhao;
        //dado de referência atualizado
        velcaminhao = distanciatotal/tempopedagio;
        
        //Portanto
        cruzamento = (velcarro*distanciatotal)/(velcarro+velcaminhao);
        System.out.println("Essa é a distância a partir de Ribeirão Preto em "
                + "que o carro e o caminhão se cruzam: ");
        System.out.println(cruzamento+"Km");
        
        
    }
}
