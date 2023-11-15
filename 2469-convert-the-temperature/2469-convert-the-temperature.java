class Solution {
    public double[] convertTemperature(double celsius) {
        double[] convert = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        convert[0] = kelvin;
        convert[1] = fahrenheit;

        return convert;
    }
}