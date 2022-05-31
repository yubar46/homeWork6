import java.util.ArrayList;

public class OrderedPair {

    public static ArrayList correction (ArrayList<Integer> arrayList){
        boolean delete = false;
        if (arrayList.size()%2!=0)arrayList.remove(arrayList.size()-1);


        for ( int i = 0 ; i<arrayList.size();i++) {
            if (delete){
                i--;
                delete=false;
            }
            if (i<arrayList.size()-1){
                if (arrayList.get(i)>arrayList.get(i+1)){
                    arrayList.remove(i);
                    arrayList.remove(i);
                    delete=true;
                }else if (i<arrayList.size()-2)  i++;
            }

        }




        return arrayList;
    }
}
