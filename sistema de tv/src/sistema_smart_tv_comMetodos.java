public class sistema_smart_tv_comMetodos {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
      
    }
    public void dimininuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);   
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("vc mudou o canal para: " + canal);

    }
    public void diminuirCanal(){
        canal --;
        System.out.println("vc mudou o canal para: " + canal);

    }
}
