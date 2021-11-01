public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    MotorBike(String br, String mo, String rn, Person ow, boolean hsc) {
        super(br, mo, rn, ow);
        this.hasSidecar = hsc;
    }

    @Override
    public String getInfo() {
        String res = "Motor Bike:" + '\n';
        res += '\t' + "Brand: " + getBrand() + '\n';
        res += '\t' + "Model: " + getModel() + '\n';
        res += '\t' + "Registration Number: " + getRegistrationNumber() + '\n';
        res += '\t' + "Has Side Car: " + hasSidecar + '\n';
        res += '\t' + "Belongs to " + owner.getName() + " - " + owner.getAddress();
        return res;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
