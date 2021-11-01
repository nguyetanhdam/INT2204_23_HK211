public class Car extends Vehicle {
    private int numberOfDoors;

    Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        String res = "Car:" + '\n';
        res += '\t' + "Brand: " + getBrand() + '\n';
        res += '\t' + "Model: " + getModel() + '\n';
        res += '\t' + "Registration Number: " + getRegistrationNumber() + '\n';
        res += '\t' + "Number of Doors: " + numberOfDoors + '\n';
        res += '\t' + "Belongs to " + owner.getName() + " - " + owner.getAddress();
        return res;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
