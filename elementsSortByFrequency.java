import java.util.*;
import java.lang.*;
import java.io.*;

class Frequency{
    int val ,fre ;
    Frequency(int val , int fre)
    {
        this.val = val;
        this.fre = fre;
    }

}
class sortByFre implements Comparator<Frequency>
{
    public int compare(Frequency f1 , Frequency f2)
    {
        return f2.fre - f1.fre ;
    }
}
class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
       
        for(int i =0; i<t ; i++)
        {
         HashMap <Integer , Integer> tmap = new HashMap <Integer,Integer>();
         List <Frequency> list = new ArrayList<Frequency>();
         int x ;
            int n = sc.nextInt();
            for(int j = 0 ; j < n;j++)
            {
                x = sc.nextInt();
                if(tmap.containsKey(x))
                {
                    tmap.put(x , tmap.get(x)+1);
                    continue;
                }
                tmap.put(x,1);
            }
           // System.out.println(tmap);
            Set set = tmap.entrySet();
            Iterator itr = set.iterator();
            while(itr.hasNext())
            {
                Map.Entry me = (Map.Entry) itr.next();
                list.add(new Frequency((Integer) me.getKey() ,(Integer) me.getValue()));
            }
            //System.out.println(list);
            Collections.sort(list , new sortByFre());

            for(int j=0;  j<list.size(); j++){
                while(list.get(j).fre!=0){
                    System.out.print(list.get(j).val+" ");
                    list.get(j).fre--;
                }
            }
             System.out.println();
        }


    }
}
