package ph.edu.dlsu.lbycpob.formulamenu;
public class IdealGasLaw implements IFormula {
    private final String[] parameterList = {"Pressure", "Volume", "Moles", "Temperature"};
    private double pressure;    // P (Pa)
    private double volume;      // V (m^3)
    private double moles;       // n (mol)
    private double temperature; // T (K)
    private final double R = 8.314462618;

    public double getPressure() { return pressure; }
    public void setPressure(double pressure) { this.pressure = pressure; }

    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }

    public double getMoles() { return moles; }
    public void setMoles(double moles) { this.moles = moles; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public void computePressure() {
        pressure = (moles * R * temperature) / volume;
    }

    public void computeVolume() {
        volume = (moles * R * temperature) / pressure;
    }

    public void computeMoles() {
        moles = (pressure * volume) / (R * temperature);
    }

    public void computeTemperature() {
        temperature = (pressure * volume) / (moles * R);
    }

    @Override
    public double compute(String variable, String[] values) {
        if (variable == null) {
            return 0;
        }
        if (variable.equalsIgnoreCase("Pressure")) {
            volume = Double.parseDouble(values[0]);
            moles = Double.parseDouble(values[1]);
            temperature = Double.parseDouble(values[2]);
            computePressure();
            return pressure;

        } else if (variable.equalsIgnoreCase("Volume")) {
            moles = Double.parseDouble(values[0]);
            temperature = Double.parseDouble(values[1]);
            pressure = Double.parseDouble(values[2]);
            computeVolume();
            return volume;



