public class Thermos extends Cup {

    int temperature = 22;
    final int k;

    Thermos() {
        k = 2;
    }

    Thermos(int v, int t) {
        super(v);
        k = t;

    }

    int put(int ml, int temp) {
        temperature = (temperature + temp) / 2;
        return put(ml);
    }

    void updTemp(int time) {
        this.temperature -= k * time;
        if (this.temperature < 22) {
            this.temperature = 22;
        }
    }

    @Override
    void transfusion(Cup cup, int v) {
        int a = cup.take(v);
        int b = 0;
        if (cup instanceof Thermos) {
            b = this.put(a, ((Thermos) cup).temperature);
        } else {
            b = this.put(a);
        }
        if (a > b) {
            cup.put(a - b);
        }
    }

    @Override
    public String toString() {
        return "Thermos{" + super.toString() + "temperature=" + temperature + ", k=" + k + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.temperature;
        hash = 79 * hash + this.k;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thermos other = (Thermos) obj;
        if (this.temperature != other.temperature) {
            return false;
        }
        if (this.k != other.k) {
            return false;
        }
        if (this.capasity != other.capasity) {
            return false;
        }
        if (this.max_capasity != other.max_capasity) {
            return false;
        }
        return true;
    }


}