public class MercedesFabrika implements IArabaFabrikasi{
    @Override
    public ITekerlek tekerlek(){
        return new MercedesTekerlek();
    }
    @Override
    public IMotor motor(){
        return new MercedesMotor();
    }
    @Override
    public IJant jant(){
        return new MercedesJant();
    }
}
