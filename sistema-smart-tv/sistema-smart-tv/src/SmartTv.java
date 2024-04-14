public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if(volume <= 100){
            volume ++;
        }
        else{
            volume = 100;
        }
       
    }

    public void abaixarVolume(){
        if(volume > 0){
            volume --;
        }
        else{
            volume = 0;
        }
    }


    public void aumentarCanal(){
        if(canal < 40){
            canal ++;
        }
        else{
            canal = 0;
        }       
    }

    public void diminuirCanal(){
        if(canal > 0){
            canal--;
        }
        else{
            canal = 40;
        }       
    }

    public void mudarCanal(int numCanal){
        if (numCanal>=0 && numCanal<=40){
            canal = numCanal;
        }
    }


}
