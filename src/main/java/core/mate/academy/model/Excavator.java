package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private String model;
    private double bucketCapacity;
    private int operatingWeight;

    public Excavator() {
    }

    public Excavator(String model, double bucketCapacity, int operatingWeight) {
        this.model = model;
        this.bucketCapacity = bucketCapacity;
        this.operatingWeight = operatingWeight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
