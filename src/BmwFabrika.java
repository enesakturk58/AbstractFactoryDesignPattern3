public class BmwFabrika implements IArabaFabrikasi{
    @Override
    public IJant jant(){
        return new BmwJant();
    }
    @Override
    public ITekerlek tekerlek(){
        return new BmwTekerlek();
    }
    @Override
    public IMotor motor(){
        return new BmwMotor();
    }
}
