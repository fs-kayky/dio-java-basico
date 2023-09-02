public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void Exibir() {
        System.out.println("TV Ligada? " + ligada);
        System.out.println("Canal Atual? " + canal);
        System.out.println("Volume Atual? " + volume);
    }

    public void Ligar() {
        System.out.println("\nLigando sua TV...\n");
        ligada = true;
    }
}
