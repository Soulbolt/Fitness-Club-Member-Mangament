package JavaProject;

public interface Calculator <T extends Number>{ //generic interface to calculate fees

    double calculateFees(T clubID);
}
