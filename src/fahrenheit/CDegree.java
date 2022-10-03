package fahrenheit;

public class CDegree {

    private float cDegrees;

    public void setDegrees(float cDegrees) {
        this.cDegrees = cDegrees;
    }

    public float getFahrenheit() {
        return 9F / 5F * cDegrees + 32;
    }

    public float getCelsius() {
        return cDegrees;
    }
}
