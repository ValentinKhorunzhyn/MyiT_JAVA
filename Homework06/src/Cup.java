public class Cup {

    final int max_capasity;
    int capasity = 0;

    Cup(){
        max_capasity = 200;
    }

    Cup(int v) {
        max_capasity = v;
    }

    int put(int numb) {
        capasity += numb;
        if (capasity > max_capasity) {
            System.out.println("Cup overflow");
            numb = max_capasity - this.capasity;
            capasity = max_capasity;
        }
        return numb;
    }

    int take(int numb) {
        if (capasity - numb < 0) {
            System.out.println("Cup is empty");
            numb = capasity;
            capasity = 0;
        } else {
            capasity -= numb;
        }
        return numb;
    }

    void transfusion(Cup cup, int v) {
        int a = cup.take(v);
        int b = this.put(a);
        if(a> b)
            cup.put(a-b);
    }

    @Override
    public String toString() {
        return "Cup{" + "max_capasity = " + max_capasity + ", capasity = " + capasity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.max_capasity;
        hash = 89 * hash + this.capasity;
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
        final Cup other = (Cup) obj;
        if (this.max_capasity != other.max_capasity) {
            return false;
        }
        if (this.capasity != other.capasity) {
            return false;
        }
        return true;
    }



}