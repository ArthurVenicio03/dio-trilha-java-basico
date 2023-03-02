
public class usuario {


    public static void main(String[] args) throws Exception {

        sistema_smart_tv_comMetodos  SmartTv = new sistema_smart_tv_comMetodos();
        System.out.println("Tv ligada? "+SmartTv.ligada);
        System.out.println("Qual o canal? :"+SmartTv.canal);
        System.out.println("Qual o volumo atual?: "+SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo status -> Tv ligada? "+SmartTv.ligada);
        System.out.println("------------------------------------------------------");

        SmartTv.desligar();
        System.out.println("Novo status -> Tv ligada? "+SmartTv.ligada);
        System.out.println("------------------------------------------------------");

        SmartTv.dimininuirVolume();
        SmartTv.dimininuirVolume();
        SmartTv.dimininuirVolume();
        SmartTv.dimininuirVolume();
        System.out.println("------------------------------------------------------");
        SmartTv.aumentarVolume();
        System.out.println("------------------------------------------------------");
        SmartTv.aumentarCanal();
        SmartTv.aumentarCanal();
        SmartTv.aumentarCanal();
        System.out.println("------------------------------------------------------");
        SmartTv.diminuirCanal();
        SmartTv.diminuirCanal();
        SmartTv.diminuirCanal();
    }   
    
}
