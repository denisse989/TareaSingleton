package TareaBuilder;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getComputadora() {
        return pizza;
    }

    public void createPizza(){
        pizza= new Pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoMasa();
    public abstract void buildTipoQueso();
}
