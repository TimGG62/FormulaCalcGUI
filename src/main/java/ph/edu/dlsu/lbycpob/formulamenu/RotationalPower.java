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

    public void computePower() {
        power = (2 * Math.PI * speed * torque * efficiency) / 60.0;
    }

    public void computeTorque() {
        torque = (60.0 * power) / (2 * Math.PI * speed * efficiency);
    }

    public void computeSpeed() {
        speed = (60.0 * power) / (2 * Math.PI * torque * efficiency);
    }

    public void computeEfficiency() {
        efficiency = (60.0 * power) / (2 * Math.PI * speed * torque);
    }

    @Override
    public double compute(String variable, String[] values) {
        if (variable == null) {
            return 0;
        }
        if (variable.equalsIgnoreCase("Power")) {
            torque = Double.parseDouble(values[0]);
            speed = Double.parseDouble(values[1]);
            efficiency = Double.parseDouble(values[2]);
            computePower();
            return power;

        }
        return 0;
    }

    @Override
    public String[] getParameterList() {
        return parameterList;
    }
}