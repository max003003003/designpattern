package decorator_pattern;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};

    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public double getCostSize () {
        switch (size){
            case TALL: return 2.00;
            case VENTI: return 3.00;
            case GRANDE: return 2.50;
            default: return 0.00;
        }
    }
}
