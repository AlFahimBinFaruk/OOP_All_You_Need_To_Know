package AbstractionInterface.BasicExmaple;

public interface MobileUser {
    // Java compiler add public ,static, final class before interface variable.
    // so,all interface variables are constant,no instance variable.
    // In interface every method is public by default.
    // public abstract void printInfo();// 1st method
    void printInfo(); // 2nd method,the compiler will turn this code into public abstract void printInfo() while compiling.
}
