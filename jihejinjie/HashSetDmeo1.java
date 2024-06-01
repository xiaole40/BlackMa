package BlackMa.com.lele.jihejinjie;

public class HashSetDmeo1 {
    public static void main(String[] args) {
        /*
         *   哈希表：
         *       对象的整数表现形式：
         *           1.如果没有重写hashCode方法，计算出的哈希值是不同的
         *           2.如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
         *           3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样（哈希碰撞）
         *
         * */
        //1.创建对象
        HashSetStudent s1 = new HashSetStudent("zhangsan",23);
        HashSetStudent s2 = new HashSetStudent("zhangsan",23);
        HashSetStudent s3 = new HashSetStudent("lisi",24);

        //2.如果没有重写hashCode方法，计算出的哈希值是不同的
        System.out.println(s1.hashCode());//-1461067292
        System.out.println(s2.hashCode());//-1461067292
        System.out.println(s3.hashCode());//102983078

        //但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样（哈希碰撞）
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354

    }

}
