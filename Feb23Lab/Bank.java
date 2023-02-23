package Feb23Lab;
public class Bank {
    public double getRateOfInterest() {
        return 0;
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println(s.getRateOfInterest());
        ICICI c = new ICICI();
        System.out.println(c.getRateOfInterest());
        AXIS a = new AXIS();
        System.out.println(a.getRateOfInterest());
    }
}

class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9.0;
    }
}
