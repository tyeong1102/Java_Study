package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException. data에는 null이 들어있기 때문.
        System.out.println("bigData.data.value + " + bigData.data.value);
    }
}
