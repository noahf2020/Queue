public class Main {
    public static void main(String[] args) {
        MyDataStructure myData = new MyDataStructure();



        for (int i = 500; i < 600; i = i +1) {

            myData.put(i);
        }

        for (int i = 500; i < 600; i = i +1) {
            Object data = myData.get();
            System.out.println(data);
        }

        myData.put(102);
        myData.put(285);



        Object data1 = myData.get();
        System.out.println(data1);

        Object data2 = myData.get();
        System.out.println(data2);

    }
}