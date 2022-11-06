public class Triangle implements Shape {
    double base;
    double height;
    Double area;
    public void calcArea(){
        this.area = this.base * this.height / 2;
    }
    public Double getArea() {
        return area;
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
