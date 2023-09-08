public class BmiService {
    public int calculate (int weight, int height) {
        int sum = height * height;
        int result = weight * 10000 / sum;
        return result;
    }
}
