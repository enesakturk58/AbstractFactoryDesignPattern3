public class AudiFabrika implements IArabaFabrikasi{
    @Override
    public IJant jant() {
        return new AuidiJant();
    }

    @Override
    public IMotor motor() {
        return new AudiMotor();
    }

    @Override
    public ITekerlek tekerlek() {
        return new AudiTekerlek();
    }
}
