public class MyDataStructure implements DataStructure{
    Object[] objects = new Object[100];
    int NextLocationPut = 0;
    int NextGetLocation = 0;

    //field for space left





    public boolean put(Object obj){
        if(!(NextLocationPut>=100)){
            System.out.println("From Put: " + NextLocationPut);
            objects[NextLocationPut] = obj;
            NextLocationPut = NextLocationPut + 1;
        }else{
            return false;

        }
        return false;
    }

    public Object get() {
        if (NextGetLocation < 100) {
            Object jawny = objects[NextGetLocation];
            if (!(jawny == null)) {
                NextGetLocation = NextGetLocation + 1;
                return jawny;
            }
        } else {
            return false;
        }
    return false;
    }
}
