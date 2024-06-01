package BlackMa.com.lele.jiekou3;
/*乒乓球运动员:   姓名，年龄，学打乒乓球，说英语
篮球运动员:       姓名，年龄，学打篮球
乒乓球教练:       姓名，年龄，教打乒乓球，说英语
篮球教练:         姓名，年龄，教打篮球
*/
public class Test {
    public static void main(String[] args) {
        //创建运动员或教练对象
        PingPangSporter pps = new PingPangSporter("刘诗雯",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
