public class Rectangle implements Shape {
    double aSide;
    double bSide;
    Double area;
    public void calcArea() {
        this.area = aSide * bSide;
    }
    public Double getArea() {
        return this.area;
    }
    public boolean isGoodInput(String input) {
        boolean good = true;
        String sample = "[0-9]+";
        boolean isGoodSample = input.matches(sample);
        if (isGoodSample) {
            Double num = Double.parseDouble(input);
            if ( num <= 0) {
                good = false;
            }
        }else {
            good = false;
        }
        return good;
    }
}
