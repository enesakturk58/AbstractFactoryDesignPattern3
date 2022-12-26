public class Istemci {
    IJant jant;
    IMotor motor;
    ITekerlek tekerlek;

    public Istemci(IArabaFabrikasi arabaFabrikasi){
        this.jant = arabaFabrikasi.jant();
        this.motor = arabaFabrikasi.motor();
        this.tekerlek = arabaFabrikasi.tekerlek();
    }

    public void uret(){
        tekerlek.tekerlekSec();
        motor.motorSec();
        jant.jantSec();
    }
}
