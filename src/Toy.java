public class Toy implements Comparable<Toy>{
    private int id;
    private  String name;
    private float freq;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getFreq() {
        return freq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

    public Toy(int id, String name, float freq) {
        this.id = id;
        this.name = name;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "id=" + Integer.toString(this.id) + ", name=" +
                this.name + ", freq=" +
                Float.toString(this.freq);
    }

    @Override
    public int compareTo(Toy o) {
        return Float.compare(this.freq, o.freq);
    }
}
