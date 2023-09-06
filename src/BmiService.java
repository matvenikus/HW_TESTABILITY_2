public class BmiService {
    public int calculate (int a, int b) {
        int c = b * b;
        int result = a * 10000 / c;
        return result;
    }
}
