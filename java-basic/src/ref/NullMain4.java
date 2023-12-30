package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조할 값을 만들어주면 NullPointerException 안터짐
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException. data에는 null이 들어있기 때문.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
