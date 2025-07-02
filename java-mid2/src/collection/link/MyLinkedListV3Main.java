package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> intLIst = new MyLinkedListV3<>();
        intLIst.add(1);
        intLIst.add(2);
        intLIst.add(3);
        Integer integer = intLIst.get(0);
        System.out.println("integer = " + integer);

    }
}
