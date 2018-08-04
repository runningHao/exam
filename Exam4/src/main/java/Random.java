import java.util.*;

/**
 * Created by ZhangHao on 2018/8/4.
 */
public class Random {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        Map<Integer,List<Integer>> map = new HashMap();

        System.out.println("随机生成50个小于100的数：");
        for(int i=0;i<50;i++){
            int num = rand.nextInt(100);
            list.add(num);
            System.out.print(num+" ");
        }
        System.out.println("");

        for(int i=0;i<10;i++){
            map.put(i,new ArrayList<Integer>());
        }

        for(int num : list){
            map.get(num / 10).add(num);
        }
        System.out.println("Map中的数据为："+map);

        for(int key:map.keySet()){
            Collections.sort(map.get(key));
        }
        System.out.println("排序后的Map为："+map);
    }
}
