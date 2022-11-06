public class Circle implements Shape {
    double radius;
    Double area;
    public void calcArea() {
        this.area = Math.pow(radius, 2) * Math.PI;
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
