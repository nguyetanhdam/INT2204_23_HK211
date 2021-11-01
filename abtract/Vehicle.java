public abstract class Vehicle extends Person {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    Vehicle(String brand, String model, String registrationNumber, Person owner) {
        super(owner.getName(), owner.getAddress());
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * abtract String.
     */
    public abstract String getInfo();

    /**
     * chuyển thông tin của người dùng.
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
