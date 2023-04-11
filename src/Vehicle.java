public abstract class Vehicle implements Diagnostable{

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        for (int i = 1; i < this.wheelsCount+1; i++) {
            System.out.println("Меняем покрышку" + i);
        }
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем "+modelName);
        System.out.println("Список выполняемых работ: ");
        updateTyre();
    }
}
