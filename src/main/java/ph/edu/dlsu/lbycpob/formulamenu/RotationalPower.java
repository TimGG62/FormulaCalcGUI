package ph.edu.dlsu.lbycpob.formulamenu;

public class RotationalPower implements IFormula {
    private final String[] parameterList = {"Power", "Torque", "Speed", "Efficiency"};
    private double power;      // P (Watts)
    private double torque;     // T (N*m)
    private double speed;      // N (RPM)
    private double efficiency; // Eff (0 to 1 ratio)

    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }

    public double getTorque() { return torque; }
    public void setTorque(double torque) { this.torque = torque; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public double getEfficiency() { return efficiency; }
    public void setEfficiency(double efficiency) { this.efficiency = efficiency; }

    @Override
    public double compute(String variable, String[] values) {
        if (variable == null) {
            return 0;
        }
        return 0;
    }

    @Override
    public String[] getParameterList() {
        return parameterList;
    }
}